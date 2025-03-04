package dao;

import model.CompteClient;

import java.sql.*;

public class CompteDAO {
    public static void ajouterCompte(CompteClient compte) {
        String sql = "INSERT INTO compte (titulaire, solde) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, compte.getTitulaire());
            stmt.setDouble(2, compte.getSolde());

            stmt.executeUpdate();
            System.out.println("Compte ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void afficherComptes() {
        String sql = "SELECT * FROM compte";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Titulaire: " + rs.getString("titulaire") +
                        ", Solde: " + rs.getDouble("solde"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void supprimerCompte(int id) {
        String sql = "DELETE FROM compte WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Compte supprimé !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


package dao;

import model.Banque;

import java.sql.*;

public class BanqueDAO {
    public static void ajouterBanque(Banque banque) {
        String sql = "INSERT INTO banque (nom, adresse) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, banque.getNom());
            stmt.setString(2, banque.getAdresse());

            stmt.executeUpdate();
            System.out.println("Banque ajoutée avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


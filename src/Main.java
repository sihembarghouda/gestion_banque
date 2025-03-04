import dao.CompteDAO;
import dao.BanqueDAO;
import model.CompteClient;
import model.Banque;

public class Main {
    public static void main(String[] args) {
        // Ajouter une banque
        Banque banque1 = new Banque(1, "Banque Centrale", "Paris");
        BanqueDAO.ajouterBanque(banque1);

        // Ajouter des comptes
        CompteClient compte1 = new CompteClient(0, "Alice", 1500.0);
        CompteClient compte2 = new CompteClient(0, "Bob", 2500.0);
        CompteDAO.ajouterCompte(compte1);
        CompteDAO.ajouterCompte(compte2);

        // Afficher les comptes
        CompteDAO.afficherComptes();

        // Supprimer un compte (exemple)
        CompteDAO.supprimerCompte(1);
    }
}

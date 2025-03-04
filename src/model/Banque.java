package model;

import java.util.ArrayList;
import java.util.List;

public class Banque {
    private int id;
    private String nom;
    private String adresse;
    private List<CompteClient> comptes;

    public Banque(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }

    public void ajouterCompte(CompteClient compte) {
        comptes.add(compte);
    }

    public void afficherComptes() {
        for (CompteClient compte : comptes) {
            System.out.println(compte);
        }
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}


package model;

public class CompteClient {
    private int id;
    private String titulaire;
    private double solde;

    public CompteClient(int id, String titulaire, double solde) {
        this.id = id;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public int getId() { return id; }
    public String getTitulaire() { return titulaire; }
    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    @Override
    public String toString() {
        return "CompteClient{" +
                "id=" + id +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }
}


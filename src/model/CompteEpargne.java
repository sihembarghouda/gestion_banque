package model;

public class CompteEpargne extends CompteClient {
    private double benifice;

    public CompteEpargne(int id, String titulaire, double solde, double benifice) {
        super(id, titulaire, solde);
        this.benifice = benifice;
    }

    public double getBenifice() { return benifice; }
    public void setBenifice(double benifice) { this.benifice = benifice; }

    @Override
    public String toString() {
        return super.toString() + ", benifice=" + benifice + "}";
    }
}


package fr.diginamic.propre.ex2;

public class CompteCourant extends CompteBancaire implements CompteOperation {
    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        super(TypeCompte.COMPTE_COURANT, solde);
        this.decouvert = decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    @Override
    public void debiterMontant(double montant) {
        if (getSolde() - montant >= decouvert) {
            setSolde(getSolde() - montant);
        }
    }

    @Override
    public void appliquerRemuAnnuelle() {
        // Compte courant n'a pas de rémunération
    }
}
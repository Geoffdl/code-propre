package fr.diginamic.propre.ex2;


public abstract class CompteBancaire
{

    private double solde;
    private final TypeCompte typeCompte;

    public CompteBancaire(TypeCompte typeCompte, double solde)
    {

        this.typeCompte = typeCompte;
        this.solde = solde;

    }

    public void ajouterMontant(double montant)
    {
        this.solde += montant;
    }

    public double getSolde()
    {
        return solde;
    }

    public void setSolde(double solde)
    {
        this.solde = solde;
    }

    public String getType()
    {
        return typeCompte.label;
    }

}
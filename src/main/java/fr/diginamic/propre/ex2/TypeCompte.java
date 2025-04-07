package fr.diginamic.propre.ex2;

public enum TypeCompte
{
    COMPTE_COURANT("CC"),
    LIVRET_A("LA");

    String label;

    TypeCompte(String label)
    {
        this.label = label;
    }
}
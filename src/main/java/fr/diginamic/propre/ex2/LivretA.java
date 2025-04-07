package fr.diginamic.propre.ex2;

public class LivretA extends CompteBancaire implements CompteOperation {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(TypeCompte.LIVRET_A, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant >= 0) {
			setSolde(getSolde() - montant);
		}
	}

	@Override
	public void appliquerRemuAnnuelle() {
		double solde = getSolde();
		setSolde(solde + solde * tauxRemuneration / 100);
	}
}
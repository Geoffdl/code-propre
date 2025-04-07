package fr.diginamic.propre.ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {
	private final List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		for (TypeCaisse type : TypeCaisse.values()) {
			caisses.add(new Caisse(type));
		}
	}

	/**
	 * Ajoute un item dans la caisse appropriée selon son poids
	 *
	 * @param item l'item à ajouter
	 * @return true si l'item a été ajouté, false si aucune caisse ne peut
	 *         l'accepter
	 */
	public boolean addItem(Item item) {
		for (Caisse caisse : caisses) {
			if (caisse.ajouterItem(item)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retourne le nombre total d'items dans l'inventaire
	 *
	 * @return le nombre total d'items
	 */
	public int quantiteCaisses() {
		int total = 0;
		for (Caisse caisse : caisses) {
			total += caisse.nombreItems();
		}
		return total;
	}

	/**
	 * Retourne la liste des caisses
	 *
	 * @return la liste des caisses
	 */
	public List<Caisse> getCaisses() {
		return caisses;
	}
}
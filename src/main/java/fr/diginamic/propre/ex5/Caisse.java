package fr.diginamic.propre.ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {
	private final TypeCaisse type;
	private List<Item> items;

	/**
	 * Constructeur
	 *
	 * @param type type de caisse
	 */
	public Caisse(TypeCaisse type) {
		this.type = type;
		this.items = new ArrayList<>();
	}

	/**
	 * Vérifie si la caisse peut accepter l'item en fonction de son poids
	 *
	 * @param item l'item à vérifier
	 * @return true si l'item peut être accepté, false sinon
	 */
	public boolean peutAccepter(Item item) {
		return type.peutContenir(item);
	}

	/**
	 * Ajoute un item à la caisse si son poids le permet
	 *
	 * @param item l'item à ajouter
	 * @return true si l'item a été ajouté, false sinon
	 */
	public boolean ajouterItem(Item item) {
		if (peutAccepter(item)) {
			items.add(item);
			return true;
		}
		return false;
	}

	/**
	 * Getter pour le nom de la caisse
	 *
	 * @return le nom de la caisse
	 */
	public String getNom() {
		return type.getNom();
	}

	/**
	 * Getter pour la liste des items
	 *
	 * @return la liste des items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Retourne le nombre d'items dans la caisse
	 *
	 * @return le nombre d'items
	 */
	public int nombreItems() {
		return items.size();
	}
}
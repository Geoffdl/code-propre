package fr.diginamic.propre.ex5;



public enum TypeCaisse {


      PETITE("Petits objets", 0, 5),
      MOYENNE("Moyens objets", 5, 20),
      GRANDE("Grands objets", 20, Integer.MAX_VALUE);

      private final String nom;
      private final int poidsMin;
      private final int poidsMax;

      TypeCaisse(String nom, int poidsMin, int poidsMax) {
            this.nom = nom;
            this.poidsMin = poidsMin;
            this.poidsMax = poidsMax;
      }

      public String getNom() {
            return nom;
      }

      public boolean peutContenir(Item item) {
            int poids = item.getPoids();
            return poids >= poidsMin && poids < poidsMax;
      }
}
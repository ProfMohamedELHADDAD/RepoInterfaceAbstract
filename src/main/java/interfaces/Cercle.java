package interfaces;

/**
 * Classe Cercle implémente l'interface forme
 * Ayant comme attribut rayon
 */
public class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    @Override
    public  String quiSuisJe() {
        return "Cercle";

    }
}

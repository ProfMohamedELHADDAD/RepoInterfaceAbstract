package Cours;
/**
 * Classe  représentant un rectangle
 * Cette classe est une sous classe de Figure.
 */
public class Rectangle extends Figure {
    protected double longueur, largeur;

    public Rectangle(double l, double L) {
        super("Rectangle");
        this.longueur = l;
        this.largeur = L;
    }
    public double surface() { return longueur * largeur; }
    public double perimetre() { return 2 * (longueur + largeur); }
}


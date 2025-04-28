package interfaces;

class Rectangle implements Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    @Override
    public double surface() {
        return largeur * hauteur;
    }
    @Override
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
    @Override
    public String quiSuisJe() {
        return "Rectangle";
    }
}

package Cours;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(double rayon) {
        super("Cercle");
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}


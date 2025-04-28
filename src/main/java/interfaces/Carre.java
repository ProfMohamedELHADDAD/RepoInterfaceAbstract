package interfaces;

class Carre extends Rectangle {
    public Carre(double cote) {
        super(cote, cote);  // Un carré est un rectangle avec largeur = hauteur
    }

    @Override
    public String quiSuisJe() {
        return "Carre";
    }
}

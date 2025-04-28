package interfaces;

/**
 * Interface représentant une forme géométrique.
 * Cette interface définit les opérations de base que toute forme géométrique doit implémenter.
 * Elle permet de manipuler différentes formes de manière uniforme grâce au polymorphisme.
 */
public interface Forme {
    /**
     * Calcule la surface de la forme.
     * @return la surface de la forme en unités carrées
     */
    double surface();

    /**
     * Calcule le périmètre de la forme.
     * @return le périmètre de la forme en unités linéaires
     */
    double perimetre();

    /**
     * Retourne une description de la forme.
     * Cette méthode par défaut peut être surchargée par les classes qui implémentent l'interface
     * pour fournir une description plus spécifique.
     * @return une chaîne de caractères décrivant la forme
     */
    default String quiSuisJe() {
        return "Forme";
    }
}

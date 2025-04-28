package Cours;
/**
 * Classe abstraite représentant une figure géométrique.
 * Cette classe sert de base pour différentes formes géométriques.
 */
public abstract class Figure {
    /** Le nom de la figure */
    /**
     * Le modificateur 'protected' permet l'accès à cette variable :
     * - Dans la classe elle-même
     * - Dans toutes les classes du même package
     * - Dans toutes les classes filles (héritage), même si elles sont dans un package différent
     */
    protected String name;
    /**
     * Constructeur de la classe Figure.
     * @param name Le nom de la figure
     */
    public Figure(String name) {
        this.name = name;
    }
    /**
     * Méthode abstraite qui calcule la surface de la figure.
     * Cette méthode doit être implémentée par toutes les classes filles.
     * La surface représente l'aire totale occupée par la figure.
     * @return La surface de la figure en unités carrées
     */
    public abstract double surface();
    /**
     * Méthode abstraite qui calcule le périmètre de la figure.
     * Cette méthode doit être implémentée par toutes les classes filles.
     * Le périmètre représente la longueur totale du contour de la figure.
     * @return Le périmètre de la figure en unités linéaires
     */
    public abstract double perimetre();
}

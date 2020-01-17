package exercices;

public class Rectangle {
    public Double Longueur;
    public Double Largeur;


    public Rectangle( double L, double l){
        this.Longueur = L;
        this.Largeur = l;
    }
    public double surface () {

        return this.Longueur * this.Largeur;
    }
    public void afficher () {
        System.out.println("La surface du rectangle est : " + this.surface());
    }
}
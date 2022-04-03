import java.util.ArrayList;
public class Traitement {
    public static void main(String[] args) {
//Liste
        ArrayList<Produit> listeProduits = new ArrayList<Produit>();
        Produit prod1 = new Produit(1, "Masque", 90, 9.99, 50);
        Produit prod2 = new Produit(2, "Maquillage", 50, 4.50, 100);
        //prod1.setCode(2);
        listeProduits.add(prod1);
        System.out.println("Valeur du produit ≃ " +prod1.calculerValeurStock());
        System.out.println("Quantité stock a-t-elle atteint stock de sécurité? "+prod1.Alerte());
        System.out.println(prod1.Donnees());

    }
}
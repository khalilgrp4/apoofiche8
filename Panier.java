import java.util.ArrayList;
import java.util.Iterator;


public class Panier {
    private ArrayList<Produit> produits;
    private final static int NOMBREMAX_PRODUITS = 10;

    public Panier(){
        produits = new ArrayList<Produit>();
    }

    public boolean ajouter(Produit p) throws PanierPleinException{
        if (p==null){
            throw new IllegalArgumentException("paramètre invalide");
        }
        if (produits.size()>=NOMBREMAX_PRODUITS)
            throw new PanierPleinException("panier plein");


        return produits.add(p);
    }
    public boolean remove(Produit p) throws ProduitNonPresentException{
        if (p == null)
            throw new IllegalArgumentException("paramètre invalide");
        if (!(produits.contains(p)))
            throw new ProduitNonPresentException("produit non présent");
        return produits.remove(p);
    }

    public int nbrProduits(){
        return produits.size();
    }

    public double calculerPrix(){
        double prix = 0;
        for (Produit produit : produits) {
            prix += produit.getPrix();
        }
        return prix;
    }

    @Override
    public String toString() {
        return "Panier : "+ produits;
    }

    public Iterator<Produit> iterator(){
        return this.produits.iterator() ;
    }

    public Produit retrouverProduit(String reference) throws ProduitNonPresentException{
        if (reference==null|| reference=="")
            throw new IllegalArgumentException("paramètre invalide");
        for (Produit produit : produits) {
            if (produit.getReference().equals(reference)){
                return produit;
            }
        }
        throw new ProduitNonPresentException("produit non présent");
    }


}

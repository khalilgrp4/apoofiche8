public class Cd extends Produit{
    private String artiste;
    private int nbrmorceau;

    public Cd(String titre, String reference, double prix, String artiste, int nbrmorceau) {
        super(titre, reference, prix);
        this.artiste = artiste;
        this.nbrmorceau = nbrmorceau;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNbrmorceau() {
        return nbrmorceau;
    }

    @Override
    public String toString() {
        return "Cd de l'artiste "+ artiste +" avec "+ nbrmorceau + " morceau(x)";
    }
}

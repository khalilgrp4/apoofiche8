public class Livre extends Produit{
    private String auteur;
    private int nbrPage;

    public Livre(String titre, String reference, double prix, String auteur, int nbrPage) {
        super(titre, reference, prix);
        this.auteur = auteur;
        this.nbrPage = nbrPage;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    @Override
    public String toString() {
        return "Livre de " +auteur +" qui contient "+nbrPage+" pages";
    }


}

public class Dvd extends Produit{
    private String realisateur;

    public Dvd(String titre, String reference, double prix, String realisateur) {
        super(titre, reference, prix);
        this.realisateur = realisateur;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return "Dvd de "+ realisateur ;
    }
}

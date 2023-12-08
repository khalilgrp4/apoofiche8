public class TestPanier {
    public static void main(String[] args) {
        Panier panier = new Panier();
        Livre livre1 = new Livre("les fleurs du mal","123",12.90,"Khalil",100);
        try {
            System.out.println(panier.remove(livre1));
        }catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(panier.remove(null));
        }catch (ProduitNonPresentException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println(panier.retrouverProduit("123"));
        }catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(panier.retrouverProduit(null));
        }catch (ProduitNonPresentException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(panier.ajouter(null));
        }catch (PanierPleinException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(panier.ajouter(livre1));
        }catch (PanierPleinException e){
            e.printStackTrace();
        }

        try{
            System.out.println(panier.retrouverProduit("1234"));
        }catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(panier.retrouverProduit("123"));
        }catch (ProduitNonPresentException e){
            e.printStackTrace();
        }
        try{
            System.out.println(panier.retrouverProduit(""));
        }catch (ProduitNonPresentException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Cd cd1 = new Cd("Solitaire","12",12.90,"Khalil",3);

        try{
            System.out.println(panier.remove(cd1));
        }catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(panier.ajouter(cd1));
        }catch (PanierPleinException e){
            System.out.println(e.getMessage());
        }

        Livre livre2 = new Livre("Le renard","123",12.99,"Khalil",120);

        try{
            System.out.println(panier.remove(livre2));
        }catch (ProduitNonPresentException e){
            e.printStackTrace();
        }

        System.out.println(panier);

        Dvd dvd1 = new Dvd("wa hassan","69",13.00,"Naps");
        Dvd dvd2 = new Dvd("wa hassan","69",13.00,"SDM");
        Dvd dvd3 = new Dvd("wa hassan","69",13.00,"Timal");
        Dvd dvd4 = new Dvd("wa hassan","69",13.00,"D&D");
        Dvd dvd5 = new Dvd("wa hassan","69",13.00,"Ninho");
        Dvd dvd6 = new Dvd("wa hassan","69",13.00,"Niaks");
        Dvd dvd7 = new Dvd("wa hassan","69",13.00,"Booba");
        Dvd dvd8= new Dvd("wa hassan","69",13.00,"Niska");
        Dvd dvd9 = new Dvd("wa hassan","69",13.00,"Shay");

        try{
            panier.ajouter(dvd1);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }
        try{
            panier.ajouter(dvd2);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }

        try{
            panier.ajouter(dvd3);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }
        try{
            panier.ajouter(dvd4);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }
        try{
            panier.ajouter(dvd5);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }
        try{
            panier.ajouter(dvd6);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }
        try{
            panier.ajouter(dvd7);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }

        try{
            panier.ajouter(dvd8);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }

        try{
            panier.ajouter(dvd9);
        }catch (PanierPleinException e){
            e.printStackTrace();
        }

        try{
            System.out.println(panier.ajouter(livre1));
        }catch (PanierPleinException e){
            System.out.println(e.getMessage());;
        }

        System.out.println(panier);















    }
}

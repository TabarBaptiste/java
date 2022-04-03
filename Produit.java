public class Produit {
//Attributs
    private int code;
    private String nom;
    private int quantite;
    private double prixU;
    private int stockSecu;

//Constructeurs
    public Produit(int code, String nom, int quantite, double prixU, int stockSecu) {
        this.code = code;
        this.nom = nom;
        this.quantite = quantite;
        this.prixU = prixU;
        this.stockSecu = stockSecu;
    }

//GUETTUERS SETTERS
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixU() {
        return prixU;
    }

    public void setPrixU(double prixU) {
        this.prixU = prixU;
    }

    public int getStockSecu() {
        return stockSecu;
    }

    public void setStockSecu(int stockSecu) {
        this.stockSecu = stockSecu;
    }

//Methodes
    public void MajApprovi(int approvi){
        this.quantite += approvi;
    }
    public void MajVente(double nbVente){
        this.quantite += nbVente;
    }

    public double calculerValeurStock(){
        return this.quantite * this.prixU;
    }
    public boolean Alerte(){
        if (this.quantite <= this.stockSecu)
           // System.out.println("Le stock de sécurité a été atteint");
        return true;
        else
            return true;
    }
    public String Donnees(){
        System.out.println("Code produit: "+code);
        System.out.println("Nom: "+nom);
        System.out.println("Quantité: "+quantite);
        System.out.println("Prix unitaire: "+prixU);
        System.out.println("Stock de sécurité: "+stockSecu);
        return "";
    }

}
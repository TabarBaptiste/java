public class Categorie {
    //Attributs
    private int code;
    public String nom;

//Constructeur
    public Categorie(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

//GETTERS SETTERS
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

}

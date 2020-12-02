import java.util.ArrayList;

public class Client {



    //region attribus privés
    private String nom;
    private String prenom;
    private String adresse;
    private String codepostale;
    private String telephone;
    private String email;
    private String datenaissance;
    private ArrayList<Compte> listeCompte = new ArrayList<Compte>
    //endregion

    //region Constructeur
    public Client(String nom, String prenom, String adresse, String codepostale, String telephone, String email, String datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codepostale = codepostale;
        this.telephone = telephone;
        this.email = email;
        this.datenaissance = datenaissance;
    }

    //endregion

    //region Accesseurs en Lecture
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTéléphone() {
        return telephone;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public String getCodepostale() {
        return codepostale;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    //endregion

    //region Accesseurs en Ecriture
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTéléphone(String téléphone) {
        this.telephone = téléphone;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public void setCodepostale(String codepostale) {
        this.codepostale = codepostale;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //endregion


    //region Fonctions
    public String toString(){
        String UnClient;
        UnClient =( " Nom : " + nom + " Prenom : " + prenom + " Adresse : " + adresse + " Telephone : " + telephone + "Date de naissance" + datenaissance);
        return UnClient;
    }
    //endregion


}

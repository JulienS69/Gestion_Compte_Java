public class Client {


    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String datenaissance;


    public Client(String nom, String prenom, String adresse, String téléphone, String datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = téléphone;
        this.datenaissance = datenaissance;
    }

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

    public String toString(){
        String UnClient;
        UnClient =( " Nom : " + nom + " Prenom : " + prenom + " Adresse : " + adresse + " Telephone : " + telephone + "Date de naissance" + datenaissance);
        return UnClient;
    }


}

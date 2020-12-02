
	/*Classe Client.
        Auteur : B. CHATAING.
        Date de création 03/02/2020
		Date de modification :
        Cette classe permet de créer un compte et de le gérer facilement,
        il est possible de déposer ou de retirer de l'argent du compte.
        */
/// <summary>
/// Classe Client. Modélise un client de la banque.
/// </summary>

import java.util.ArrayList;

public class Client {


    private String _numero;
    private String _nom;
    private String _prenom;
    private String _rue;
    private String _codePostal;
    private String _ville;
    private String _mobile;
    private String _email;
    private ArrayList<Compte> listeCompte;

    public Client(String numero, String nom, String prenom, String rue, String codePostal, String ville, String mobile, String email) {
        _numero = numero;
        _nom = nom;
        _prenom = prenom;
        _rue = rue;
        _codePostal = codePostal;
        _ville = ville;
        _mobile = mobile;
        _email = email;
        listeCompte = new ArrayList<Compte>();
    }

    public String get_numero() {
        return _numero;
    }

    public void set_numero(String _numero) {
        this._numero = _numero;
    }

    public String get_nom() {
        return _nom;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public void set_prenom(String _prenom) {
        this._prenom = _prenom;
    }

    public String get_rue() {
        return _rue;
    }

    public void set_rue(String _rue) {
        this._rue = _rue;
    }

    public String get_codePostal() {
        return _codePostal;
    }

    public void set_codePostal(String _codePostal) {
        this._codePostal = _codePostal;
    }

    public String get_ville() {
        return _ville;
    }

    public void set_ville(String _ville) {
        this._ville = _ville;
    }

    public String get_mobile() {
        return _mobile;
    }

    public void set_mobile(String _mobile) {
        this._mobile = _mobile;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void AjouterCompte(Compte compte){
        listeCompte.add(compte);
    }

    public void RetirerCompte(Compte compte){
        listeCompte.remove(compte);
    }

    public void transfererArgent(Compte compte1, Compte compte2, Double montant){
        compte1.deposer(montant);
        compte2.retirer(montant);
    }

    @Override
    public String toString() {
        return "Client" +
                "_numero='" + _numero + '\'' +
                ", _nom='" + _nom + '\'' +
                ", _prenom='" + _prenom + '\'' +
                ", _rue='" + _rue + '\'' +
                ", _codePostal='" + _codePostal + '\'' +
                ", _ville='" + _ville + '\'' +
                ", _mobile='" + _mobile + '\'' +
                ", _email='" + _email + '\'' +
                ", listeCompte=" + listeCompte;
    }
}

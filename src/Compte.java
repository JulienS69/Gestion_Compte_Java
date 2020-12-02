

import java.util.StringJoiner;

/**
 * Classe Compte.
 * permet de créer un compte et de le gérer :
 * déposer ou retirer de l'argent du compte.
 * @author : B. CHATAING.
 * created on  08/11/2020
 * modified on 09/11/2020
 */

public class Compte {
    //region Attributs privés
    /**
     * Attributs privés.
     * _numero : le numéro du compte.
     * _nomTitulaire : le nom du titulaire du compte.
     * _solde : le solde du compte.
     */
    String _numero;
    String _nomtitulaire;
    double _solde;
    //endregion

    //region Constructeur
    public Compte(String numero,String Titulaire, double solde){
        _numero = numero;
        _nomtitulaire = Titulaire;
        _solde = solde;

    }
    //endregion

    //region Accesseurs en Lecture
    public String get_numero(){

        return _numero;
    }



    public String get_nomTitulaire(){
        return _nomtitulaire;
    }


    public double get_solde(){
        return _solde;
    }
    //endregion

    //region Procédures
    public void deposer(double montant){
        _solde = _solde + montant;
    }


    public void retirer(double montant){
        _solde = _solde - montant;
    }
    //endregion

    //region Fonction
    public String toString(){
        String UnCompte;
        UnCompte = ("Compte : "+ _numero + " Titulaire : "+ _nomtitulaire+ " Solde : "+ _solde);
        return UnCompte;
    }
    //endregion
}

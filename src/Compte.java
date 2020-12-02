

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
    /**
     * Attributs privés.
     * _numero : le numéro du compte.
     * _nomTitulaire : le nom du titulaire du compte.
     * _solde : le solde du compte.
     */
    String _numero;
    String _nomtitulaire;
    double _solde;


    /**
     * Constructeur.
     * Crée une instance de compte bancaire.
     * @param numero : le numéro du compte.
     * @param nomTitulaire : le nom du titulaire.
     * @param solde : le solde du compte à sa création.
     */


    public Compte(String numero,String Titulaire, double solde){
        _numero = numero;
        _nomtitulaire = Titulaire;
        _solde = solde;

    }

    /**
     * Accesseur en lecture.
     * @return : le numéro du compte.
     */

    public String get_numero(){
        return _numero;
    }



    /**
     * Accesseur en lecture.
     * @return : le nom du titulaire.
     */

    public String get_nomTitulaire(){
        return _nomtitulaire;
    }


    /**
     * Accesseur en lecture.
     * @return : le solde du compte.
     */

    public double get_solde(){
        return _solde;
    }

    /**
     * Dépose un montant sur le compte.
     * Le solde est mis à jour.
     * @param montant : de type double. Représente le montant déposé sur le compte.
     */

    public void deposer(double montant){
        _solde = _solde + montant;
    }


    /**
     * Retire un montant du compte.
     * Le solde est mis à jour
     * @param montant : de type double. Représente le montant à retirer.
     */

    public void retirer(double montant){
        _solde = _solde - montant;
    }

    /**
     * Rend le compte sous forme textuelle.
     * @return : l'objet courant Compte au format String.
     */

    public String toString(){
        String UnCompte;
        UnCompte = ("Compte : "+ _numero + " Titulaire : "+ _nomtitulaire+ " Solde : "+ _solde);
        return UnCompte;
    }
}

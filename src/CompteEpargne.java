import java.util.StringJoiner;

public class CompteEpargne extends Compte
{

    private double tauxInterets;

    public CompteEpargne(String numero, String Titulaire, double solde, double tauxInterets) {
        super(numero, Titulaire, solde);
        this.tauxInterets = tauxInterets;
    }

    public double getTauxInterets() {
        return tauxInterets;
    }

    public void setTauxInterets(double tauxInterets) {
        this.tauxInterets = tauxInterets;
    }

    public void caculTauxInterets(double tauxInterets){
        this.tauxInterets = this._solde * this.tauxInterets;
    }

    @Override
    public String toString(){
        String UnCompteEpargne;
        UnCompteEpargne =( " Numero : " + _numero + " Nom_Titulaire : " + _nomtitulaire + " Solde : " + _solde + " Taux Interets : " + tauxInterets);
        return UnCompteEpargne;
    }

}

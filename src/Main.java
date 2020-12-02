
    public class Main {

    public static void main (String[]args){
        Client UnClient = new Client ("1", "SEUX", "Julien", "10 rue des eaux vives", "38090", "Villefontaine", "0606914210", "julien.seux69@gmail.com");
        Compte UnCompte = new Compte("1", "SEUX", 50);
        Compte UnCompte2 = new Compte("2", "SEUX", 58956);
        UnClient.AjouterCompte(UnCompte);
        UnClient.AjouterCompte(UnCompte2);
        System.out.println(UnClient);
    }

}

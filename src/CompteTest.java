
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CompteTest {

    Compte compte = new Compte("512","Michel", 0);

    @Test
    void get_numero() {
        assertEquals("512",compte.get_numero());
    }

    @Test
    void get_nomTitulaire() {
        assertEquals("Michel",compte.get_nomTitulaire());
    }

    @Test
    void get_solde() {
        assertEquals(0,compte.get_solde());
    }

    @Test
    void deposer() {
        compte.deposer(500);
        assertEquals(500,compte.get_solde());
    }

    @Test
    void retirer() {
        compte.deposer(500);
        compte.retirer(50);
        assertEquals(450,compte.get_solde());
    }

    @Test
    void testToString() {
        assertEquals("Compte : 512 Titulaire : Michel Solde : 0.0",compte.toString());
    }
}
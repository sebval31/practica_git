package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {

    @Test
    public void numerosPrimos() {
        assertTrue(Primo.esPrimo(2));
        assertTrue(Primo.esPrimo(3));
        assertTrue(Primo.esPrimo(7));
        assertTrue(Primo.esPrimo(13));
    }

    @Test
    public void numerosNoPrimos() {
        assertFalse(Primo.esPrimo(4));
        assertFalse(Primo.esPrimo(9));
        assertFalse(Primo.esPrimo(100));
    }

    @Test
    public void casosLimite() {
        assertFalse(Primo.esPrimo(1));
        assertFalse(Primo.esPrimo(0));
        assertFalse(Primo.esPrimo(-7));
    }
}
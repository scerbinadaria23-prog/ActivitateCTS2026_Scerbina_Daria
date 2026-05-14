package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testgetGen() {
        Persoana persoana = new Persoana("Matei","1761114416644");
        Assert.assertEquals("M", persoana.getGen());
    }

    @Test
    public void testgetGendupa2000Feminin() {
        Persoana persoana1 = new Persoana("Ana", "6060114442327");
        assertEquals("F", persoana1.getGen());
    }

    @Test
    public void testgetGenBoundaryInferior2000() {
        Persoana persoana2 = new Persoana("Maria", "6000101446921");
        assertEquals("F", persoana2.getGen());
    }

    @Test
    public void testgetGenVarstaSuperiorNow() {
        Persoana persoana3 = new Persoana("Mihaela", "6260514447892");
        assertEquals(0, persoana3.getVarsta());
    }


    @Test
    public void tetscheckCNP() {
        Persoana persoana4 = new Persoana("Matei","1761114416644");
        assertTrue(persoana4.checkCNP());
    }

    @Test
    public void tetsGetGenCrossCheck() {
        String cnp = "6040814444241";
        Persoana persoana5 = new Persoana("Dariana", cnp);
        String expected;
        if (cnp.charAt(0) % 2 == 0) {
            expected = "F";
        } else {
            expected = "M";
        }
        String actual = persoana5.getGen();
        assertEquals(expected, actual);
    }
        @Test(expected = IllegalArgumentException.class)
        public void tetsCheckCNPLungime () {
            Persoana persoana6 = new Persoana("Marcel", "2982834");
            persoana6.checkCNP();
        }
    }

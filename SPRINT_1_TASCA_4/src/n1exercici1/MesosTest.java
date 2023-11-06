package n1exercici1;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class MesosTest {

    @Test
    public void provaLlistaMesos() {
        Mesos mesos = new Mesos();
        List<String> llistaMesos = mesos.getLlistaMesos();

        // Verifiquem que la llista té 12 posicions
        assertEquals(12, llistaMesos.size());

        // Verifiquem que la llista no és nul·la
        assertNotNull(llistaMesos);

        // Verifiquem que en la posició 7 conté el nom 'agost'(comença a partir del 0)
        assertEquals("agost", llistaMesos.get(7));
    }
}
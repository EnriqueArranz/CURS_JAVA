package n1exercici2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculoDniTest {

	
	 @Test
	    public void testCalcularLetraDni() {
	        int[] numerosDni = {12345678, 98765432, 54321987, 11111111, 99999999, 55555555, 88888888, 44444444, 66666666, 77777777};
	        char[] letrasEsperadas = {'Z', 'M', 'N', 'H', 'R', 'K', 'Y', 'A', 'Q', 'B'};

	        for (int i = 0; i < numerosDni.length; i++) {
	            char letraCalculada = CalculoDni.calcularLetraDni(numerosDni[i]);
	            assertEquals(letrasEsperadas[i], letraCalculada);
	        }
	    }
}

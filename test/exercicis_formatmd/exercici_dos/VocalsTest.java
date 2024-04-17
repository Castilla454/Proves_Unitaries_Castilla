/**
 * La clase VocalsTest es una clase de prueba para la clase Vocals que contiene
 * métodos para probar si una letra es una vocal o no.
 * <p>
 * Los métodos de prueba incluyen verificar si una letra dada es una vocal,
 * tanto mayúscula como minúscula, y también para verificar casos especiales
 * como cuando se proporciona una cadena o un valor nulo.
 * </p>
 *
 * @author [Tu nombre]
 * @version 1.0
 */
package exercicis_formatmd.exercici_dos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VocalsTest {

    /**
     * Configura el entorno de prueba antes de cada método de prueba.
     */
    @BeforeMethod
    public void setUp() {
    }

    /**
     * Limpia el entorno de prueba después de cada método de prueba.
     */
    @AfterMethod
    public void tearDown() {
    }

    /**
     * Prueba el método esVocal() con una letra vacía.
     */
    @Test
    public void testEsVocal() {
        String lletra = "";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
    }

    /**
     * Prueba el método esVocal() con la letra "A" mayúscula.
     */
    @Test
    public void testEsVocalA() {
        String lletra = "A";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
    }

    /**
     * Prueba el método esVocal() con la letra "a" minúscula.
     */
    @Test
    public void testEsVocala() {
        String lletra = "a";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
    }

    /**
     * Prueba el método esVocal() con la letra "B".
     */
    @Test
    public void testEsVocalB() {
        String lletra = "B";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
    }

    /**
     * Prueba el método esVocal() con una cadena de texto.
     */
    @Test
    public void testEsCadena() {
        String lletra = "asddadadaf";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        assertFalse(result, "no es posible cadena" + lletra);
    }

    /**
     * Prueba el método esVocal() con una letra nula.
     */
    @Test
    public void testEsVocalNula() {
        String lletra = null;
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
    }
}

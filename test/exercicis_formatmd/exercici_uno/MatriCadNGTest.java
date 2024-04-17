/**
 * Esta clase contiene los métodos de prueba para la clase Matricad utilizando TestNG.
 * Se realizan pruebas para los distintos casos de uso del constructor y los métodos de la clase Matricad.
 * También se comprueba el comportamiento esperado de los métodos getMaxCad, getSumaCaracters y getIndexDe.
 */
package exercicis_formatmd.exercici_uno;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class MatriCadNGTest {

    /**
     * Constructor por defecto de la clase MatriCadNGTest.
     */
    public MatriCadNGTest() {
    }

    // Declaración de la matriz de cadenas que se utilizará en las pruebas
    static String[] cadenes;

    /**
     * Método que se ejecuta una vez antes de iniciar las pruebas de la clase.
     * Se utiliza para inicializar la matriz de cadenas.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        cadenes = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"};
    }

    /**
     * Prueba del constructor de la clase MatriCad.
     * Comprueba que se lance IllegalArgumentException si se crea con una matriz de cadenas null.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void testConstr1() {
        System.out.println("constructor con la matriz cadenes");
        Matricad instance = new Matricad(cadenes);
    }

    /**
     * Prueba del constructor de la clase MatriCad.
     * Comprueba que se lance IllegalArgumentException si se crea con una matriz de cadenas null.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void testConstr2() {
        System.out.println("constructor con la matriz nula");
        Matricad instance = new Matricad(null);
    }

    /**
     * Prueba del constructor de la clase MatriCad.
     * Comprueba que se lance IllegalArgumentException si se crea con una matriz de cadenas vacía.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void testConstr3() {
        System.out.println("constructor con la matriz vacía");
        String[] cads = {};
        Matricad instance = new Matricad(cads);
    }

    /**
     * Prueba del constructor de la clase MatriCad.
     * Comprueba que se lance IllegalArgumentException si se crea con una matriz de cadenas null.
     */
    @Test
    public void testConstr4() {
        try {
            System.out.println("constructor con un null");
            Matricad instance = new Matricad (null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba del constructor de la clase MatriCad.
     * Comprueba que se lance IllegalArgumentException si se crea con una matriz de cadenas vacía.
     */
    @Test
    public void testConstr5() {
        try {
            System.out.println("constructor con la matriz vacía");
            String[] mat = {""};
            Matricad instance = new Matricad (mat);
            fail("No ha saltado la excepción para la matriz vacía");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método que se ejecuta una vez después de finalizar las pruebas de la clase.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Prueba del método getMaxCad de la clase Matricad.
     * Comprueba que devuelve la cadena más larga de la matriz.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        Matricad instance = new Matricad(cadenes);
        String expResult = "dilluns";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
    }

    /**
     * Prueba del método getSumaCaracters de la clase Matricad.
     * Comprueba que devuelve la suma de los caracteres de todas las cadenas en la matriz.
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        Matricad instance = new Matricad(cadenes);
        int expResult = 27;
        int result = instance.getSumaCaracters();
        assertEquals(result, expResult);
    }

    /**
     * Prueba del método getIndexDe de la clase Matricad.
     * Comprueba que devuelve el índice de la primera aparición de una cadena dada.
     */
    @Test
    public void testGetIndexDe() {
        System.out.println("GetIndexOf comprueba la posición de una cadena");
        String unaCadena = "";
        Matricad instance = new Matricad(cadenes);
        int expResult = 2;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
    }

    /**
     * Prueba del método getIndexDe de la clase Matricad.
     * Comprueba que lanza IllegalArgumentException si se busca una cadena null.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void testGetIndexDe1() {
        System.out.println("GetIndexOf busca un valor nulo");
        Matricad instance = new Matricad(cadenes);
        instance.getIndexDe(null);
    }

    /**
     * Prueba del método getIndexDe de la clase Matricad.
     * Comprueba que lanza NoSuchElementException si se busca una cadena que no está en la matriz.
     */
    @Test(expectedExceptions = {java.util.NoSuchElementException.class})
    public void testGetIndexDe2() {
        System.out.println("GetIndexOf busca un valor inexistente");
        Matricad instance = new Matricad(cadenes);
        instance.getIndexDe("lunes");
    }
}

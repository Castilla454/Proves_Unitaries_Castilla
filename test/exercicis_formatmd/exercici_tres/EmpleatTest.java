package exercicis_formatmd.exercici_tres;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Clase de pruebas unitarias para la clase Empleat.
 */
public class EmpleatTest {

    Empleat empleat = new Empleat();

    /**
     * Prueba para calcular el salario bruto de un vendedor con ventas mínimas y sin horas extra.
     */
    @Test
    public void testCalculaSalariBrut_VendedorVentasMinimasSinHorasExtra() {
        try {
            assertEquals(1000.0, empleat.calculaSalariBrut("venedor", 0, 0), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un vendedor con ventas medias y horas extra.
     */
    @Test
    public void testCalculaSalariBrut_VendedorVentasMediasConHorasExtra() {
        try {
            assertEquals(1187.14, empleat.calculaSalariBrut("venedor", 1500, 10), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un vendedor con ventas altas y sin horas extra.
     */
    @Test
    public void testCalculaSalariBrut_VendedorVentasAltasSinHorasExtra() {
        try {
            assertEquals(1200.0, empleat.calculaSalariBrut("venedor", 3000, 0), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un encargado con ventas mínimas y horas extra.
     */
    @Test
    public void testCalculaSalariBrut_EncargadoVentasMinimasConHorasExtra() {
        try {
            assertEquals(1109.28, empleat.calculaSalariBrut("encarregat", 0, 5), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un encargado con ventas altas y horas extra.
     */
    @Test
    public void testCalculaSalariBrut_EncargadoVentasAltasConHorasExtra() {
        try {
            assertEquals(1613.42, empleat.calculaSalariBrut("encarregat", 4000, 15), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para comprobar que se lance una excepción cuando las ventas son negativas para un vendedor.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut_VendedorVentasNegativas() {
        try {
            empleat.calculaSalariBrut("venedor", -100, 8);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para comprobar que se lance una excepción cuando las horas extra son negativas para un encargado.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut_EncargadoHorasExtraNegativas() {
        try {
            empleat.calculaSalariBrut("encarregat", 2500, -5);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para comprobar que se lance una excepción cuando se proporciona un tipo de empleado incorrecto.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut_TipoEmpleadoIncorrecto() {
        try {
            empleat.calculaSalariBrut("gestor", 2000, 10);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un vendedor en el límite inferior de ventas para prima mínima.
     */
    @Test
    public void testCalculaSalariBrut_LimiteVentasPrimaMinima() {
        try {
            assertEquals(1087.14, empleat.calculaSalariBrut("venedor", 1000, 12), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario bruto de un vendedor en el límite superior de ventas para prima máxima.
     */
    @Test
    public void testCalculaSalariBrut_LimiteVentasPrimaMaxima() {
        try {
            assertEquals(1227.14, empleat.calculaSalariBrut("venedor", 2500, 20), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto mínimo (0).
     */
    @Test
    public void testCalculaSalariNet_SalarioBrutoMinimo() {
        try {
            assertEquals(0.0, empleat.calculaSalariNet(0), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto menor que 1000, sin retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBrutoMenor1000SinRetencion() {
        try {
            assertEquals(800.0, empleat.calculaSalariNet(1000), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 1000, con un 16% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto1000Con16PorcientoRetencion() {
        try {
            assertEquals(840.0, empleat.calculaSalariNet(1000), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 1500, con un 16% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto1500Con16PorcientoRetencion() {
        try {
            assertEquals(1264.0, empleat.calculaSalariNet(1500), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 1500, con un 20% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto1500Con20PorcientoRetencion() {
        try {
            assertEquals(1200.0, empleat.calculaSalariNet(1500), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 2000, con un 20% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto2000Con20PorcientoRetencion() {
        try {
            assertEquals(1600.0, empleat.calculaSalariNet(2000), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 3000, con un 20% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto3000Con20PorcientoRetencion() {
        try {
            assertEquals(2400.0, empleat.calculaSalariNet(3000), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 4500, con un 20% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto4500Con20PorcientoRetencion() {
        try {
            assertEquals(3600.0, empleat.calculaSalariNet(4500), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para calcular el salario neto con un salario bruto de 10000, con un 20% de retención.
     */
    @Test
    public void testCalculaSalariNet_SalarioBruto10000Con20PorcientoRetencion() {
        try {
            assertEquals(8000.0, empleat.calculaSalariNet(10000), 0.01);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prueba para comprobar que se lance una excepción cuando el salario bruto es negativo.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariNet_SalarioBrutoNegativo() {
        try {
            empleat.calculaSalariNet(-100);
        } catch (MaException e) {
            throw new RuntimeException(e);
        }
    }
}

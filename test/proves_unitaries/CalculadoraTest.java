package proves_unitaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.sumar(2, 2));
        assertEquals(10, calculadora.sumar(5, 5));
        assertEquals(-3, calculadora.sumar(0, -3));

    }

    @Test
    void restar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.restar(5, 3));
        assertEquals(-4, calculadora.restar(0, 4));
        assertEquals(10, calculadora.restar(20, 10));

    }

    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicar(3, 5));
        assertEquals(0, calculadora.multiplicar(0, 10));
        assertEquals(-12, calculadora.multiplicar(3, -4));
    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(10, 5));
        assertEquals(3, calculadora.dividir(9, 3));
        assertEquals(0, calculadora.dividir(0, 5));
        assertEquals(0, calculadora.dividir(5, 0));
    }
}
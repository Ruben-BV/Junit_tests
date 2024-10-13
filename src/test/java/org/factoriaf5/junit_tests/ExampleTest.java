package org.factoriaf5.junit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class ExampleTest {
    
    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar() {

        int num1 = 35;
        int num2 = 79;

        int result = example.sumar(num1, num2);

        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
        
    }

    @Test
    public void testCheckPositivo() {

        int number = 5;
        boolean result = example.checkPositivo(number);
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        int number = -4;
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        String string = "animal";
        int result = example.contarLetrasA(string);
        assertEquals(2, result);
    }

    @Test
    public void testContieneElemento() {
        List<String> list = Arrays.asList("Element1", "Element2", "Element3");
        String element = "Element2";
        boolean result = example.contieneElemento(list, element);
        assertTrue(result);
    }

    @Test
    public void testContieneElementoFalse() {
        List<String> list = Arrays.asList("Element1", "Element2", "Element3");
        String element = "Element4";

        boolean result = example.contieneElemento(list, element);
        assertFalse(result);
    }

    @Test
    public void testRevertirCadena() {
        String string = "cat";
        String result = example.revertirCadena(string);
        assertEquals("tac",result);
    }
        
    @Test
    public void testFactorial() {
        int number = 3;
        long result = example.factorial(number);
        assertEquals(6,result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        int number = -4;
        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(number);
        });
    }

    @Test
    public void testEsPrimo() {
        int number = 5;
        boolean result = example.esPrimo(number);
        assertTrue(result);
    }

    @Test
    public void testEsPrimoNegativeNumber() {
        int number = -5;
        boolean result = example.esPrimo(number);
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimoBiggerThanFour(){
        int number = 6;
        boolean result = example.esPrimo(number);
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        
        long start = System.currentTimeMillis();
        String result = example.mensajeConRetraso();
        long end = System.currentTimeMillis();
        long duracion = end - start;

        assertEquals("Listo después de retraso", result);
        assertTrue(duracion >= 5000);
    }

    @Test
    public void testConvertirAString() {
        List<Integer> list = Arrays.asList(1,2,3);

        List<String> expected = Arrays.asList("1","2","3");
        List<String> result = example.convertirAString(list);
        assertEquals(expected, result);
    }

    @Test
    public void testCalcularMedia() {
        List<Integer> list = Arrays.asList(2,5,11);
        double result = example.calcularMedia(list);
        assertEquals(6, result);
    }

    @Test
    public void testCalcularMediaListaVacia() {
        List<Integer> list = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list);
        });
    }

    @Test
    public void testCalcularMediaListaNull() {
        List<Integer> list = null;
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list);
        });
    }

    @Test
    public void testConvertirListaAString() {
        List<String> list = Arrays.asList("1","2","3");
        String result = example.convertirListaAString(list);
        assertEquals("1,2,3", result);
    }

    @Test
    public void testConvertirListaAStringNull() {
        List<String> list = Arrays.asList("1",null,"3");
        String result = example.convertirListaAString(list);
        assertEquals("1,NULL,3", result);
    }
}

package org.factoriaf5.junit_tests;

import static org.junit.jupiter.api.Assertions.*;

// import org.apache.tomcat.util.digester.ArrayStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
// import java.util.Collections;
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
    public void checkPositivo() {

        int number = 5;
        boolean result = example.checkPositivo(number);
        assertTrue(result);
    }

    @Test
    public void checkPositivoError() {
        int number = -4;
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void contarLetrasA() {
        String string = "animal";
        int result = example.contarLetrasA(string);
        assertEquals(2, result);
    }

    @Test
    public void contieneElemento() {
        List<String> list = Arrays.asList("Element1", "Element2", "Element3");
        String element = "Element2";
        
        // Verificar que el elemento está en la lista
        assertTrue(example.contieneElemento(list, element));
        }

        @Test
        public void contieneElementoFalse() {
            List<String> list = Arrays.asList("Element1", "Element2", "Element3");
            String element = "Element4";
            
            // Verificar que el elemento está en la lista
            assertFalse(example.contieneElemento(list, element));
            }
        
    

}

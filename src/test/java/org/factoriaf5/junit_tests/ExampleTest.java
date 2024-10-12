package org.factoriaf5.junit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.BeforeEach;

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;


public class ExampleTest {
    
    @Test
    public void testSumar() {

        Example example = new Example();
        int num1 = 35;
        int num2 = 79;

        int result = example.sumar(num1, num2);

        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
        
    }
}

package org.pab2020.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test cases:
 * 0 -> 1
 * 1 -> 1
 * 2 -> 2
 * 4 -> 24
 */
public class FactorialTest 
{
    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }
    @org.junit.jupiter.api.Test
    public void shouldFactorialOf0Returns1(){

        long expectedValue = 1;
        long obtainedValue = factorial.compute( 0);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFactorialOf1Returns1(){

        long expectedValue = 1;
        long obtainedValue = factorial.compute( 1);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFactorialOf2Returns2(){

        long expectedValue = 2;
        long obtainedValue = factorial.compute( 2);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFactorialOf4Returns24(){

        long expectedValue = 24;
        long obtainedValue = factorial.compute( 4);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldFactorialOfANegativeNumberRaisesException(){
        assertThrows(RuntimeException.class,() -> factorial.compute(-1));
    }
}

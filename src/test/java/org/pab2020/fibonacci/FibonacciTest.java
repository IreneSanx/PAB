package org.pab2020.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pab2020.factorial.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @org.junit.jupiter.api.Test
    public void shouldFibonacciOfAnHigherThan40OrkHigherThan5RaisesException(){
        assertThrows(RuntimeException.class,() -> fibonacci.compute(41,6));
    }
    @org.junit.jupiter.api.Test
    public void shouldFibonacciOfnEquals1Or2Returns1(){

        long expectedValue = 1;
        long obtainedValue = fibonacci.compute(1, 5);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFibonacciOfnEquals3AndkEquals3Returns4(){

        long expectedValue = 4;
        long obtainedValue = fibonacci.compute(3, 3);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFibonacciOfnEquals4AndkEquals3Returns7(){

        long expectedValue = 7;
        long obtainedValue = fibonacci.compute(4, 3);

        assertEquals(expectedValue,obtainedValue);
    }
    @org.junit.jupiter.api.Test
    public void shouldFibonacciOfnEquals5AndkEquals5Returns41(){

        long expectedValue = 41;
        long obtainedValue = fibonacci.compute(5, 5);

        assertEquals(expectedValue,obtainedValue);
    }

}

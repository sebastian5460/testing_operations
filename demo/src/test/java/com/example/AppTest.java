package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void divisionByZero(){
        assertThrows(ArithmeticException.class, ()->{
            Functions operation = new Functions();
            operation.division(2.0, 0.0);
        });
    }

    @Test
    public void isNullDivision(){

        assertThrows(NullPointerException.class, ()->{
            Functions operation = new Functions();
            operation.division(3.0, null);
        });
    }

    @Test
    public void isNullMultiply(){

        assertThrows(NullPointerException.class, ()->{
            Functions operation = new Functions();
            operation.multiply(9.0, null);
        });
    }

    @Test
    public void isNullAdd(){

        assertThrows(NullPointerException.class, ()->{
            Functions operation = new Functions();
            operation.add(7.0, null);
        });
    }

    @Test
    public void isNullSubstraction(){

        assertThrows(NullPointerException.class, ()->{
            Functions operation = new Functions();
            operation.substraction(4.0, null);
        });
    }

    @Test
    public void multiplyTesting(){
        Functions operation = new Functions();

        double twenty1 = operation.multiply(5.0,4.0);
        double twenty2 = operation.multiply(10.0, 2.0);

        assertEquals(twenty1, twenty2);
    }

    @Test
    public void isMinor(){
        Functions operation = new Functions();

        double a = 15.0;
        double b = 3.4;
        double c = operation.substraction(a, b);

        assertTrue(c < a);
    }

    @Test
    public void isMajor(){
        Functions operation = new Functions();

        double a = 15.0;
        double b = 5;
        double c = operation.add(a, b);

        assertTrue(c > a);
    }


}

package com.example;

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
    public void isNullDivision2(){

        assertThrows(NullPointerException.class, ()->{
            Functions operation = new Functions();
            operation.division(3.0, 3.4);
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


}

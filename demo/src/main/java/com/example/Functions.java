package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {

    public static double multiply(Double x, Double y){

        if(x == null || y == null){
            throw new NullPointerException("Illegal expression");
        }
        
        return x * y;

    }

    public static double add(Double x, Double y){
        if(x == null || y == null){
            throw new NullPointerException("Illegal expression");
        }

        return x + y;

    }

    public static double substraction(Double x, Double y){
        if(x == null || y == null){
            throw new NullPointerException("Illegal expression");
        }

        return x - y;

    }

    public static double division(Double x, Double y){
        if(x == null || y == null){
            throw new NullPointerException("Illegal expression");
        }

        if(y == 0){
            throw new ArithmeticException("Division by zero");
        }


        return x / y;
        
    }
}

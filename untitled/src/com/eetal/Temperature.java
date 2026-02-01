package com.eetal;
import java.util.Scanner;
public class Temperature{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter temperature in celcius");
        float Celcius = in.nextFloat();
        float Fahrenheit = (float) ((Celcius * 9/5)+32);
        System.out.println(Fahrenheit);

    }
}


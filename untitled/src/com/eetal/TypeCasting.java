package com.eetal;

import java.util.Scanner;

public class  TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //TYPECASTING
        // int num = (int)(54.33f);
        //System.out.println(num);

        //automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a);
        //  System.out.println(b);

//        byte a = 47;
//        byte b = 66;
//        byte c = 122;
//        int d = a * b / c; //data type is changed to integer here
//        System.out.println(d);

        int number = 'A';
        System.out.println("فتغ");

        byte a= 12;
        char b = 'n';
        double c = 3.14;
        float d = 3.14f;
        System.out.println(a+b*c/d);


    }

}


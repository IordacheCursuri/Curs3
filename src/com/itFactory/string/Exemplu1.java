package com.itFactory.string;

public class Exemplu1 {

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Hello World";

        String s3 = new String("Hello World");

        boolean x = s1 == s2;


        System.out.println(x);

        System.out.println("----------------------------------");

        System.out.println(s1 == s3);

        System.out.println("********************************");

        System.out.println(s1.equals(s3));









    }


}

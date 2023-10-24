package com.itFactory.string;

public class Exercitiu3 {

    public static void main(String[] args) {

        String s1 = "Hello World";

        System.out.println("lungimea stringului s1 este: " + s1.length());

        String s2 = "";

        System.out.println(s2.isEmpty());

        System.out.println("-----------------------------------");

        String nume = "gigel";

        System.out.println(nume.toUpperCase());

        String nume2 = "IONEL";

        System.out.println(nume2.toLowerCase());

        System.out.println("---------------------------------");

        String nume3 = "Vailse        ";

        System.out.println(nume3.toLowerCase().trim());

        String s5 = "                   Hello World                  ";

        System.out.println("x" + s5.trim() + "x");

        System.out.println("******************************");

        String s6 = "Hello World";
        String s7 = "Hello WORLD";

        System.out.println(s6.equals(s7));

        System.out.println(s6.equalsIgnoreCase(s7));


    }


}

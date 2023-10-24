package com.itFactory.string;

public class Exercitiu5 {

    public static void main(String[] args) {

        String s1 = "Hello World";

        String s2 = s1.substring(0, 3); // se ia in considerare doar inxul: 0 si 1 -> [0,3)

        System.out.println(s2);

        System.out.println("********************************************");

        String s3 = "Aceasta propozitie este prea mare";

        if (s3.length() > 10) {
            System.out.println("aceasta fraza este prea mare deoarece are " + s3.length() + " caractere");
        } else {
            System.out.println("fraza nu este prea mare");
        }

        System.out.println("-----------------------------------------");

        for (int i = 0; i < s3.length(); i++){
            System.out.println("Fraza este prea mare");
        }


    }
}

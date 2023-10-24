package com.itFactory.string;

public class Exercitiu4 {

    public static void main(String[] args) {

        String s1 = "Afara este rece!!        ";


        if(!s1.isEmpty()){
            System.out.println("lungimea sirului este: " + s1.length());
            s1 = s1.trim(); //am creat un al string
            System.out.println("lungimea sirului de caractere dupa indepartarea spatiilor albe " + s1.length());
        } else {

            System.out.println("Sirul nu contine nici un caracter");
        }







    }

}

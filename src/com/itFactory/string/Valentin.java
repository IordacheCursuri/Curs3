package com.itFactory.string;

public class Valentin {

    public static void main(String[] args) {

        String s1 = "Hello World!";
        String s2 = "Hello World!";

        String s3 = new String("Hello World!");
//        String x = "Folosing echivalare in acelasi string pool" + s1;
//        System.out.println(x);

        System.out.println("Folosing echivalare in acelasi string pool -> " + (s1 == s2));
//        System.out.println("Folosind doar caracterele indiferent de locatia tringului" + s1 == s3);
//        System.out.println("Folosind equals" + s1.equals(s3));



    }
}

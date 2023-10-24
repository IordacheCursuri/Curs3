package com.itFactory.stringBuilder;

public class Exercitiu7 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ana");
        sb.append(" are");
        sb.append(" mere");

        sb.reverse();

        System.out.println(sb);

        sb.replace(0, 2, "RRRRRRRRRRRRRRRRR");

        System.out.println(sb);


    }
}

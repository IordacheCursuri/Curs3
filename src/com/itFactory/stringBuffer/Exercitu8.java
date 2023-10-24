package com.itFactory.stringBuffer;

public class Exercitu8 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Ana");
        sb.append(" are");
        sb.append(" mere");

        sb.reverse();

        System.out.println(sb);

        sb.replace(0, 2, "RRRRRRRRRRRRRRRRR");

        System.out.println(sb);



    }

}

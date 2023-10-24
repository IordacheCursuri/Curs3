package com.itFactory.valentin;

public class Exercitiu9 {

    public static void main(String[] args) {

        String x = null;
        String x1 = "";


    //    System.out.println(x.isEmpty());

        User user = new User();

        user.username = "gigel";

        System.out.println(user.username);

        user = null;

       // System.out.println(user.username);

        if(user != null){
            System.out.println("obiectul user nu este null");

        } else {
            System.out.println("obiectul de user este null");
           String f =  user.username;
        }






    }



}

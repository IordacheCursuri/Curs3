package com.itFactory.tema;

import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sirCaractere = "ionel";


        while (!sirCaractere.equals("stop")){
            System.out.println("Introduceti textul: ");
            sirCaractere = scanner.nextLine();
        }

//        int i = 0;
//
//        while (i < 100){
//            System.out.println(i);
//            i++;
//        }



    }
}

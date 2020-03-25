package com.example.helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ievadi savu vārdu: ");
        String vards = sc.nextLine();
        System.out.println("Sveika, "+ vards.substring(0,1)+"!");

        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append("daba ");
        sb.append(5);
        System.out.println(sb.toString());

    }
}

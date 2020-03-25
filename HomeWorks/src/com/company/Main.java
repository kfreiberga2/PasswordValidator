package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ievadi istabas piederumu: ");
        String obj = sc.nextLine().toLowerCase().substring(0,1);
        switch (obj){
            case "g":
                System.out.println("1.stavs");
                break;
            case "b":
                System.out.println("This need to be in bedroom");
                break;


        }

    }
}

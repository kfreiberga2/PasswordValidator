package com.example.helloworld;

import java.util.Scanner;

public class TwoSum {
    public static void main(String [] arg){

        int x,y;

        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("Ievadi x diapazonā 0-20:");
            x =sc.nextInt();
            if ( x>=0 && x<=20){
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
        while (true){
            System.out.print("Ievadi y 30-50:");
            y =sc.nextInt();
            if (y>29 && y<51){
                break;
            }else{
                System.out.println("invalid input");
            }
        }
            int sum = x+y;

        System.out.println("Sum of x,y is: "+sum);



    }
}

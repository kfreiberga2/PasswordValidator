package com.company;

import java.util.Scanner;

public class Krava {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("kravas svars(0-9): ");
        int svars =sc.nextInt();
        System.out.print("kravas aug (6-12): ");
        int aug =sc.nextInt();

        if(aug>9){
            if (svars>=9) {
                System.out.println("first car");
            }else if (svars>6){
                System.out.println("2.car");
            }else {
                System.out.println("3. car");
            }
        }else if(aug>6){
            if (svars>=9) {
                System.out.println("first car");
            }else if (svars>6){
                System.out.println("2.car");
            }else {
                System.out.println("3. car");
            }
        }else{
            if (svars>=9) {
                System.out.println("first car");
            }else if (svars>6){
                System.out.println("2.car");
            }else {
                System.out.println("3. car");
            }



            }
        }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        boolean[][] routes = {{true, false, true, false, true},
                {true, true, true, true, true}};

        for (var i = 0; i < routes.length; i++) {
            System.out.println("Route "+i);

            boolean isRoadOk = false;

            for (int j = 0; j < routes[i].length; j++) {
                if (!routes[i][j]) {
                    System.out.println("RED LIGHT");
                    isRoadOk = false;
                    break;

                }
                isRoadOk=true;


            }
            if(!isRoadOk){
                System.out.println("Route "+i+" red lights");
            }else{
                System.out.println("Route " + i+ " is good to go");
            }
        }

    }
}
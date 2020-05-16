package com.company;

import java.util.HashMap;

public class HashMapAwesomeness {
    public static void main(String[] args) {

        HashMap <String, Integer> happy = new HashMap();

        happy.put("a",10);
        happy.put("b",3);
        happy.put("c", 88);
        System.out.println(happy);
        System.out.println(happy.get("c"));

        HashMap <String, String> fun =new HashMap();
        fun.put("Bobby", "Bobby1993@");
        fun.put("Kristine140", "sun123!");
        System.out.println(fun);
        System.out.println(fun.replace("Bobby", "Kitty"));
        System.out.println(fun );

        System.out.println(fun.size());







    }
}

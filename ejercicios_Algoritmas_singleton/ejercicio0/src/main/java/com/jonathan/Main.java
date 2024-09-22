package com.jonathan;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Iniciant "+count);
        Objecte singleton1 = Objecte.getInstance("Jonathan", "Rueda", 21);
        
        count ++;
        System.out.println("Iniciant "+count);
        Objecte singleton2 = Objecte.getInstance("Pepe", "Garcia", 51);
        
        count ++;
        System.out.println("Iniciant "+count);
        Objecte singleton3 = Objecte.getInstance("Josefina", "Sanchez", 71);
        
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3); 
    }
}
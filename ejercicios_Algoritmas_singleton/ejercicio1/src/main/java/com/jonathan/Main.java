package com.jonathan;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Iniciant "+count);
        Objecte singleton1 = Objecte.getInstance("Jonathan", "Rueda", 21);
        count ++;
        System.out.println("Iniciant "+count);
        Objecte singleton2 = getNewDestroyedInstance("Pepe", "Garcia", 51);
        count ++;
        System.out.println("Iniciant "+count);
        Objecte singleton3 = getNewDestroyedInstance("Josefina", "Sanchez", 71);
        
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3); 
    }


        static Objecte getNewDestroyedInstance (String name,String lastname, int year) {
        Objecte result = null;
        try {
            Constructor<?>[] constructors = Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                result = (Objecte) constructor.newInstance(name,lastname,year);
                break;
            }
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en crear una nueva instancia... \nError:");
            e.printStackTrace();
        }
        return result;
    }
}
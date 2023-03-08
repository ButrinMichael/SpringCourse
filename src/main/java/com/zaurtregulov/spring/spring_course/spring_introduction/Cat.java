
package com.zaurtregulov.spring.spring_course.spring_introduction;


public class Cat implements Pet{
    public Cat (){
        System.out.println("Cat bin is created");
    }
    @Override
    public void say(){
        System.out.println("Meow-Meow MOTHERFUCKER");
    }
}

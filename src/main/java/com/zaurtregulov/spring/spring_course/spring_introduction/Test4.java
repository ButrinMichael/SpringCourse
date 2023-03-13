package com.zaurtregulov.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext2.xml");

        
        
        
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        System.out.println("Are the variables referencing the same object? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println("myDog name is: " + myDog.getName() + " /yourDog name is: " + yourDog.getName());
        context.close();
    }
}

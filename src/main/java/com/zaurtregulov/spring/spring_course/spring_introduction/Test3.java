
package com.zaurtregulov.spring.spring_course.spring_introduction;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3 {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
//        Pet pet = context.getBean("myPet",Pet.class);
//        // Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYourPet();
//        
//        context.close();
        
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.print("Persons surname is " + person.getSurname());
        System.out.println(" and his age is " + person.getAge());
        
        
        context.close();
        
        
    }
}

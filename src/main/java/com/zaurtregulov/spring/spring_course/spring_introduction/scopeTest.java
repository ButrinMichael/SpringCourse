
package com.zaurtregulov.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        
        Dog myDog =  context.getBean("dog", Dog.class);
     myDog.say();
        
        
        
        
//        Dog yourDog =  context.getBean("dog", Dog.class);
//        
//         System.out.println("Are the variables referencing the same object? " + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
    
    
}

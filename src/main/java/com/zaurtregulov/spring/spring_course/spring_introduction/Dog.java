
package com.zaurtregulov.spring.spring_course.spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component //bean id = dog
//@Scope ("singleton")
//@Scope ("prototype")
public class Dog implements Pet{
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    @PostConstruct
    public void init(){
        System.out.println("Class DOG : init Method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog destroy Method");
    }
    
    public Dog(){
        System.out.println("Dog bin is created");
    }
   @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


package com.zaurtregulov.spring.spring_course.spring_introduction;


public class Dog implements Pet{
    public Dog(){
        System.out.println("Dog bin is created");
    }
   @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


package com.zaurtregulov.spring.spring_course.spring_introduction;


public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Dog(){
        System.out.println("Dog bin is created");
    }
   @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}

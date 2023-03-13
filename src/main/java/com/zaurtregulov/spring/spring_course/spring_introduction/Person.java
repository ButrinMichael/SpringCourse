
package com.zaurtregulov.spring.spring_course.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("personBean")
public class Person {
        
   private Pet pet;
   private String surname;
   private int age;
   
   @Autowired
   public Person (Pet pet){
       System.out.println("Person bin is created");
   this.pet=pet;
   }
   
//      public Person (){
//       System.out.println("Person bin is created");
//  
//   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person age is setterd");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person surname is setterd");
        this.surname = surname;
    }

       
   
   // pet->setPet
   public void setPet (Pet pet){
       System.out.println("Class Person: set Pet");
       this.pet=pet;  
   }
           
           
           
    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        pet.say();
    
    }
}

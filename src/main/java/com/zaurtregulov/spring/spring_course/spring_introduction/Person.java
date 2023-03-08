
package com.zaurtregulov.spring.spring_course.spring_introduction;

public class Person {
    
   private Pet pet;
    
//   public Person (Pet pet){
//       System.out.println("Person bin is created");
//   this.pet=pet;
//   }
   
      public Person (){
       System.out.println("Person bin is created");
  
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

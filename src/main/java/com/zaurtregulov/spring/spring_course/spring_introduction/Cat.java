
package com.zaurtregulov.spring.spring_course.spring_introduction;

import org.springframework.stereotype.Component;

//@Component create bean=class name with first liter low "Cat"->"cat", if "SSQLtest"->"SSQLtest"
@Component("catBean")// create bean=with name ("someName") 
public class Cat implements Pet{
    public Cat (){
        System.out.println("Cat bean is created");
    }
    @Override
    public void say(){ System.out.println("Meow-Meow MOTHERFUCKER");    }
}

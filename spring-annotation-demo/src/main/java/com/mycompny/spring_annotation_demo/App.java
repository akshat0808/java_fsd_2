package com.mycompny.spring_annotation_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompny.spring_annotation_demo.bean.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach c=context.getBean("swimCoach",Coach.class);
        System.out.println(c.getDailyWorkout()+"\n"+c.getDailyFortune());
        context.close();
    }
}

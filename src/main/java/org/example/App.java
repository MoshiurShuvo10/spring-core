package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("studentConfig.xml") ;

        Student student1 = (Student) abstractApplicationContext.getBean("student1") ;
        Student student2 = (Student) abstractApplicationContext.getBean("student2") ;
        Student student3 = (Student) abstractApplicationContext.getBean("student3") ;

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();

        abstractApplicationContext.registerShutdownHook();

    }
}

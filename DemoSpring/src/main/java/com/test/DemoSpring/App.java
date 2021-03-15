package com.test.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
        
        Students s1=(Students)context.getBean("oks"); 
        
        Students s=(Students)context.getBean("Stu"); 
                
              //  Students s1=(Students)context.getBean("oks"); 
                 
                 System.out.println(s);
                System.out.println(s1);
                 
    }
}

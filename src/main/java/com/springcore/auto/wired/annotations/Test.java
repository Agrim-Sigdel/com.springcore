package com.springcore.auto.wired;

import org.example.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Employee employee =context.getBean("emp1",Employee.class);//to avoid typecast

        System.out.println(employee);

    }
}

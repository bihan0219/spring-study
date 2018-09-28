package com.bihan.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args){
    ApplicationContext context =
        new ClassPathXmlApplicationContext("user.xml");

    User user1=context.getBean("user1",User.class);
    User user2=context.getBean("user2",User.class);

    System.out.println(user1);
    System.out.println(user2);

  }

}

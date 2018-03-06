package com.kgisl.springdep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 */
public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
      Company company = context.getBean(Company.class);
      company.showEmployeeInfo();
      System.out.println();
    //   company.showEmpInfo();
    
      Company company1 = context.getBean(Company.class);
      company1.showEmployeeInfo();
     
      context.close();
   }
}
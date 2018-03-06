package com.kgisl.springdep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.kgisl.springdep")
public class AppConfig {
   @Bean
   
   @Scope("Prototype")
   public Employee getEmployee() {
      return new EmployeeImp();
   }
//       @Bean
//       public Emp getEmpl() {
//          return new EmpImp();
//    }
}
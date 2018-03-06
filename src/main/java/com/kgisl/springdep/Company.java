package com.kgisl.springdep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

   private Employee employee;
//    private Emp emp;

   // Constructor based DI
   @Autowired
   public void getCompany(Employee employee) {
      this.employee = employee;
      System.out.println(employee);
   }
//    @Autowired
//    public void getEmp(Emp emp) {
//       this.emp = emp;
//       System.out.println(emp);
//    }

   public void showEmployeeInfo() {
      employee.showEmployeeInfo();
      
   }
//    public void showEmpInfo() {
//     emp.showEmpInfo();
// }
}
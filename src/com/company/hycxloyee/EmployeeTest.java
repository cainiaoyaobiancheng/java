package com.company.hycxloyee;

import com.company.hycxloyee.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne = new Employee("RUN00B1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(25);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(200);
        empOne.printEmployee();

        empTwo.empAge(24);
        empTwo .empDesignation("菜鸟程序员") ;
        empTwo.empSalary(300);
        empTwo.printEmployee();
    }

}

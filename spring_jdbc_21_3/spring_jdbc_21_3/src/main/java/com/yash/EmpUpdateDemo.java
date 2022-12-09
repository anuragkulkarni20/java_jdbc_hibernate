package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import com.yash.dao.EmployeeDAO;
import com.yash.model.*;

public class EmpUpdateDemo {
 public static void main(String s[])
 {	  
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 EmployeeDAO objed = (EmployeeDAO) objAC.getBean("edao");
	 Employee objE = new Employee();
	 
		objE.setEname("Anurag kulkarni");
		objE.setEadd("Pune, Maharashatra");
		objE.setSalary(35000);
	    objE.setEmpid(2);
	System.out.println("Total Record updated:- "+objed.updateEmp(objE));		 
	 }
 }
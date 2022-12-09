package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import com.yash.dao.EmployeeDAO;
import com.yash.model.*;

public class EmpDelDemo {
 public static void main(String s[])
 {	  
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 EmployeeDAO objed = (EmployeeDAO) objAC.getBean("edao");
	 
	System.out.println("Total Record Deleted:- "+objed.deleteEmp(2));		 
}
 }
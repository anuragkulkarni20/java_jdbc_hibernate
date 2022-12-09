package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
import com.yash.dao.EmployeeDAO;
import com.yash.model.*;
import java.util.List;
import java.util.ArrayList;
public class EmpMain {
 public static void main(String s[])
 {
	 
	 /* before ruuning , in sql create database  and table of it so the data which you want to store 
	   and give the name database in application.properties file*/
	 int ch;
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 EmployeeDAO objed = (EmployeeDAO) objAC.getBean("edao");
	 Scanner sc = new Scanner(System.in);
	 while(true)
	 {
		 System.out.println("1 for insert 2 for print all record");
		 ch=sc.nextInt();
		 sc.nextLine();
	switch(ch)
	{
	case 1:
		 String n="";
		 String a="";
		 float salary=0;
		 while(true)
		 {
			 System.out.println("Enter name");
			 n=sc.nextLine();
			 System.out.println("Enter Address");
			 a=sc.nextLine();
			 System.out.println("Enter salary");
			 salary=sc.nextFloat();
			 Employee objE = new Employee();
			 objE.setEname(n);
			objE.setEadd(a);
			objE.setSalary(salary);
		 
		System.out.println("Total record saved:- "+objed.saveEmp(objE));
			System.out.println("want to do more 1 for yes 0 for no");
			ch=sc.nextInt();
			sc.nextLine();
			if(ch==0)
				 break;
		 }//end of insert while
		 break;
	case 2:
		 List<Employee> emplist=objed.getAllRecordEmp();
		 System.out.println("Empid\t Employee Name \t Address \t Salary");
		 for (Employee e:emplist)
		  System.out.println(e.getEmpid()+"\t "+e.getEname()+"\t "+e.getEadd()+"\t "+e.getSalary());	  
		break;
		
	}//end of switch
	
	
	 
	
	 
	 }//end of outer while
 }
}
// select * from employee we get the result of sql in ResultSet class object 

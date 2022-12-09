package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.yash.model.*;
public class EmployeeDAO {
	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveEmp(Employee objE)
	{
		String query ="insert into employee (ename,eadd,salary) values ('"+objE.getEname()+"','"+objE.getEadd()+"',"+objE.getSalary()+")";
		int no;
		no = objJDBC.update(query);
		return no;
	}
	public int updateEmp(Employee objE)
	{
		String query="update employee set ename='"+objE.getEname()+"',eadd='"+objE.getEadd()+"',salary="+objE.getSalary()+" where empid="+objE.getEmpid();
		int no;
		no =objJDBC.update(query);
		return no;
			
	}
	public int deleteEmp(int empid)
	{
		String query ="delete from employee where empid="+empid;
		return objJDBC.update(query);
	}
	public List<Employee> getAllRecordEmp()
	{
		
		return objJDBC.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
			
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			List <Employee> emplist=new ArrayList<Employee>();
				while(rs.next())
				{
					Employee e=new Employee();
					e.setEmpid(rs.getInt("empid"));
					e.setEname(rs.getString("ename"));
					e.setEadd(rs.getString("eadd"));
					e.setSalary(rs.getFloat("salary"));
					emplist.add(e);
				}
		return emplist;		
			}
			
		});
	}
}

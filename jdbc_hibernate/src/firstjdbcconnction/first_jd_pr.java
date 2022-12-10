package firstjdbcconnction;

/*steps to connect with database using jdbc 
 *
 ** Load  the drivers (loding ther drivers- right click on project> build path > add external jar > add mysqlconnctor.jar file > apply close>
 * it will show in refrenced liberies 

 * Import sql packages 
 * 
 * 
 * )register*/




import java.sql.*;



public class first_jd_pr {
	public static void main(String[] args) throws Exception {
		
		// for regrstring the drivers
		Class.forName("com.mysql.jdbc.Driver");
		
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anurag_jdbc_hib","root","root");
		

	
	    Statement st = con.createStatement();
	    
	    //excuting the query using result set
	    
	    // qury for show all the data from the table.
	    ResultSet rs =st.executeQuery("select *from employee");
	    
	    
	    while(rs.next())
	    {
	    
	    int Empid = rs.getInt("Empid");
	    
	    String name = rs.getNString("ename");
	    
	    
	    String address = rs.getNString("eadd");
	    
	    int sal=rs.getInt("Salary");
	    
	    
	    System.out.println(Empid + " " +  name + " " + address + " " + sal );
	    
	    }
	    st.close();
	    
	    con.close();
	    
	
	}
	
	

}

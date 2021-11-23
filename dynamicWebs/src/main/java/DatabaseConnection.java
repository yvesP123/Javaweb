import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

	private String url="jdbc:mysql://localhost:3306/university";
	 private  String user="root";
     private  String pass="";
     private String drivename="com.mysql.cj.jdbc.Driver";
    public void loaddrive(String dbDriver) 
    {
    	try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		
    }
    public Connection getconnection() 
    
    {
    	Connection conn=null;
    	try {
			conn= DriverManager.getConnection(url,user,pass);
			//  PreparedStatement ps=conn.prepareStatement("insert into student(regnumber,fullname,age,gender)values(?,?,?,?)");
		       
		        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
    	
    }
    public String insert(Student stud) 
    {
    	loaddrive(drivename);
    	 Connection conn= getconnection() ;
    	String msg="Data has been successfull ";
    	
    	 PreparedStatement ps;
    	 String Query="INSERT INTO student VALUES(?,?,?,?,?)";
    	
		
		try {
			
			ps = conn.prepareStatement(Query);
			 ps.setString(5, null);
	    	 ps.setString(1, stud. getRegnum());
	    	 ps.setString(2, stud. getFullname());
	    	 ps.setInt(3, stud.getAge());
	    	 ps.setString(4, stud.getGender());
	    	 
	    	ps.executeUpdate();
	    	
	    
		
		} catch (SQLException e1) {
			msg="Record not successfullyyyy";
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     	
    	
    
  
      
      
    
    	
    	
		return msg;
    	
    }
	

}

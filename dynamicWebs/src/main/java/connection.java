import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class connection
{
	public static void main(String[] args) {
	  try
      {
          Class.forName("com.mysql.cj.jdbc.Driver");
          String user="root";
          String pass="";
          String url="jdbc:mysql://localhost:3036/university";
          Connection conn= DriverManager.getConnection(url,user,pass);
          PreparedStatement ps=conn.prepareStatement("insert into student(regnumber,fullname,age,gender)values(?,?,?,?)");
       
          int i=ps.executeUpdate();
          if(i>0)
          {
              System.out.print("the data has been inserted");

          }
          else
          {
             System.out.print("the data has not beent inserted try again");
          }






      } catch (Exception ex) {
         ex.printStackTrace();
      }


  }
}



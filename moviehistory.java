package xa;
                   ////STORING MOVIE AND THEATRE HISTORY
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class moviehistory {

	moviehistory(String moviename,String Theatrename) throws ClassNotFoundException
	{
		
	
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

	//	System.out.println("Connected...Congratulatond..");
		PreparedStatement s=con.prepareStatement("insert into moviehistory values(?,?)");
		s.setString(1,moviename);
		s.setString(2,Theatrename);
		s.executeUpdate();
		//System.out.println("Value inserted..");

		//ResultSet rs=s.executeQuery("create table people(sid int)");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}

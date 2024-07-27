package xa;
////VIEW DATABASE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataFromDataBase {

	SelectDataFromDataBase()throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

	//	System.out.println("Connected...Congratulatond..");
		///PreparedStatement s=con.prepareStatement("insert into user values(?,?)");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from movieuser");
		//s.setInt(1, 100);
		//s.setString(1,"Gnana");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
	//	ResultSet rs=s.executeQuery("create table gnana20(sid int,name varchar2(20))");
		con.close();
	//	System.out.println("Value inserted..");

		//ResultSet rs=s.executeQuery("create table people(sid int)");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
			

		
		
		
		
		
		
		
	}

}

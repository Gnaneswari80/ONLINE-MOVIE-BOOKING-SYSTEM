package xa;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetMoviehistory {

	
	//OnlineMovieTicketBooking omtb=new OnlineMovieTicketBooking();
	
	GetMoviehistory() throws ClassNotFoundException
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	try {
	Connection con;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

	//System.out.println("Connected...Congratulatond..");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from moviehistory");
	
	while(rs.next())
	{
		System.out.println("Movie-->"+rs.getString(1)+" Theatre "+rs.getString(2));
		
	}

	//ResultSet rs=s.executeQuery("create table people(sid int)");

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}

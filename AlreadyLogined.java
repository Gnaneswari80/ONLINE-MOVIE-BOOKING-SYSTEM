package xa;

import java.sql.Connection;////TO CHECK ALREADY LOGINED USER

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.*;
public class AlreadyLogined {

	
	public String str;
	public boolean match;
	OnlineMovieTicketBooking omtb=new OnlineMovieTicketBooking();
	
Scanner sc=new Scanner(System.in);
	AlreadyLogined() throws ClassNotFoundException {
	boolean result=false;
	System.out.println("Enter User name:");
	 omtb.name =sc.nextLine();
	System.out.println("Enter Id");
	
	 omtb.id=sc.nextInt();
		String name1=omtb.name;//copying
		 name1=name1.toLowerCase();//lower case converson
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

	
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from movieuser");
		
		while(rs.next())
		{
			 String name2=rs.getString(2).toLowerCase();
			if(rs.getInt(1)==omtb.id&&name1.equals(name2))
			{
				str="Welcome User";
				match=true;
				break;
				
			}
			else
			{
				match=false;
				//
				str="Invalid user id and name ";
			}
			
		}

		con.close();
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			

		
		
	}

}

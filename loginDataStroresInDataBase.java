package xa;///USER DATA WILL BE STOREDIN THE DATABSE(TABLE)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class loginDataStroresInDataBase {

	
	loginDataStroresInDataBase(int id,String name) throws ClassNotFoundException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

		//System.out.println("Connected...Congratulatond..");
		PreparedStatement s=con.prepareStatement("insert into movieuser values(?,?)");
		s.setInt(1,id);
		s.setString(2,name);
		s.executeUpdate();
		System.out.println("Account created..");

		

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//
	//}

}

package xa;//NEW USER LOGIN
import java.util.*;
public class newuserlogin {
         newuserlogin() throws ClassNotFoundException
	{
        	 
        	 OnlineMovieTicketBooking omtb=new OnlineMovieTicketBooking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name:");
		omtb.name =sc.nextLine();
		System.out.println("Enter Id");
		
		 omtb.id=sc.nextInt();
		new loginDataStroresInDataBase(omtb.id,omtb.name);
		
	}

	
		
		
	}



package xa;
import java.sql.SQLException;
import java.util.*;
public class OnlineMovieTicketBooking {

	 public static String movies[]=new String[3];
	 public static String Theatre[]=new String[4];
	 public static String moviename;
	 public static String Theatrename;
	 public static  int index1,index2;
	 public static int id;
	public String name; 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//newuserlogin l= new newuserlogin();
		  
			movies[0]="Kalki";
			movies[1]="Magadeera";
			movies[2]="RRR";
			
			Theatre[0]="KMM";
			Theatre[1]="JKK";
			Theatre[2]="NMC";
			Theatre[3]="NJK";
		Scanner sc=new Scanner(System.in);
  while(true)//***********************
  {
		System.out.println("1.New user 2.Login 3.History 4.History of users 5.Exit");
		int choice=sc.nextInt();
		if(choice==1)
		new newuserlogin();
		else if(choice==2)
		{
			AlreadyLogined al=new AlreadyLogined();
				System.out.println(al.str);//match aa Ledaa ani print
				
				if(al.match)
				{////
					System.out.print("Available Movies :");
					int i=1;
					for(String movi:movies)
					{
						System.out.print(i+"."+movi+" ");
						i++;
					}
					System.out.println();
					System.out.print("Available Theatres: ");
					i=1;
					for(String Thea:Theatre)
					{
						System.out.print(i+"."+Thea+" ");
						i++;
					}
					System.out.println();
					
					System.out.print("Enter movie number ");
					index1=sc.nextInt();
					System.out.print("Enter Theatre number ");
					index2=sc.nextInt();
					moviename=movies[index1-1];
					Theatrename=Theatre[index2-1];
					//movie and theatre name stored in a table moviehistory
					new moviehistory(moviename,Theatrename);
					
					System.out.println("Congrats...Movie Ticked Booked for "+moviename+" at Theatre "+Theatrename);
				}////
				
			
		}
		else if(choice==3)
		{
			new GetMoviehistory();
			
		}
		else if(choice==4)
		{
			new 	SelectDataFromDataBase();
			
		}
		else if(choice==5)
			System.exit(0);
		else
			System.out.println("Invalid Choice....");
		
  }//**************		
		
		}

	}


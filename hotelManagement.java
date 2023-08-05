import java.util.*;
import java.io.*;

class hotelManagement
{
	static int total;
	
	public void bill()
	{
		System.out.println("Your total bill is "+total);
		System.out.println("------------------------");
		System.out.println("    Thank you");
		System.exit(0);
	}
	
	public static void main (String args[])
	{
		System.out.println("***** Welcome at MR.SK's Cafe *****");
		System.out.println("===================================");
		
		hotelManagement h1 = new hotelManagement();
		Scanner sc = new Scanner(System.in);
		
		int quantity;
		
		Boolean temp = true;
		while(temp=true)
		{
			System.out.println("What you want to order: ");
			System.out.println("------------------------");
			System.out.println("Item               Price");
			System.out.println("------------------------");
			System.out.println("1.Tea =            12\n2.Hot Coffee =     25\n3.Cold Coffee =    40\n4.Bunmaska =       10");
			System.out.println("------------------------");
			System.out.println("5.Bill please");
			System.out.println("------------------------");
			
			
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
		    System.out.println("------------------------");
		switch(ch)
			{
				case 1:
						System.out.println("How much cup of tea you want? ");
						quantity = sc.nextInt();
						total = total+quantity*12;
						System.out.println("Your ordered successfuly done ");
						System.out.println("------------------------");
						break;
				case 2:
						System.out.println("How much cup of hot coffee you want? ");
						quantity = sc.nextInt();
						total = total+quantity*25;
						System.out.println("Your ordered successfuly done ");
						System.out.println("------------------------");
						break;
				case 3:
						System.out.println("How much cold coffee you want? ");
						quantity = sc.nextInt();
						total = total+quantity*40;
						System.out.println("Your ordered successfuly done ");
						System.out.println("------------------------");
						break;
				case 4:
						System.out.println("How much bun maska you want? ");
						quantity = sc.nextInt();
						total = total+quantity*10;
						System.out.println("Your ordered successfuly done ");
						System.out.println("------------------------");
						break;
				case 5:
						h1.bill();
						break;
			}
		}
	}
}
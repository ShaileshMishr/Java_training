package Basics;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args)
	{
		 int cus_id, age;
		 String cus_name,address;
		 long cont_no ;
		 
		 Scanner s=new Scanner(System.in);
			
		 System.out.println("Enter the Customer Address:");
			address =s.nextLine();
			
			System.out.println("Enter the Customer Id:");
			cus_id =s.nextInt();
			
			System.out.println("Enter the Customer Age:");
			age =s.nextInt();
			
			System.out.println("Enter the Customer Name:");
			cus_name =s.next();
			
			 
			
			System.out.println("Enter the Customer Contact No:");
			cont_no =s.nextLong();
			
			System.out.println("============================");
			System.out.println("Customer Details:");
			System.out.println("============================");
			System.out.println("customer id:"+cus_id);
			System.out.println("customer name:"+cus_name);
			System.out.println("customer age:"+age);
			System.out.println("customer contact no:"+cont_no);
			System.out.println("customer address:"+address);
			
	}

}

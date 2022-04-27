package Basics;

import java.util.Scanner;

public class product_data {

	public static void main(String[] args) 
	{
		int p_id;
		float price;
		String pname;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Product Id:");
		p_id =s.nextInt();
		
		System.out.println("Enter the Product Name:");
		pname =s.next();
		
		System.out.println("Enter the Product Price:");
		price =s.nextFloat();
		
		System.out.println("============================");
		System.out.println("Product Details:");
		System.out.println("============================");
		System.out.println("product id:"+p_id);
		System.out.println("product Name:"+pname);
		System.out.println("product Price:"+price);
		
		 
		
		

	}

}

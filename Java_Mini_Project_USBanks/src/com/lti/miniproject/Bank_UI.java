package com.lti.miniproject;
import java.util.Scanner;
public class Bank_UI {

	public static void main(String[] args) {
		Capture_Operation_Bank_UI fetch= new Capture_Operation_Bank_UI ();
		fetch.loadData();
		Scanner sc=new Scanner(System.in);
		int ch = 1;
		do
		{

			System.out.println("Welcome to US Bank Forum!");
			System.out.println("Please enter your option between 1 to 7 only.");
			System.out.println("1.Display all the complaints based on the year provided by the user ");
			System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
			System.out.println("3.Display complaints based on the complaint id provided by the user ");
			System.out.println("4.Display all the complaints closed/closed with explanation ");
			System.out.println("5.Display all the complaints which received a timely response ");
			System.out.println();
			System.out.println("Enter your choice : ");

			int option=sc.nextInt();
			sc.nextLine();

			switch(option)
			{
			case 1: 
				System.out.println("Enter year : ");
				String year=sc.next();
				fetch.complaintsBasedOnYear(year);
				break;
			case 2:
				System.out.println("Enter company name : ");
				String u_company=sc.next(); 
				fetch.complaintsBasedOnCompany(u_company);
				break;
			case 3: 
				System.out.println("Enter complaint ID : ");
				String id=sc.next();
				fetch.complaintsBasedOnComplaintID(id);
				break;				
			case 4: 
				fetch.complaintsClosed();
				break;
			case 5: 
				fetch.complaintsReceivingTimelyResponse();
				break;
			default: System.out.println("Enter valid option");

			}
			
			System.out.println();
			System.out.println("Do you want to continue / exit the Forum ? ");
			System.out.println("1. Continue  0.Exit");
			System.out.println("Enter your choice  :");
			ch = sc.nextInt();

		}while(ch == 1);
		
		System.out.println(" Thank You for using our services !!! ");
		sc.close();

	}

}

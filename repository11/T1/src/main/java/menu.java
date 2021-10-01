//our main

import java.util.Scanner;


public class menu extends Account {
	public static void main(String[] args)
	{
		
		int Account_No = 0001;
		//System.out.println("Choose any option: \n1-Open a new account/Close an account.\n2-Login to a specific account.\n3-Perform account operations.\n4-Specify the Interest Rate.\n5-Display all account details.\n6-Display all accounts deductions along with account details.\n7-EXIT \n");
		//Account a1=new Account();
		//a1.information_new();
		
		//menu
		boolean check=true;
		Scanner input = new Scanner(System.in);
		//int number = input.nextInt();
		while(check==true)
		{
			System.out.println("\n\nChoose any option: \n1-Open a new account/Close an account.\n2-Login to a specific account.\n3-Perform account operations.\n4-Specify the Interest Rate.\n5-Display all account details.\n6-Display all accounts deductions along with account details. \7-Withdraw any amount. \n8-EXIT \n");
			int number = input.nextInt();
			switch(number) {
		  case 1:
			  System.out.println("\nEnter customer's name: ");
			  String C_name = input.next();
			  System.out.println("\nEnter customer's address: ");
			  String C_address = input.next();
			  System.out.println("\nEnter customer's phone_number: ");
			  String C_phone_no = input.next();
			  /*
			  System.out.println("\nEnter customer's account_no: ");
			  String C_account_no = input.next();
			  */
			  System.out.println("\nEnter the amount of balance you want to insert in your new account:  ");
			  int C_bal = input.nextInt();
			  System.out.println("\nYour account has been created. Account details are : \n");
		    Account a1= new Account(C_name,C_address,C_phone_no,Account_No,C_bal);
		    
		    System.out.println("Name = " + a1.getName() + " Phone Number =  " + a1.getPhoneNo() + " Address = " + a1.getAddress() + " Balance = " + a1.getBalance() + " Account No = " + a1.gettAccountNo() );
		    Account_No=Account_No+1;
		    
		    System.out.println("\nEnter the amount that you want to withdraw: ");
		    int withdraw_amount = input.nextInt();
		    
		    System.out.println(a1.makeWithdrawal(withdraw_amount)); 
		    break;
		  case 2:
		    // code block
		    break;
		  case 3:
			    // code block
			    break;
		  case 4:
			    // code block
			    break;
		  case 5:
			    // code block
			    break;
		  case 6:
			    // code block
			    break;
		  case 7:
			  	// code block
			   
		  case 8:
			  check=false;
			  	break;
			}
		}
	}
}

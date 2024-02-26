package CodSoft_Task;

import java.util.Scanner;

public class ATM_Interface {
	public static void main(String args[] ) {
		int balance=10000,withdraw,deposit,pwd;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcome to ATM");
			System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter PIN ");
                pwd = s.nextInt();
                if(pwd==1234)
                {
                    System.out.println("Enter Money to be Withdrawn ");
                    withdraw=s.nextInt();
                	balance = balance - withdraw;
                    System.out.println("Withdrawn Money: "+ withdraw);
                    System.out.println("Total Balance: "+ balance);
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Incorrect PIN");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter PIN ");
                pwd = s.nextInt();
                if(pwd==1234)
                {
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Deposited Money: "+ deposit);
                System.out.println("Total Balance: "+ balance);
                System.out.println("Your Money has been successfully deposited");
                }
                else
                {
                    System.out.println("Incorrect PIN");
                }
                System.out.println("");
                break;
 
                case 3:
                System.out.print("Enter PIN ");
                pwd = s.nextInt();
                if(pwd==1234)
                {
                	System.out.println("Balance : "+balance);
                }
                else
                {
                    System.out.println("Incorrect PIN");
                }
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }	
	}
}
package CodSoft_Task;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int min=1;
		int max=100;
		int randomno=r.nextInt(max-min+1)+min;
		System.out.println("Welcome to the Number Guessing Game!!");
		System.out.println("I have selected a number between 1 and 100.Try to guess it.");
		int userguess;
		int attempts=0;
		do {
			System.out.println("Enter your Guess: ");
			userguess=s.nextInt();
			attempts++;
			if(userguess<randomno) {
				System.out.println("Too Low.Try Again!");
			}
			else if(userguess>randomno) {
				System.out.println("Too High.Try Again!");
			}
			else {
				System.out.println("Congratulations! You guessed the correct number in "+ attempts+ " attempts.");
			}
			}while(userguess!=randomno);
		s.close();
		}

	}


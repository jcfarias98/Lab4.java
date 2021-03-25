package labJava;
//AUTHOR: Jesica Farias
//FILENAME: Lab 4
//SPECIFICATIONS:a program that can perform three different arithmetic operations based on the user’s input. The three operations invlue summation of integers from 1 to m, factorial of a given number n (n!), and finding the leftmost digit of a given integer
//FOR: CSE 110
//TIME SPENT:2 hours

import java.util.Scanner;

public class Lab4 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int Choice = 0;
		printMenu();
		
		do {
			Choice = input.nextInt();
			switch (Choice) {
			
			case 1:
				System.out.println("Enter the number");
				int m = input.nextInt(), sum = 0;
				sum = m * (1 + m) / 2;
				System.out.println("The Sum of 1 to " + m + " is " + sum);
				break;
			
			case 2: 
				System.out.println("Enter the number");
				int n = input.nextInt(), i = 1;
				long factorial = 1;
				while (i <= n) {
					factorial *= i;
					i++;
					}
				System.out.printf("Factorial of "+ n + " is " + factorial);
				break;
			
			case 3:
				int number, leftDigit;
				System.out.println(" Enter a number");
				number = input.nextInt();
				leftDigit = number;
				while (leftDigit >= 10) {
					leftDigit = leftDigit / 10;
					}
				System.out.println("The leftmost digit of " + number + " is " + leftDigit);
				break;
			
			case 4:
				System.out.println("Bye");
				break;
				}
			} while (Choice != 4);
		}
	public static void printMenu()
	{
	//display menu on console
		System.out.println("Please choose from following menu: ");
		System.out.println("1) Calculate the sum of integers 1 to m");
		System.out.println("2) Calculate the factorial of given number");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) quit");
 	}
 }
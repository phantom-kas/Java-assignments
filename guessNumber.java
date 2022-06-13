package guess_number;

import java.util.Scanner;

public class guessNumber {
	public static void main(String args[])
	{
		System.out.print("   \t**********************************\n       \t\tGuess Number Game \n        \t\t203j11 \n   \t**********************************\n\n");
		int number = (int)(Math.random()*101);
		Scanner input = new Scanner(System.in);
		int guess = 100000;		
		System.out.println("Guess a magic number between 1 and 100");
		while(number != guess) {
		System.out.println("Enter your guess !");
		guess = input.nextInt();
		if (guess == number) {
		System.out.println("yes, the number is "+ number);
		break;
		}else if (guess > number) {
		System.out.println("your guess is too high");
		}else {
		System.out.println("your guess is too low");
		}}}}
	
	


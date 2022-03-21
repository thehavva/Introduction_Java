import java.util.Scanner;

public class headOrTail {

	public static void main(String[] args) {
		try (/*Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly generates 
				an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess and reports 
				whether the guess is correct or incorrect.*/
		Scanner input = new Scanner(System.in)) {
			int number1 = (int)(Math.random() * 2);
			int guess=input.nextInt();
			if(number1==guess) {
				System.out.print("Random Variable : ");
				System.out.println((number1==1) ? "Head" : "Tail");
				System.out.print("Your Guess : ");	
				System.out.println((guess==1) ? "Head" : "Tail");
				System.out.println("CONGRATULATIONS");		
			}
			else {
				System.out.print("Random Variable : ");
				System.out.println((number1==1) ? "Head" : "Tail");
				System.out.print("Your Guess : ");	
				System.out.println((guess==1) ? "Head" : "Tail");
				System.out.println("FAILURE WRONG FORECAST");	
			}
		}
	}

}

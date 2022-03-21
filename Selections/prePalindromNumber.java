import java.util.Scanner;

public class prePalindromNumber {

	public static void main(String[] args) {
		try (/*Write a program that prompts the user to enter a three-digit 
				integer and determines whether it is a palindrome number. A number is palindrome 
				if it reads the same from right to left and from left to right.*/
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a three digit number : ");
			int number=input.nextInt();
			int temp=number;
			int a=temp%10;
			temp=temp/10;
			int b=temp%10;
			int c=temp/10;
			System.out.println((a==c) ? "Polindrome number" : "Not Polindrome Number");
		}
	}

}

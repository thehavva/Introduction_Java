import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		/*Write a program that reads an integer between 0 and 
		1000 and adds all the digits in the integer. For example, if an integer is 932, the 
		sum of all its digits is 14.*/
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number between 0 and 1000 : ");
			int number=input.nextInt();
			int temp=number;
			int a=temp%10;
			temp=temp/10;
			int b=temp%10;
			temp=temp/10;
			int c=temp;
			int sum=a+b+c;
			System.out.println("The sum of " + number + "'s digit is "+ sum);
		}
	}

}

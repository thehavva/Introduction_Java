import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int a=input.nextInt();
			boolean value=isPolindrome(a);
			if(value) {
				System.out.println(a+" is Polindrome number.");
			}
			else
				System.out.println(a+" is not Polindrome number.");
		}
	}
	static boolean isPolindrome(int input) {
		int temp,reverseNumber=0,remainder;
		temp=input;
		while(temp!=0) {
			remainder=temp%10;
			reverseNumber=reverseNumber*10+remainder;
			temp/=10;
		}
		if(input==reverseNumber)
			return true;
		else
			return false;
	}
}

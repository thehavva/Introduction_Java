import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
	/*Write a program that reads the subtotal 
	and the gratuity rate, then computes the gratuity and total. For example, if the 
	user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
	as gratuity and $11.5 as total. */
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Subtotal :");
			int subtotal=input.nextInt();
			System.out.print("Gratuity Rate :");
			int gratuityRate=input.nextInt();
			double gratuity=subtotal*gratuityRate/100.0;
			double total=subtotal + gratuity;
			System.out.println("Gratuity : "+ gratuity + "\tTotal : "+total);
		}
	}

}


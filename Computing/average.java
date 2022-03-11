import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers ");
			int a= input.nextInt();
			int b= input.nextInt();
			float sum= a+b;
			float average=sum/2.0f;
			System.out.println("a : "+a+" b : "+b+"\nsum : "+
			sum+"\naverage : "+average);
		}
	}

}

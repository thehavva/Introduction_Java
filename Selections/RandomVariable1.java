import java.util.Scanner;

public class RandomVariable1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int number1 = (int)(System.currentTimeMillis() % 10); //generate random number 1
			int number2= (int)(System.currentTimeMillis()/7%10);  //generate random number 2
			//int number1 = (int)(Math.random() * 10) another method for generating random variables.
			int sum=number1+number2;
			System.out.print("Enter your quess to sum of numbers : ");
			int quess=input.nextInt();
			System.out.println("Number 1 : "+number1+"\n"+"Number 2 : "+number2);
			if(quess==sum)
				System.out.println("Congratulations"+"Sum of numbers is "+sum);
			else
				System.out.println("Wrong answer");
		}

	}

}

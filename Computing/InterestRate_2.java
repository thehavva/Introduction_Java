import java.util.Scanner;

public class InterestRate_2 {

	public static void main(String[] args) {
		 /*(Financial application: compound value) Suppose you save $100 each month 
		 into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
		 Write a program that prompts the user to enter a monthly saving amount and 
		 displays the account value after the third month without using loops. */
		Scanner input=new Scanner(System.in);
		System.out.print("Money : ");
		double money,total,rate;
		money=input.nextDouble();
		rate=0.05/12;
		total=money*(1+rate); //after first month
		total=(money+total)*(1+rate); //after second month
		total=(money+total)*(1+rate); //after third month
		System.out.print("Before third month is money : "+money
				+"\n"+"After third monthis money : "+total);
	}

}

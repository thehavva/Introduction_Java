import java.util.Scanner;

public class Fibonacci {

	static int getFibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return getFibonacci(n-1)+getFibonacci(n-2);
		
	}
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int n=input.nextInt();
			int result=getFibonacci(n);
			System.out.println("Number : "+n+"\t"+"Fibonacci number : "+result);
		}
	}

}

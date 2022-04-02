import java.util.Scanner;

public class metot1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int a=input.nextInt();
			int b=input.nextInt();
			powerFunction(a,b);
		}
		int r=recursive(5);
		System.out.println(r);
	}
	
	static void powerFunction(int number1, int number2) {
		int result=1;
		for(int i=0; i<number2; i++) {
			result*=number1;
		}
		System.out.println("power is "+result);
	}
	
	static int recursive(int a) {
		if(a==1) {
			return 1;
		}
		return a+recursive(a-1);
	}
}

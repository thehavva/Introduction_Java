import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double a,b,c;
			System.out.print("a : ");
			a=input.nextDouble();
			System.out.print("b : ");
			b=input.nextDouble();
			System.out.print("c : ");
			c=input.nextDouble();
			double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
			double x2=(-b-Math.pow((b*b-4*a*c), 0.5))/2*a;
			System.out.println("Root1 of equation : "+x1+"\nRoot2 of equation : "+x2);
			double y1=a*x1*x1 + b*x1 +c;
			double y2=a*x2*x2 + b*x2 +c;
			System.out.println("\n");
			String s1 = y1==0 ? "x1 is zeros-root of equation." : "x1 is not zeros-root of equation.";
			String s2 = y2==0 ? "x2 is zeros-root of equation." : "x2 is not zeros-root of equation.";
			System.out.println(s1);
			System.out.println(s2);
		}
	}
}

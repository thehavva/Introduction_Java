import java.util.Scanner;

public class validTriangle {

	public static void main(String[] args) {
		 try (/*Write a program that reads three edges for 
				 a triangle and computes the perimeter if the input is valid. Otherwise, display that 
				 the input is invalid. The input is valid if the sum of every pair of two edges is 
				 greater than the remaining edge.*/
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter values of edges of triangle: ");
			 int a=input.nextInt();
			 int b=input.nextInt();;
			 int c=input.nextInt();
			 boolean b1=((a<b+c) & a>Math.abs(b-c));
			 boolean b2=((b<a+c) & b>Math.abs(a-c));
			 boolean b3=((c<b+a) & c>Math.abs(b-a));
			 boolean control=b1 && b2 && b3;
			 if(control==true) {
				 System.out.println("Edges of triangle are valid");
			 }
			 else
				 System.out.println("Edges of triangle are not valid");
		}
	}
}

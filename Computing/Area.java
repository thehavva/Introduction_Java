import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			final double PI= 3.14;
			System.out.println("Enter an integer :");
			int r=input.nextInt();
			double areaOfCircle=PI*r*r;
			double error= areaOfCircle - (int)areaOfCircle;
			System.out.println("Radius : "+ r
					+"\nArea of Circle : " +
					areaOfCircle + "\nError between double and int "
							+ "Area Of Circle :" + error);
		}
		
	}

}

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		 try (/*Write a program that reads a Celsius degree in 
				 a double value from the console, then converts it to Fahrenheit and displays the 
				 result.*/
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a degree in Celsius : ");
			double Celcius=input.nextDouble();
			double Fahrenheit=(9.0/5) * Celcius + 32;
			System.out.println(Celcius+" Celcius is "+Fahrenheit+" Fahrenheit");
		}
	}

}

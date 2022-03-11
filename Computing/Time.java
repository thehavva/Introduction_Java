import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a time in seconds");
			int seconds=input.nextInt();
			System.out.println("Total Seconds : "+seconds);
			int hours, minutes;
			hours=seconds/3600;
			minutes=(seconds%3600)/60;
			seconds=seconds%60;
			System.out.println("Seconds : "+seconds+"\nMinutes : "+minutes+
					"\nHours : "+hours);
		}
	}

}

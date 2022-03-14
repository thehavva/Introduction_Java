import java.util.Scanner;

public class acceleration {

	public static void main(String[] args) {
		try (/*(Physics: acceleration) Average acceleration is defined as the change of velocity 
				divided by the time taken to make the change. Write a program that prompts the user to enter the starting velocity v0 in meters/
				second, the ending velocity v1 in meters/second, and the time span t in seconds, 
				and displays the average acceleration.*/
		Scanner input = new Scanner(System.in)) {
			System.out.print("First velocity : ");
			int v0=input.nextInt();
			System.out.print("Second velocity : ");
			int v1=input.nextInt();
			System.out.print("Time interval : ");
			int t=input.nextInt();
			float a=(v1-v0)/(float)t;
			System.out.println("First velocity : "+v0
					+"\n"+"Second velocity : "+v1+"\n"+
					"Average acceleration is "+a+" in "+t+"s time interval.");
		}
	}

}

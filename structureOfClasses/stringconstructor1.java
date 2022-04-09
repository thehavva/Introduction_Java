import java.util.Scanner;

public class stringconstructor1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String s1=input.nextLine();
			char s2;
			for(int i=0; i<s1.length(); i++) {
				s2= s1.charAt(i);
				System.out.print(s2);
			}
		}
	}

}

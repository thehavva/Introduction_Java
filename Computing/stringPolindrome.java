import java.util.Scanner;

public class stringPolindrome {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a string : ");
			String str=input.nextLine();
			String temp="";
			for(int i=str.length()-1; i>=0; i--) {
				temp+=str.charAt(i);
			}
			if(temp.equals(str)) {
				System.out.println("Polindromik Number");
			}
			else
				System.out.println("Polindromik Number");
		}

	}

}

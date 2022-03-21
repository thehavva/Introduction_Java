public class switchCase {

	public static void main(String[] args) {
		int randomVariable=(int)(System.currentTimeMillis()%7);
		System.out.println("Random number : "+randomVariable);
		switch(randomVariable) {
		case 1:
			System.out.println("Sunday\n");
			break;
		case 2:
			System.out.println("Monday\n");
			break;
		case 3:
			System.out.println("Tuesday\n");
			break;
		case 4:
			System.out.println("Wednesday\n");
			break;
		case 5:
			System.out.println("Thursday\n");
			break;
		case 6:
			System.out.println("Friday\n");
			break;
		case 7:
			System.out.println("Saturday\n");
			break;
			default:
				System.exit(1);
		}
	}

}


public class student {
	private String name;
	private int point;
	private static int counter=0;
	
	student(String name,int point){
		this.name=name;
		this.point=point;
		student.counter++;
	}
	public static int howToStudent() {
		return student.counter;
	}
    public int getPoints(student s) {
    	return s.point;
    }
	public static double average(int[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return (sum/(double)arr.length);
	}
}

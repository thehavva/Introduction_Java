public class school {

	public static void main(String[] args) {
		student s1= new student("Havva",100);
		student s2= new student("Kerim",100);
		student s3= new student("Emre",100);
		student s4=new student("İbrahim",100);
		student s5=new student("Emer",100);
		System.out.println("Number of students : "+student.howToStudent());
	    int[] arr= new int[5];
	    arr[0]=s1.getPoints(s1);
	    arr[1]=s1.getPoints(s2);
	    arr[2]=s1.getPoints(s3);
	    arr[3]=s1.getPoints(s4);
	    arr[4]=s1.getPoints(s5);
		System.out.println("Average of student's points : "+student.average(arr));
	}

}

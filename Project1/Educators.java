package project1;

public abstract class Educators extends Employee{
	protected String[] lectures= new String[3];
	public Educators(String nameSurname, int age, double salary, double workHour, double rate, String[] lectures) {
		super(nameSurname, age, salary, workHour, rate);
		this.lectures = lectures;
	}
	public abstract String[] getLectures();
}
	

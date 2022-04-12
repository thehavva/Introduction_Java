package project1;

import java.util.Arrays;

public class Lecturer extends Educators {
	private String degree;
	private boolean extraWork; //Tubitak,Teknofest vs
	
	public Lecturer(String nameSurname, int age, double salary, double workHour, double rate, String[] lectures,
			String degree, boolean extraWork) {
		super(nameSurname, age, salary, workHour, rate, lectures);
		this.degree = degree;
		this.extraWork = extraWork;
	}
	public String[] getLectures() {
		return lectures;
	}
	public String getDegree() {
		return this.degree;
	}
	public boolean getExtraWork() {
		return this.extraWork;
	}
	@Override
	public double getSalary() {
		return this.salary;
	}
	@Override
	public double getWorkHour() {
		return this.workHour;
	}
	@Override
	public double getRate() {
		return this.rate;
	}
	@Override
	public double getNetsalary() {
		if(this.extraWork==false)
		    return ((this.workHour)*(this.rate)+(this.salary));
		else
			return ((this.workHour)*(this.rate)+(this.salary)+5000);
	}
	@Override
	public String toString() {
		return "Lecturer [degree=" + degree + ", extraWork=" + extraWork + ", lectures=" + Arrays.toString(lectures)
				+ ", salary=" + salary + ", workHour=" + workHour + ", rate=" + rate + ", nameSurname=" + nameSurname
				+ ", age=" + age + ", getNetsalary()=" + getNetsalary() + "]";
	}	
}

package project1;

import java.util.Arrays;

public class Assistant extends Educators{
     
	public Assistant(String nameSurname, int age, double salary, double workHour, double rate, String[] lectures) {
		super(nameSurname, age, salary, workHour, rate, lectures);
		
	}
	public String[] getLectures() {
		return this.lectures;
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
		 return ((this.workHour)*(this.rate)+(this.salary));
	}
	@Override
	public String toString() {
		return "Assistant [lectures=" + Arrays.toString(lectures) + ", salary=" + salary + ", workHour=" + workHour
				+ ", rate=" + rate + ", nameSurname=" + nameSurname + ", age=" + age + ", getNetsalary()="
				+ getNetsalary() + "]";
	}
	
}

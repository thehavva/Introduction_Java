package project1;

public class Officier extends Employee{

	
	public Officier(String nameSurname, int age, double salary, float workHour, double rate) {
		super(nameSurname, age, salary, workHour, rate);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalary() {
		return salary;
	}
	@Override
    public double getRate() {
    	return rate;
    }
	@Override
    public double getWorkHour() {
    	return workHour;
    }
	@Override
    public double getNetsalary() {
    	return ((this.workHour)*(this.rate)+(this.salary));
    }

	@Override
	public String toString() {
		return "Officier [salary=" + salary + ", workHour=" + workHour + ", rate=" + rate + ", nameSurname="
				+ nameSurname + ", age=" + age + ", getNetsalary()=" + getNetsalary() + "]";
	}

	
	
}

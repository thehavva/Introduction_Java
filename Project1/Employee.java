package project1;

public abstract class Employee extends School{
	protected double salary;
	protected double workHour;
	protected double rate;

	public Employee(String nameSurname, int age, double salary, double workHour, double rate) {
		super(nameSurname, age);
		this.salary = salary;
		this.workHour = workHour;
		this.rate = rate;
	}

    public abstract double getSalary();
    public abstract double getWorkHour();
    public abstract double getRate();
    public abstract double getNetsalary();
}

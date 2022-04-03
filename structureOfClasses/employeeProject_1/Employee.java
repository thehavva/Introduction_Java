
public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	Employee(String name, double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public double Tax() {
		if(this.salary<=1000) {
			return 0.0;
		}
		else {
			 double res=this.salary-1000;
			 return (res*0.03);
		}
			
	}
	public double Bonus() {
		if(this.workHours<40) {
			System.out.println("Not efficient work!");
			return 0;
		}
		else
			return (30*(this.workHours-40));
	}
	public double raiseSalary() {
		int year=2022-this.hireYear;
		double raiseOfSalary;
		if(year<10) {
			raiseOfSalary=this.salary*0.05;
		}
		else if(year>9 && year<20) {
			raiseOfSalary=this.salary*0.1;
		}
		else
			raiseOfSalary=this.salary*0.15;
		
		return raiseOfSalary;
	}
	public void toString(Employee e1) {
		System.out.println("Name : "+e1.name);
		System.out.println("Brut Salary : "+e1.salary);
		System.out.println("Tax : "+e1.Tax());
		System.out.println("Bonus : "+e1.Bonus());
		System.out.println("Increase Salary in years : "+e1.raiseSalary());
		double n_salary=e1.salary-e1.Tax()+e1.Bonus()+e1.raiseSalary();
		System.out.println("Total Salary : "+n_salary);
	}
}

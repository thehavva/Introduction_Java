package project1;

public class School implements ISchool {
	protected String nameSurname;
	protected int age;
	public static int users=0;
	
	public School(String nameSurname, int age) {
		this.nameSurname = nameSurname;
		this.age=age;
		this.enterToSchool();
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	@Override
	public int enterToSchool() {
		System.out.println("Person is entered"+"\n"+"Total people : "+(++School.users));
		return (School.users);
	}
	
}

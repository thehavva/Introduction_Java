package project1;

public class Student extends School{
    private  int schoolNumber;
    private char scholarship;
	public Student(String nameSurname, int age, int schoolNumber, char scholarship) {
		super(nameSurname, age);
		this.schoolNumber = schoolNumber;
		this.scholarship = scholarship;
	}
	
	public int getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public String getScholarship() {
		String s = null;
		if(this.scholarship=='+') {
			s="Yes";
		}
		else if(this.scholarship=='-') {
			s="No";
		}
	    return s;
	}

	public void setScholarship(char scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return "Student [schoolNumber=" + schoolNumber + ", scholarship=" + scholarship + ", nameSurname=" + nameSurname
				+ ", age=" + age + ", getScholarship()=" + getScholarship() + "]";
	}

    
	
}

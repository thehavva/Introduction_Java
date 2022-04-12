package project1;

import static project1.ISchool.nameOfSchool;

public class mainClass {

	public static void main(String[] args) {
		String[] lecturs=new String[3];
		School officier=new Officier("Neriman Altundað",45,5400.0,(float)40.5,25);
		System.out.print(nameOfSchool+"\t");
		System.out.println(officier.toString());
		lecturs=makeLecturs1();
		School lecturer1= new Lecturer("Ahmet Sayýlmaz",42,8000,50,42.5,lecturs,"Dr.",false);
		System.out.print(nameOfSchool+"\t");
		System.out.println(lecturer1.toString());
		lecturs=makeLecturs2();
		School lecturer2= new Lecturer("Cem Daðdelen",45,10000,60,45.5,lecturs,"Prof.",true);
		System.out.print(nameOfSchool+"\t");
		System.out.println(lecturer2.toString());
		lecturs=makeLecturs4();
		School asistant= new Assistant("Kemal Yüksek",28,6000,20,30,lecturs);
		System.out.print(nameOfSchool+"\t");
		System.out.println(asistant.toString());
		School student1=new Student("Havva Yýlmaz",21,1011011,'+');
		System.out.print(nameOfSchool+"\t");
		System.out.println(student1.toString());
}
	public static String[] makeLecturs1() {
		String[] lecturs1=new String[3];
		lecturs1[0]="Calculus";
		lecturs1[1]="Physics 2";
		lecturs1[2]="Electronics";
		return lecturs1;
	}
	public static String[] makeLecturs2() {
		String[] lecturs1=new String[3];
		lecturs1[0]="Engineering Math";
		lecturs1[1]="Digital Design";
		lecturs1[2]="Computer Tools";
		return lecturs1;
	}
	public static String[] makeLecturs3() {
		String[] lecturs1=new String[3];
		lecturs1[0]="Numerical Methods";
		lecturs1[1]="Physics 1";
		lecturs1[2]="Magnetic Fields";
		return lecturs1;
	}
	public static String[] makeLecturs4() {
		String[] lecturs1=new String[2];
		lecturs1[0]="Design Lab 1";
		lecturs1[1]="Electronic Lab";
		return lecturs1;
	}
}
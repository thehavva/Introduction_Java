import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterOperation {
	public static void main(String[] args) {
		//writing();
		reading();
	}
	public static void reading() {
		File myFile= new File("writing1");
		FileReader freader=null;
		try {
			freader= new FileReader(myFile);
			int c=0;
			while((c=freader.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(freader!=null) {
			try {
				freader.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			}
		}
	}
	public static void writing() {
		File myFile= new File("writing1");
		FileWriter fwiter=null;
		Scanner input= new Scanner(System.in);
		String name;
		try {
			fwiter= new FileWriter(myFile);
			System.out.println("File will be created!");
			System.out.print("Enter your name : ");
			name=input.nextLine();
			fwiter.write(name);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fwiter.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			input.close();
		}
	}
}

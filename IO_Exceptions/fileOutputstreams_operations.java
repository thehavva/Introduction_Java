import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputstreams_operations {
	public static void main(String[] args) {
		File file=new File("stream1.txt");
		FileInputStream freader=null;
		try {
			freader= new FileInputStream(file);
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
		/*FileOutputStream fileOut=null;
		try {
			fileOut= new FileOutputStream(file);
			fileOut.write("Havva was here!".getBytes());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fileOut==null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
	}
}

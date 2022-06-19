import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileInputStream {
	public static void main(String[]args) throws IOException {
		inputReading();
	}
	public static void inputReading() throws IOException {
		File file= new File("stream1.txt");
		FileInputStream fileInput=null;
		InputStreamReader fileReader=null;
		BufferedReader bufferReader=null;
		try {
			fileInput = new FileInputStream(file);
			fileReader = new InputStreamReader(fileInput);
			bufferReader = new BufferedReader(fileReader);
			String line=null;
			while((line=bufferReader.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(bufferReader != null) {
				bufferReader.close();
			}
		}
		if(fileReader!=null) {
			fileReader.close();
		}
		if(fileInput!=null) {
			fileInput.close();
		}
	}
}

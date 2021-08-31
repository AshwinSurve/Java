package FilesOperations;
import java.io.*;
public class BufferedWriterExp {
	public static void main(String args[]) {
		String fileName = "fileTe.txt";
		
		try {
			FileWriter fw = new FileWriter(fileName);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Hello Everyone,");
			bw.write(" What is going on.");
			bw.newLine();
			bw.write("Lets catch tommorrow.");
			bw.close();
		}
		catch(IOException ex) {
			System.out.println("Error");
		}
		finally {
			System.out.println("writing done");
		}
	}
}

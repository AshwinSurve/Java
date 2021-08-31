package FilesOperations;
import java.io.*;

public class FileOperate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1 = "Performing File Operations.";
		
		FileWriter fw = new FileWriter("Desktop/TextFile.txt");
		
		for(int i = 0;i < s1.length();i++) {
			fw.write(s1.charAt(i));
		}
		System.out.println("Write Operation Done.");
		fw.close();

	}

}

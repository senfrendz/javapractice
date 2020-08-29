package FileOps;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class usingFileMethods {

	static String content = "Learning Java, will knock the success door soon";
	
	 static String location = "pathtest.txt";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	/*	
		FileWriter fw = new FileWriter(location);
		fw.write(content);
		fw.close();   
		
		// Using BufferedWritter
		
		FileWriter fw = new FileWriter(location);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(content);

		bw.close();
		
		FileOutputStream fout = new FileOutputStream(location);
		byte[] writearea =content.getBytes();
		fout.write(writearea);
		fout.close();*/
		
		Path thepath = Paths.get(location);
		Files.write(thepath, content.getBytes());
		
	}

}

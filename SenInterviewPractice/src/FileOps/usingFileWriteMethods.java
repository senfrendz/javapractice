package FileOps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class usingFileWriteMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "Cookies.data";
		FileReader FR = new FileReader(location);
		BufferedReader read = new BufferedReader(FR);

		String content;
		while((content=read.readLine())!=null) {
			System.out.println(content);

		}
		
	}

}

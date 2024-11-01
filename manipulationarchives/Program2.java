package manipulationarchives;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		
		String [] lines = new String [] { "Breno Nunes", "Samuel Nunes", "Jadna Nunes"};
		
		String path = "C:\\Users\\Fitlogistica\\eclipse-workspace\\src\\programar\\src\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter	(new FileWriter(path, true))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

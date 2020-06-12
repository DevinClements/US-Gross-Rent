package finalproject;

import java.util.*;
import java.io.*;

public class Project {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter trainingset = new PrintWriter(new File("trainingdata.csv"));
		PrintWriter testset = new PrintWriter(new File("testingdata.csv"));
		
		String name = "Final_Project_Data.csv";
		Reader data = new FileReader(name);
		String line = "";
		int counting = 0;
		int total = 40425 ;
		
		BufferedReader buff = new BufferedReader(data);
		
		while((line = buff.readLine()) != null) {
			
			counting++;
			
			if(counting != 1 && counting < (total * .8)) {
				trainingset.print(line);
				trainingset.println();
			}
			else if(counting != 1 && counting > (total * .8)){
				testset.print(line);
				testset.println();
			}
		}
		
		System.out.println("Training Set Entries");
		System.out.println();

		name = "trainingdata.csv";
		data = new FileReader(name);
		buff = new BufferedReader(data);
		
		for(int i = 0; i < 10; i++) {
			
			line = buff.readLine();
			System.out.println(line);
		}
		
		System.out.println();
		
		System.out.println("Testing Set Entries");
		System.out.println();

		name = "testingdata.csv";
		data = new FileReader(name);
		buff = new BufferedReader(data);
		
		for(int i = 0; i < 10; i++) {
			
			line = buff.readLine();
			System.out.println(line);
		}

	}
	
}
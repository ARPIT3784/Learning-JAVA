package Unit_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class p15_FileHandlingInJava {

	public static void main(String[] args) {
		
		
		FileHandlingInJava obj= new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoFile();
		obj.createALogFile();
		
	}

}

class FileHandlingInJava
{
	void takeInputFromAFileNotFromConsole()
	{
		String path = "input.txt" ;
	    File file = new File(path) ;
	    
	    BufferedReader br = new BufferedReader(new FileReader(file)) ;
	    String st; 
	    while((st = br.readLine()) != null) {
	    	System.out.println(st);
	    }
	    
	    List<String> listOfStrings = new ArrayList<String>() ;
	    String line  = br.readLine();
	    while(line != null) {
	    	listOfStrings.add(line) ;
	    	line = br.readLine();
	    
	    }
	    for(String str : listOfStrings) {
	    	System.out.println(str) ;
	    	
	    }
	    System.out.println("\n");
	    br.close();
	}
	
	void saveOutputIntoFile()
	{
			
	}
	
	void createALogFile()
	{
		
	}
}

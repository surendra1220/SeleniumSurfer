package cracker;

import java.io.FileNotFoundException;
import java.io.FileReader;

import au.com.bytecode.opencsv.CSVReader;

public class ReadDataFromCSV {
	
	private static final String FilePath = "D:\\StreamFiles\\CSVReadFormat.csv";
	
	public void ReadCSV() throws Exception 
	{
		CSVReader reader = new CSVReader(new FileReader(FilePath));
		String[] nextLine;
		
		while((nextLine = reader.readNext())!=null)
		{
			//System.out.println(“Value 1 : [” + nextLine[0] + “]\n Value 2 : [” + nextLine[1] + “]\n Value 3 :[” + nextLine[2] + “]\n Value 4 :[” + nextLine[3] + “]”);
			System.out.println("Value 1: " +nextLine[0] + "\n" +  "Value 2: " +nextLine[1] + "\n" + "Value 3: " +nextLine[2] + "\n" +  "Value 4: " +nextLine[3] + "Value 5: " +nextLine[4] + "\n" +  "Value 6: " +nextLine[5]);
		}
	}

	
	public static void main (String[] args) throws Exception
	{
		ReadDataFromCSV rdfc = new ReadDataFromCSV();
		rdfc.ReadCSV();
	}
}

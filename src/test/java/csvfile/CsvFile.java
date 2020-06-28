package csvfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvFile {

	public static void main(String[] args) {

		writeCsvFile(".\\src\\test\\resources\\CSVfile\\Emplyee2.csv");
		readCsvFile(".\\src\\test\\resources\\CSVfile\\Emplyee2.csv");
	}
	
	public static void readCsvFile(String filepath) {

		FileReader fileReader;
		try {
			fileReader = new FileReader(new File(filepath));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String[] temp;
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {

				temp=line.split(",");
				for(String data:temp) {
					System.out.print(data+" ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeCsvFile(String filepath) {
		
		try {
			FileWriter writer = new FileWriter(new File(filepath),true);
			CSVWriter csvWriter = new CSVWriter(writer);
			
			String [] header= {"Empid","Ename","Designation","MobileNo"};
			String [] row1 = {"101","lokesh","Sdet","8618958034"};
			String [] row2 = {"102","anusha","ATE","1234567890"};
			String [] row3 = {"103","anvita","SDET","2234567890"};
			
			List<String[]> allData = new ArrayList<String[]>();
			allData.add(header);
			allData.add(row1);
			allData.add(row2);
			//csvWriter.writeAll(allData);
			    
			csvWriter.writeNext(row3);
			csvWriter.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		
		
			writePropertiesFile();		
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu o leguma: ");
			String leguma = scan.next();
			
			String rezultat = readPropertiesFile(leguma);
			
			if(rezultat.equals("negasit")) System.out.println("Leguma nu a fost gasita");
			else {
				System.out.println("Leguma a fost gasita: "+ rezultat);
			}
		
	}
	
	public static void writePropertiesFile(){

		try (OutputStream outPutStream = new FileOutputStream("calorii.properties")) {
			Properties propFile = new Properties();
			propFile.setProperty("morcov", "15");
			propFile.setProperty("castravete", "20");
			propFile.setProperty("rosie", "25");
			propFile.setProperty("ardei", "30");
			propFile.setProperty("ceapa", "35");
			propFile.store(outPutStream, "am salvat fisier properties");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String readPropertiesFile(String key) {

		try (FileInputStream inputStream = new FileInputStream("calorii.properties")) {
			Properties prop = new Properties();
			prop.load(inputStream);

			String value = prop.getProperty(key);
			if(value != null) return value;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "negasit";
	}
}

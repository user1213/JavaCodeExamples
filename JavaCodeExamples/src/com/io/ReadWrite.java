/***
 * @author: sagar
 * @description: Read Write operations 
 */
package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite {

	private static final String PATH = "/Users/sagarmi/Downloads/Oct2/io.txt";
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw;
	
	public static void writeToFile(String path, String txt){
		try{
			File file = new File(path);
			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(txt);
			bw.newLine();
			bw.flush();		
			System.out.println("written to file");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void readFromFile(String path) throws IOException{
		File file = new File(path);
		BufferedReader br = null;
		if(!file.exists()){
			System.out.println("Please create file first");
		}
		else{
			try {
				FileReader fr = new FileReader(file);
				br = new BufferedReader(fr);
				String line = br.readLine();
				while(line != null){
					System.out.println(line);
					line = br.readLine();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(br != null){
					try{
						br.close();
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the text: ");
		String str = br.readLine();
		writeToFile(PATH, str);
		System.out.println("Continue ? (Y/N)");
		String response = br.readLine();
		while(response.equalsIgnoreCase("y")){
			System.out.println("Enter the text: ");
			str = br.readLine();
			writeToFile(PATH, str);
			System.out.println("Continue ? (Y/N)");
			response = br.readLine();
		}
		System.out.println("\n\nReading file contents....\n\n");
		readFromFile(PATH);
	}

}

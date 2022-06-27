package FileIO;

import java.io.*;

public class FileInputAndOuptputStream {
	static void fileWrite() throws IOException {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\DemoFile.txt");
			String s="I LOVE TAMIL";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	 static void fileRead() throws IOException {
		 try {
			FileInputStream fin=new FileInputStream("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\DemoFile.txt");
			int i;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
				
			}
			fin.close();
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 
		
	}

	public static void main(String[] args)throws IOException  {
		//fileWrite();
		fileRead();
		

	}

	

}

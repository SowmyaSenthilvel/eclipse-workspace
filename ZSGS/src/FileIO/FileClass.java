package FileIO;

import java.io.File;
import java.io.IOException;



public class FileClass {
	public static void createFolder() {
		File f=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\SUBFOLDER\\NOTSUB");
		boolean isFile=f.exists();
		System.out.println("Folder is present :"+isFile);
		if(isFile==false) 
			f.mkdirs();
		
		isFile=f.exists();
		System.out.println("Now Folder is present :"+isFile);

	}
	
	public static void createFile() { 
		File file=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\not.txt");
		boolean f1=file.exists();
		if(f1 == false) {
			try {
				boolean yes=file.createNewFile();
				System.out.println("File Created " + yes);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	public static void deleteFile() {
		File f=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\not.txt");
		f.delete();
	}
	
	public static void renameFile() {
		File f=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\new.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File newName=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER\\VeryNew.txt");
		boolean rename=f.renameTo(newName);
		System.out.println("REnamed "+rename);
		System.out.println("\nPrinting a file");
		System.out.println("Printing file Name "+newName.getName()	);
	}
	//print list of files in a folder
	public static void listingFiles() {
		File file=new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\NEWFOLDER");
		String[] listOfFiles=file.list();
		for(String i:listOfFiles) {
			System.out.println(i);
		}
		
	}
	
	//print only files in a directory 
	

	public static void main(String[] args) {
		System.out.println("Creating Folder in java");
		createFolder();
		System.out.println("Creating File in java");
		createFile();
		System.out.println("Deleting a File");
		deleteFile();
		System.out.println("Renaming a file");
		renameFile();
		System.out.println("Lis of files in folder");
		listingFiles();
	}

}

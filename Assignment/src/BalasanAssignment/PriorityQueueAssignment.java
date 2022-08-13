package BalasanAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class PriorityQueueAssignment {
	private PriorityQueue<File> pqueue=new PriorityQueue<File>(new FileComparator());
	public static void main(String[] args) throws FileNotFoundException {
		PriorityQueueAssignment pq=new PriorityQueueAssignment();
		
		pq.lengthoffile();

	}
	public void lengthoffile() throws FileNotFoundException{
		File f=new File("D:\\New folder");
		int count=0;
		for(File s:f.listFiles()) {
			String str=s.toString();
			File file=new File(str);
			pqueue.add(file);
		}
		System.out.println(pqueue.toString());
		for(File f1:pqueue) {
			Scanner s=new Scanner(f1);
			System.out.println("Files:" +f1);
			while(s.hasNext()) System.out.println(s.nextLine());
		    System.out.print(" len => "+f1.length());
		    System.out.println();
				
			}
	}

}

package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Students implements Comparable<Students> {

	String name;
	int mark;

	public Students(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.mark = i;

	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub

		return this.mark - o.mark;

	}

}

public class SampleComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students studen1t = new Students("Robin", 7);
		Students studen2t = new Students("Kanna", 6);
		Students studen3t = new Students("Kes", 10);

		ArrayList<Students> arrayList = new ArrayList<>();
		arrayList.add(studen1t);
		arrayList.add(studen2t);
		arrayList.add(studen3t);

		Collections.sort(arrayList);

		for (Students student : arrayList) {
			System.out.println(student.name);
		}

	}

}

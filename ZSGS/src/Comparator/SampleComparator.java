package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class STudent {

	String name;
	int mark;

	public STudent(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.mark = i;

	}

}

class NameWiseSorter implements Comparator<STudent> {

	@Override
	public int compare(STudent o1, STudent o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

class MarkWiseSorter implements Comparator<STudent> {

	@Override
	public int compare(STudent o1, STudent o2) {
		// TODO Auto-generated method stub
		return o1.mark - o2.mark;
	}

}

public class SampleComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		STudent studen1t = new STudent("Robin", 7);
		STudent studen2t = new STudent("Kanna", 6);
		STudent studen3t = new STudent("Kes", 10);

		ArrayList<STudent> arrayList = new ArrayList<>();
		arrayList.add(studen1t);
		arrayList.add(studen2t);
		arrayList.add(studen3t);

		// Collections.sort(arrayList, new NameWiseSorter());
		Collections.sort(arrayList, new MarkWiseSorter());

		for (STudent STudent : arrayList) {
			System.out.println(STudent.name);
			System.out.println(STudent.mark);
		}

	}

}

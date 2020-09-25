package popups;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Theo");
		al.add("Jimmy");
		al.add("Smithy");
		System.out.println(al.size());
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<>(al);
		al1.add("Black");
		al1.add("Kirani");
		
		//al1.addAll(al);
		System.out.println(al1.size());
		System.out.println(al1);
		
		System.out.println(al.get(2));
		
	}

}

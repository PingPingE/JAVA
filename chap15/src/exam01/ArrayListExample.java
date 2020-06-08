package exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("hello");

		System.out.println(list.size());
		System.out.println(list);
		System.out.println();
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		list.remove(0);
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println();
		list.remove("hello");
		list.add("h");
		
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		
	}
}

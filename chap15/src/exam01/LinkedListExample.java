package exam01;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("java");
		list.add("jdbc");
		list.add("database");
		System.out.println(list.size());
	}
}

package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Java");
		set.add("JDBC");
		set.add("iBATIS");
		set.add("Java");
		
		int size = set.size();
		System.out.println("총 개수:"+size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String element = it.next();
			System.out.println("\t" + element);
		}
		
		
	}
}

package exam02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassmateTest {
	public static void main(String[] args) {
		List<ClassMate> classs = new LinkedList<>();
		
		classs.add(new ClassMate(20000, "가"));
		classs.add(new ClassMate(20001, "나"));
		classs.add(new ClassMate(20002, "다"));
		
		Collections.sort(classs); // 오름차순
		
		for(ClassMate c : classs)
			System.out.println(c);
		
		//내림차순 방법 1
		System.out.println();
		Collections.sort(classs, Collections.reverseOrder());//내림차순
		for(ClassMate c : classs)
			System.out.println(c);
		
		System.out.println();
		
		//내림차순 방법 2: 기준을 맘대로 정할 수 있어서 좋음
		Collections.sort(classs, ClassMate.comparator_name);
		
		for(ClassMate c : classs)
			System.out.println(c);
	}
}

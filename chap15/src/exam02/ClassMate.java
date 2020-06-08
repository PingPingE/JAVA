package exam02;

import java.util.Comparator;

public class ClassMate implements Comparable<ClassMate>  {
	private String name;
	private int sno;
	public ClassMate(int sno, String name) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "ClassMate [name=" + name + ", sno=" + sno + "]";
	}

	@Override
	public int compareTo(ClassMate o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	 public static Comparator<ClassMate> comparator_name =
			 new Comparator<ClassMate>() 
			 {
		 @Override
		 public int compare(ClassMate o1, ClassMate o2)
		 {
			 //원래는 -1: o1이 작음         0:같음       1:o1이 더 큼
			 return o1.name.compareTo(o2.name) * -1; //내림차순으로 바꾸기 위해서 -1을 곱해주는 것임
		 }
			 };
	
}

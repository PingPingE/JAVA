package exam03;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	//과목
	private int kor;
	private int eng;
	private int math;
	
	//총점
	private int total;
	private double avg;
	
	public Student(int id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + "]";
	}


	//기본-학생번호 순서로 정렬 되도록 
	@Override
	public int compareTo(Student o) {
		//오름차순
		Integer tmp = new Integer(id);
		return tmp.compareTo(o.id);
	}
	
	//총점 순으로 정렬하도록
	public static Comparator<Student> sortTotal = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			//내림차순
			Integer tmp = new Integer(o1.total);
			return tmp.compareTo(o2.total)*-1;
		}
	};
	
	

}

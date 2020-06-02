package exam01;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		int result = Objects.compare(s3, s1, new StudentComparator()); //-1: 왼쪽값이 더 작음, 0: 같음, 1: 왼쪽값이 더 큼
		System.out.println(result);
		}
		static class Student{
			int sno;
			public Student(int sno)
			{
				super();
				this.sno = sno;
			}
		}
		
		static class StudentComparator implements Comparator<Student>
		{

			@Override
			public int compare(Student a, Student b) {
				// TODO Auto-generated method stub
				return Integer.compare(a.sno, b.sno);
			}
			
		}
	}


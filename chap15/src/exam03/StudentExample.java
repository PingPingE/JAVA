package exam03;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import exam02.ClassMate;

public class StudentExample {
	public static void main(String[] args) {
		List<Student> student = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int inp;
		String subName[] = {"국어" ,"영어", "수학"};
		//public Student(int id, String name, int kor, int eng, int math) 
		do {
			System.out.println("----------------------------------------");
			System.out.println(" 1: 입력   2: 삭제   3:성적리스트  4:종료");
			System.out.println("----------------------------------------");
			inp = sc.nextInt();
			if(inp == 1) //삽입
			{
				int subject[] = new int[3];
				while(true)
				{
					System.out.println("ID를 입력하세요");
					int sid = sc.nextInt();
					Iterator<Student> it = student.iterator();
					//ID중복여부 체크
					boolean stat = false;
					while(it.hasNext())
					{
						if(it.next().getId() == sid)
						{
							stat = true;
							break;
						}
					}
					//ID중복이면 다시
					if(stat) 
					{
						System.out.println("이미 존재하는 ID입니다. 다시 입력해주세요");
						continue;
					}
					
					System.out.println("이름을 입력하세요");
					String sName = sc.next();
					for(int i = 0; i<3; i++)
					{
						System.out.println(subName[i]+"성적을 입력하세요.");
						subject[i] = sc.nextInt();
					}
					student.add(new Student(sid, sName, subject[0], subject[1], subject[2]));
					break;
				}
			}
			else if(inp == 2)//삭제
			{
				System.out.println("삭제할 ID를 입력하세요");
				int targetId = sc.nextInt();
				Iterator<Student> it = student.iterator();
				while(it.hasNext())
				{
					Student nextS = it.next();
					if(nextS.getId() == targetId)
					{
						student.remove(nextS);
						break;
					}
				}
			}
			else if(inp == 3)//순위 정렬 후 프린트
			{
				System.out.println("1: 학생번호 순  2: 총점 순");
				int n = sc.nextInt();
				if(n==1)
				{
					Collections.sort(student);
				}
				else
				{
					Collections.sort(student, Student.sortTotal);
				}
				for(Student s: student)
					System.out.println(s.toString());
			}
		}
		while(inp != 4);
		System.out.println("종료되었습니다.");
	}
}

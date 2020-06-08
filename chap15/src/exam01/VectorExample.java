package exam01;

import java.util.List;
import java.util.Vector;

//Vector는 멀티스레드가 동시에 이 메소드를 실행할 수 없다. 즉, 한 스레드가 실행을 완료해야만 다른 스레드가 실행할 수 있다
//그래서 ArrayList보단 멀티스레드 환경에서 안전하다(Thread Safe)
public class VectorExample {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("java");
		list.add("jdbc");
		
		System.out.println(list.size());
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
}

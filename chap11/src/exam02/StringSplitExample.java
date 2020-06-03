package exam02;

import java.util.StringTokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text ="홍길동&이수홍,박연수,김자바-최명호";
		String names[] = text.split("&|,|-");
		for(String name:names)
			System.out.println(name);
		StringTokenizer st = new StringTokenizer("빈/홍/동/수","/");
		
		//토큰 추출 방법 1
//		int total = st.countTokens();
//		for(int i=0; i<total; i++)
//			System.out.println(st.nextToken());
		
		//방법 2
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
	}
}

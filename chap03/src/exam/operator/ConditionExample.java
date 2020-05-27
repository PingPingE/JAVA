package exam.operator;

import java.util.Scanner;

public class ConditionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int score = sc.nextInt();
		char grade = (score>90? 'A':(score > 80? 'B': 'C'));
		System.out.println("당신의 성적은:"+grade+"\n통과여부:"+ (grade<=66?"pass":"fail"));
		
	}
}

package exam.condition;
import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지 입력:");
		System.out.println("프로그램을 종료하려면 q를 입력");
		Scanner sc = new Scanner(System.in);
		String inputString;
		do{
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}
		while(! inputString.equals("q")); //문자열 비교는 equals
		
		System.out.println("\n프로그램 종료");
	}
}

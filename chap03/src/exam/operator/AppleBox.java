package exam.operator;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과의 총개수");
		int apple = scan.nextInt();
		System.out.println("한 박스 당 사과수를 입력하시오 ");
		int n =scan.nextInt();
		System.out.println("사과의 총 개수:"+apple+"\n"+n+"묶음씩 박스 총 개수:"+apple/n + "\n나머지:"+apple%n);
	}

}

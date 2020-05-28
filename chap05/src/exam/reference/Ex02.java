package exam.reference;
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 학생 수 입력");
		int totalN = sc.nextInt();
		int[] students = new int[totalN+1];
		int sum = 0;
		System.out.println(totalN+"명의 점수 입력하시오.");
		for(int i=0; i<totalN; i++)
		{
			System.out.println((i+1) + "번째 점수 입력");
			students[i] = sc.nextInt();
			sum += students[i];
		}
		System.out.println("총점: "+sum+"\n평균: "+(double)sum/totalN);
		sc.close();
	}
}

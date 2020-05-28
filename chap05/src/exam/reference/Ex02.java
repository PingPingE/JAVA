package exam.reference;
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students[] = new int[11];
		int sum = 0;
		for(int i=0; i<10; i++)
		{
				students[i] = sc.nextInt();
				sum += students[i];
		}

		System.out.println("총점: "+sum+"\n평균: "+(double)sum/10);
		
	}
}

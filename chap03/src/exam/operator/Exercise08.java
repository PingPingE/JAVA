package exam.operator;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		double z = x%y;
		if(Double.isNaN(z))
		{
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else
		{
			double result = z+10;
			System.out.println("결과:"+z);
		}
	}
}

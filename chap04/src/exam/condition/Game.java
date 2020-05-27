package exam.condition;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(cnt <4)
		{
			System.out.println("정답 수:"+cnt);
			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			System.out.println("예상:");
			//int player = sc.nextInt();
			String player = sc.next();
//			if(player>=1 && player<=6)
//			{
//				if(com == player)
//					{
//						cnt ++;
//						System.out.println("정답입니다.");
//						if(cnt ==5)
//							break;
//					}
//				
//				else
//					System.out.println("다음 기회에");
//			}
//			else
//				System.out.println("범위를 초과함");
//		}
		System.out.println("정답 수:"+cnt);
	}
}

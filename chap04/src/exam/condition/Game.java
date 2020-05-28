package exam.condition;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(cnt <=4)
		{
			System.out.println("정답 수:"+cnt);
			char com = (char)(Math.random()*6+1 +'0');
			System.out.println(com);
			System.out.println("예상:");
			//int player = sc.nextInt();
			String player = sc.nextLine();
			if(!('0' <= player.charAt(0) && player.charAt(0)<='9'))
			{
				System.out.println("숫자를 입력해주십시오");
				player = sc.nextLine();
			}
			System.out.println(player.charAt(0));
			if(player.charAt(0) >= '0' && player.charAt(0)<='6')
			{
				if(com== player.charAt(0))
					{
						cnt ++;
						System.out.println("정답입니다.");
						if(cnt ==5)
							break;
					}
						
				else
					System.out.println("다음 기회에");
			}
			else
				System.out.println("범위를 초과함");
		}
		System.out.println("정답 수:"+cnt);
	}
}


package exam.condition;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed  = 0;
		int keyCode = 0;
		while(run)
		{
			if(keyCode !=13 && keyCode!=10) //Enter가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력됨
			{//메뉴 생성
				System.out.println("----------------------------");
				System.out.println("1. 증속| 2. 감속 | 3. 중지");				
				System.out.println("----------------------------");
				System.out.println("선택: ");
			}
			keyCode = System.in.read(); // 키보드의 키 코드를 읽음
			if (keyCode == 49)
			{
				speed++;
				System.out.println("현재 속도:" + speed);
			}
			else if (keyCode ==50)
			{
				speed--;
				System.out.println("현재 속도:" + speed);
			}
			else if(keyCode == 51)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

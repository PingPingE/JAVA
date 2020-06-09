package ex01;
import java.util.*;
public class StructureProgram {
	// 사용자입력IO
		static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			// 점수배열
			ExamConsole list = new ExamConsole();
			list.init(new Exam[3], 0);
			int menu;
			boolean keepLoop = true;

			while (keepLoop) {
				// 메뉴 출력
				list.printMenu();
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					// 점수 입력
					list.setExams();
					break;
				case 2:
					// 점수 출력
					list.print();
					break;
				case 3:
					// 프로그램종료
					System.out.println("Bye~~");
					scan.close();
					keepLoop = false;
					break;
				default:
					System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
				}
			}
		}
}

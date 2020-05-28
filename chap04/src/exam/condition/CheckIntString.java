package exam.condition;
import java.util.Scanner;

public class CheckIntString {
	public static void main(String[] args) {
		char tmp;
		boolean output = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("판별할 문자열 입력:");
		String input = scan.nextLine(); //한줄 다 읽어들임(파이썬 readline)
		
		for (int i=0; i<input.length(); i++)
			{
				tmp = input.charAt(i); 	//문자열에서 해당 인덱스 참조
				if(!('0' <= tmp && tmp<='9')) //'0~9'가 아니면 false로
					{
						output = false;
						break;
					}
			}
		System.out.println("숫자여부:"+output);
	}
}

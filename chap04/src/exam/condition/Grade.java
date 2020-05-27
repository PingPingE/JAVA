package exam.condition;
import java.util.*;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int score = sc.nextInt();
		
		//삼항연산자
		String grade = score/10 == 10? "A+": (score/10 == 9? "A":(score/10 == 8? "B": (score/10 == 7? "C": (score/10 == 6? "D":"F"))));
		System.out.println(grade);
		
		//switch
		switch(score/10)
		{
		case 10:
			grade = "A+";
			break;
		case 9:
			grade= "A";
			break;
		case 8:
			grade ="B";
			break;
		case 7:
			grade ="C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;	
		}
		System.out.println(grade);
	}

}

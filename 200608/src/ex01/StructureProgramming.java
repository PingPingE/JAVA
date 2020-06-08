package ex01;

import java.util.Scanner;

public class StructureProgramming {
	static Scanner scan = new Scanner(System.in);
	static String[] name= {"국어","영어","수학"};
	static ExamList list  = new ExamList();
	public static void main(String[] args) {
		int menu;
		boolean keepLoop = true;		
		while (keepLoop) {
			printmenu();
			menu = scan.nextInt();

			switch (menu) {
				case 1:
					inputScore(list);
					break;
				case 2:
					printScore(list);
					break;
				case 3:
					System.out.println("Bye~~");
					scan.close(); 
					keepLoop = false;
					break;
				default:
					System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}		
	}
    
    public static void printmenu() {
    	System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                       │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
    }
    
    public static void inputScore(ExamList list) {
    	System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		System.out.println("몇 명을 입력하시겠습니까?");
		int num = scan.nextInt();
		for(int i= 0 ; i<num; i++){
			int score[] = {0,0,0};
			for (int j=0; j<3; j++)
			{
				while(true)
				{
					System.out.printf("%s 입력 >  ",name[j]);
					score[j] = scan.nextInt();
					if(score[j]<0 || score[j]>100)
						{System.out.println("0이상 100이하로 입력하십시오");
						continue;}
					break;
				}
			}
			list.setExams(new Exam(score[0], score[1], score[2]));
			list.current++;
		}
		
		System.out.println("─────────────────────────────");
    }
    
    public static void printScore(ExamList list) {
    	try
    	{
	    	int total[] = {0,0,0};
	    	
	    	for (int i= 0; i<list.current; i++)
	    	{
	    		total[0] += list.exams[i].getKor();
	    		total[1] +=list.exams[i].getEng();
	    		total[2] +=list.exams[i].getMath();
	    	}
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  출력                      │");
			System.out.println("└───────────────────────────┘");
			System.out.println();
	
			for (int i = 0; i < list.current; i++)
				System.out.printf("%s %d : %3d\t %s %d : %3d\t %s %d : %3d\n",name[0],i+1, list.exams[i].getKor(),
						name[1],i+1, list.exams[i].getEng(),name[2],i+1, list.exams[i].getMath());
			for (int i = 0; i < 3; i++)
				System.out.printf("%s 총점 : %3d\t", name[i], total[i]);
			System.out.println();
			for (int i = 0; i < 3; i++)
				System.out.printf("%s 평균 : %3.1f\t", name[i], total[i]/(float)(list.current));
			System.out.println();		
			System.out.println("─────────────────────────────");
    	}
    	catch(Exception e)
    	{
    		System.out.println("입력된 점수가 없습니다.");
    	}
	}
}

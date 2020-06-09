package ex02;

import java.util.Scanner;

import ex01.Exam;
import ex01.ExamList;

public class ExamConsole {
	private ExamList list;
	private Scanner scan = new Scanner(System.in);
	public int getCurrent()
	{
		return list.getCurrent();
	}
	
	public void init( Exam[] exams,int current) {
		list = new ExamList(current, exams);
	}
	
	public void printMenu() {
		System.out.println("┌───────────────────┐");
		System.out.println("│          메인 메뉴                  │");
		System.out.println("└───────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
	}
	public void setExams() {
		list.setExam(new Exam());
		Exam exTemp = list.getExam(list.getCurrent());//연산을 조금이라도 줄이기 위함
		System.out.println("┌────────────────────┐");
		System.out.println("│          성적  입력                  │");
		System.out.println("└────────────────────┘");
		System.out.println();
		
		do {
			System.out.print("국어 : ");
			exTemp.setKor(scan.nextInt());

		} while (exTemp.getKor()< 0 || 100 <exTemp.getKor());
		do {
			System.out.print("영어 : ");
			exTemp.setEng(scan.nextInt());
		} while (exTemp.getEng() < 0 || 100 < exTemp.getEng());
		do {
			System.out.print("수학 : ");
			exTemp.setMath(scan.nextInt());

		} while (exTemp.getMath() < 0 || 100 < exTemp.getMath());
		list.add();
		System.out.println("─────────────────────");
	}
	//데이터 출력
	public void print()
	{
		System.out.println("┌────────────────────┐");
		System.out.println("│          성적  출력                  │");
		System.out.println("└────────────────────┘");
		System.out.println(); 
		for(int i=0;i<list.getCurrent();i++) {
			Exam tmp =list.getExam(i);
			System.out.printf("국어 : %3d\n", tmp.getKor());
			System.out.printf("영어 : %3d\n", tmp.getEng());
			System.out.printf("수학 : %3d\n", tmp.getMath());
			System.out.printf("총점 : %3d\n",tmp.getTotal() );
			System.out.printf("평균 : %6.2f\n", tmp.getAvg());
			System.out.println("─────────────────────");
		}
	}
}


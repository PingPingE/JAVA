/*
 * 학생 성적 처리
 * 총 10명의 학생
 * 한 학생당 3과목의 성적 저장(국, 영, 수)
 * 성적 처리 
 * - 학생별 총점 평균
 * - 전체 학생의 과목당 총점 평균
 */
package exam.reference;
import java.util.*;
public class GetGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 학생이 있습니까?");
		int totalStudent  = sc.nextInt();
		int scores[][] = new int[totalStudent+1][4]; //국영수점수, 총합
		int input;
		String getName[] = {"국어", "영어", "수학"};
		while(true) 
		{
			System.out.println("===============================메뉴===================================");
			System.out.println("1. 모든 학생 점수 입력 2. 성적처리 결과 리스트 3. 한 학생 점수 수정 4. 종료");
			System.out.println("======================================================================");	
			input = sc.nextInt();
			if(input == 1)
			{
				for (int index = 0; index<totalStudent; index++)
				{
					System.out.println(index+"번 학생의 성적을 입력해주세요.");
					int sum = 0;
					for(int i =0; i< 3; i++)
					{
						System.out.println(getName[i]+" 성적: ");
						scores[index][i] = sc.nextInt();
						sum += scores[index][i];//누적점수(총점 평균을 빨리 구하기 위함)
					}
					scores[index][3] = sum;
				}	
			}
			
			else if(input == 2)
			{
				int index ;
				//한명의 성적확인
				while(true)
				{
					System.out.println("몇번 학생의 결과를 열람하시겠습니까?");
					index = sc.nextInt();
					if(index <0 || index>=totalStudent)
					{
						System.out.println("존재하지 않는 번호입니다. 0이상 "+(totalStudent-1)+"이하를 입력하십시오");
						continue;
					}
					break;
				}
				double perScore[] = {0,0,0}; // 전체 학생의 국영수 총합
				for(int i=0;i <totalStudent; i ++)
				{
					for(int j = 0; j<3; j++)
					{
						perScore[j] += scores[i][j];
					}
				}
				for(int i=0; i<3; i++)
					System.out.println(index+"번 학생의 "+getName[i]+" 점수: "+scores[index][i] + " <-> 전체 학생의 "+getName[i]+"평균: "+String.format("%.3f", perScore[i]/totalStudent));
				System.out.println(index+"번 학생의 국,영,수 전체 평균: " + (double)scores[index][3]/3);
			}
			
			else if(input == 3)//한명의 성적 수정
			{
				int index ;
				while(true)
				{
					System.out.println("몇번 학생의 성적을 수정하시겠습니까?");
					index = sc.nextInt();
					if(index <0 || index>=totalStudent)
					{
						System.out.println("존재하지 않는 번호입니다. 0이상 " + (totalStudent-1)+"이하를 입력하십시오");
						continue;
					}
					break;
				}

				int sum = 0;
				for(int i =0; i< 3; i++)
				{
					System.out.println(getName[i]+" 성적: ");
					scores[index][i] = sc.nextInt();
					sum += scores[index][i];//누적점수
				}
				scores[index][3] = sum;
			}
			else
				break;
		}		
		System.out.println("종료합니다.");
	}
}

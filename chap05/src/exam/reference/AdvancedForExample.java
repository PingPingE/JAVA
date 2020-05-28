package exam.reference;

public class AdvancedForExample {
	public static void main(String[] args) {
//		int scores[] = {95,71,84,93,87};
//		int sum = 0;
//		for (int score:scores) //향상된 for문(인덱스로 접근하지 못하는 자료구조에 활용하면 좋음)
//			sum += score;

		int scores2D[][] = {{1,2,3,4,5},{95,71,84,93,87}, {95,71,84,93,87}};
		int sum = 0;
		for (int i= 0; i<scores2D.length; i ++)
		{
			for(int j= 0; j<scores2D[i].length; j++)
				sum += scores2D[i][j];
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(double)sum/(scores2D.length*scores2D[0].length));
		
		for(int[] ii : scores2D)
		{
			for(int jj: ii)
				System.out.printf("%d ", jj);
			System.out.println();
		}
	}
}

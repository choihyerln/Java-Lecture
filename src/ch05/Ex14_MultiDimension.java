package ch05;

public class Ex14_MultiDimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];		// 행의 갯수가 2, 열의 갯수가 3
		int[][] score = {{80, 90, 84}, {78, 85, 95}};	// 학생 2명의 국어/영어/수학 성

		System.out.println(score[0][0]); 		// [row][column]이므로 80
		System.out.println(matrix.length); 		// 행의 갯수, 2
		System.out.println(matrix[0].length);	// 열의 갯수, 3
		
		for (int i=0; i<score.length; i++) {
			for (int k=0; k<score[0].length; k++) {
				System.out.print(score[i][k] + "  ");
			}
			System.out.println();
		}
	}

}

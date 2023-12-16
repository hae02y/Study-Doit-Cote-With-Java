package doitcote;

import java.util.Scanner;

public class B004_구간합구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //표의 크기 (n x n)
		int m = sc.nextInt(); //합을 구할 횟수
		
		int[][] arr = new int[n+1][n+1];
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++){
				int num = sc.nextInt();
				arr[i][j] = arr[i][j-1] + num;
			}
		}
		
		for(int i=0; i<m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int result = 0;
			
			for(int j=x1; j<=x2; j++) {
				result = result + arr[j][y2] - arr[j][y1-1];
			}
			
			System.out.println(result);
		}
		
		sc.close();

	}

}

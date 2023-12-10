package doitcote;

import java.util.Scanner;

public class B001_숫자의합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		String str = sc.next();
		int result = 0;
		
		
		for(int i=0; i<x; i++) {
			int num = str.charAt(i) - '0';
			result = result + num;
		}
		System.out.println(result);
		sc.close();
	}
}

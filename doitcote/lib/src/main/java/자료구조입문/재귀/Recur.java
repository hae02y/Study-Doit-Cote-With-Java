package 자료구조입문.재귀;

public class Recur {
	
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}
	
}

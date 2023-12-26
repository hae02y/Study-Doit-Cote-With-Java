package 자료구조입문.재귀;

public class Factorial {
	
	static int facto(int x) {
		
		if(x > 1) {
			return x * facto(x-1);
		}
		
		return 1;
	}
	
	static int facto2(int x) {
		return (x > 1) ? x * facto(x-1) : 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(facto2(5));
	}

}

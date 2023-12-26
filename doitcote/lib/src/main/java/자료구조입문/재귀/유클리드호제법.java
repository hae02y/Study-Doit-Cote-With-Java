package 자료구조입문.재귀;

public class 유클리드호제법 {

	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}
		
		return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 31;
		int y = 3;
		
		System.out.println("최대공약수 : " + gcd(x,y));

	}

}

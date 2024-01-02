package 자료구조입문.재귀;

public class TowersOfHanoi {
	
	static int count;
	
	public static void move(int n, int x, int y) {
		
		if(n > 1) {
			move(n-1, x, 6-x-y); //6-x-y 를 통해 중간기둥을 찾을수있음.
		}
		
		System.out.printf("%d 크기 원반을 %d기둥에서 %d기둥으로 이동 \n", n, x, y);
		count ++;
		
		if(n > 1) {
			move(n-1, 6-x-y, y);
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		count = 0;
		
		move(n, 1, 3);
		System.out.println("이동횟수 : " + count);
	}
}

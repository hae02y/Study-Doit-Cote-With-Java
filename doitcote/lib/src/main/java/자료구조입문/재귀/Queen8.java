package 자료구조입문.재귀;

public class Queen8 {
	
	static int[] pos = new int[8]; //각열에 존재하는 퀸의 위치
	static boolean[] flag = new boolean[8]; //각행에 퀸을 이미 배치했는지 확인
	static boolean[] flagLTR = new boolean[15]; // \ 방향 대각선으로 퀸을 배치했는지 확인 (Left To Right)
	static boolean[] flagRTL = new boolean[15]; // / 방향 대각선으로 퀸을 배치했는지 확인	(Right To Left)
	
	static void print() {
		for(int i=0; i<pos.length; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int col) {
		for(int row=0; row<pos.length; row++) {
			
			if(flag[row] == false && 
				flagLTR[row + col] == false && 
				flagRTL[col - row + 7] == false ) {
					pos[col] = row;
					if(col == 7) {
					print();
					}else {
						flag[row] = flagLTR[col + row] = flagRTL[col - row + 7] = true;
						set(col+1);
						flag[row] = flagLTR[col + row] = flagRTL[col - row + 7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
		
	}
}
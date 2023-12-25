package 자료구조입문.스택;

public class IntStack {
	
	private int[] stk;
	private int capacity;
	private int ptr;
	
	
	public class EmptyException extends RuntimeException{
		public EmptyException() {}
	}
	
	public class OverflowException extends RuntimeException{
		public OverflowException() {}
	}

	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//스택에 x를 푸쉬
	public int push(int x) {
		if(ptr >= capacity) {
			throw new OverflowException();
		}
		return stk[ptr++] = x;
	}
	
	public int pop() {
		if(ptr <= 0) {
			throw new EmptyException();
		}
		return stk[--ptr];
	}
	
	
	public static void main(String[] args) {
		
		IntStack stack = new IntStack(3);
		
		stack.push(3);
		
		stack.push(10);
		
		stack.push(20);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}

public class Stack {
	protected static final int CAPACITY = 100;
	protected int size, top = -1;
	protected Object stk[];

	public Stack() {
		stk = new Object[CAPACITY];
	}

	public void push(Object item) {
		if (size_of_stack == size) {
			System.out.println("Stack overflow");
			return;
		} else {
			top++;
			stk[top] = item;
		}
	}

	public Object pop() {
		if (top < 0) {
			return -999;
		} else {
			Object ele = stk[top];
			top--;
			size_of_stack--;
			return ele;
		}
	}
}

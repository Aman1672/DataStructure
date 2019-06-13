package DS;
public class Stack {
	private int[] array;
	private int top;
	private int size;

	public Stack(int size) {
		this.size = size;
		this.array = new int[size];
		this.top = -1;
	}

	public void push(int data) {
		if (this.top + 1 == this.size) {
			System.out.print("Error: Stack is full");
			return;
		}
		this.array[++this.top] = data;
	}

	public int pop() {
		if (this.top == -1) {
			System.out.println("Error: Stack is empty");
			return -1;
		}
		return this.array[this.top--];
	}

	public boolean isEmpty() {
		if (this.top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (this.top + 1 == this.size) {
			return true;
		}
		return false;
	}

	public void reset() {
		this.top = -1;
	}
}

package DS;

public class Queue {
	private int front;
	private int rear;
	private int[] array;
	private int size;

	public Queue(int size) {
		this.size = size;
		front = rear = -1;
		array = new int[size];
	}

	public void enqueue(int data) {
		if (rear + 1 == size) {
			System.out.println("Queue is full");
		} else {
			if (front == -1 &&rear == -1) {
				front = 0;
			}
			array[++rear] = data;
		}
	}

	public int dequeue() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return -1;
		}
		int data = array[front];
		if (front == rear) {
			front = rear = -1;
		} else {
			front += 1;
		}
		return data;
	}

	public boolean isFull() {
		if (rear + 1 == size) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (rear == -1 &&front == -1) {
			return true;
		}
		return false;
	}

	public void reset() {
		rear = front = -1;
	}
}

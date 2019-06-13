package DS;

import java.util.Scanner;

public class queueDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Queue: ");
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		int choice = -1;
		do {
			System.out.println("1. Enqueue Data");
			System.out.println("2. Dequeue Data");
			System.out.println("3. Check whether Queue is full");
			System.out.println("4. Check whether Queue is empty");
			System.out.println("5. Reset");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter data: ");
				queue.enqueue(sc.nextInt());
				break;
			case 2:
				boolean isEmpty = queue.isEmpty();
				int data = queue.dequeue();
				if(!isEmpty) {
					System.out.println("Data dequeued from queue is "+data);
				}
				break;
			case 3:
				if(queue.isFull()) {
					System.out.println("Queue is full");
				}else {
					System.out.println("Queue is not full");
				}
				break;
			case 4:
				if(queue.isEmpty()) {
					System.out.println("Queue is empty");
				}else {
					System.out.println("Queue is not empty");
				}
				break;
			case 5:
				queue.reset();
				System.out.println("Resetting Queue...");
				System.out.println("Done.");
				break;
			case 0:
				System.out.print("Exiting...");
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println();
		}while (choice != 0) ;
		sc.close();


	}

}

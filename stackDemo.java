package DS;

import java.util.Scanner;

public class stackDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int size = scanner.nextInt();
		Stack stack = new Stack(size);
		int choice = -1;
		do {
			System.out.println("1. Push into Stack");
			System.out.println("2. Pop from Stack");
			System.out.println("3. Check if Stack is full");
			System.out.println("4. Check if Stack is empty");
			System.out.println("5. Reset");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter data: ");
				stack.push(scanner.nextInt());
				break;
			case 2:
				boolean isEmpty = stack.isEmpty();
				int data = stack.pop();
				if(!isEmpty) {
					System.out.println("Data poped from stack is "+data);
				}
				break;
			case 3:
				if(stack.isFull()) {
					System.out.println("Stack is full");
				}else {
					System.out.println("Stack is not full");
				}
				break;
			case 4:
				if(stack.isEmpty()) {
					System.out.println("Stack is empty");
				}else {
					System.out.println("Stack is not empty");
				}
				break;
			case 5:
				stack.reset();
				System.out.println("Resetting Stack...");
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
		scanner.close();

	}

}

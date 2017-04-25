package Pset7;

import java.util.Scanner;

public class TestLinkedDequeue {
	public static void main(String[] args) {
		int command;
		LinkedDequeue Q = new LinkedDequeue();
		Scanner keyboard = new Scanner(System.in);
		do {
			menu();
			String line = null;
			switch (command = keyboard.nextInt()) {
			case 1:
				System.out.println("Enter the object to be added");
				line = keyboard.next();
				Q.headAdd(line);
				System.out.println(Q.toString());
				break;

			case 2:
				System.out.println("The element at the head of the queue is : " + Q.headPeek());
				break;

			case 3:
				try {
					System.out.println("The element [" + Q.headRemove() + "] at the head of the queue is removed ");
					System.out.println(Q.toString());
				} catch (DequeueUnderFlowException e) {
					e.printStackTrace();
				}
				break;

			case 4:
				System.out.println("Enter the object to be added");
				System.out.println(Q.toString());
				line = keyboard.next();
				Q.tailAdd(line);
				break;

			case 5:
				System.out.println("The element at the tail of the queue is : " + Q.tailPeek());
				break;

			case 6:
				try {
					System.out.println("The element [" + Q.tailRemove() + "] at the tail of the queue is removed ");
					System.out.println(Q.toString());
				} catch (DequeueUnderFlowException e) {
					e.printStackTrace();
				}
				break;

			case 7:
				System.out.println("The size of the queue is :" + Q.size());
				System.out.println(Q.toString());
				break;

			case 8:
				System.out.println("The queue is :" + (Q.isEmpty() ? " empty " : " not empty "));
				System.out.println(Q.toString());
				break;

			default:
				System.exit(0);
			}
		} while (command > 0 && command < 10);
		keyboard.close();
	}

	static void menu() {
		System.out.println();
		System.out.print("Type 1 to ADD HEAD A\n");
		System.out.print("Type 2 to PEEK HEAD B\n");
		System.out.print("Type 3 to REMOVE HEAD\n");
		System.out.print("Type 4 to ADD TAIL\n");
		System.out.print("Type 5 to PEEK TAIL\n");
		System.out.print("Type 6 to REMOVE TAIL\n");
		System.out.print("Type 7 to COUNT ELEMENTS\n");
		System.out.print("Type 8 to CHECK EMPTY\n");
		System.out.print("Type any OTHER # to EXIT PROGRAM \n\n");
		System.out.print("Command: ");
	}
}

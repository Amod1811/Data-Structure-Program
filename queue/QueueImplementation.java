package com.bl.queue;
import java.util.Scanner;

import com.bl.queue.Node;
public class QueueImplementation {

	Node top;

	// Operation menu to take user choice of operation
	public void operationsMenu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		do {
			System.out.println("Operations menu : ");
			System.out.println("1. To display \n2. Push Element  \n3. To exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Display queue elements : ");
				display();
				System.out.println("----------------------\n");
				break;
			case 2:
				System.out.println("Enter element to insert into the queue : ");
				int element = sc.nextInt();
				push(element);
				System.out.println("-----------------------\n");
				break;
			
			}
		} while (flag);
	}

	// Display method to display stack elements
	public void display() {

		if (top == null)
			System.out.println("Queue is empty !");
		else {
			Node temp = top;
			while (temp.next != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
			System.out.print(temp.data + "  ");
			System.out.println();
		}
	}

	// Push method to take input element in stack
	public void push(int item) {
		Node node = new Node();
		node.data = item;
		if (node == null) {
			node.next = null;
		} else {
			node.next = top;
			top = node;
		}
	}

	
}

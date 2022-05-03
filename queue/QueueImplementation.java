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
			System.out.println("1. To display \n2. Inqueue Element \n3.dequeue Element\n3. To exit");
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
			case 3:
				pop();
				System.out.println("-----------------------\n");
				break;
			case 4:
				System.out.println("Top element : " + peek());
				System.out.println("----------------------\n");
				break;
			default:
				flag = false;
				System.out.println("Thank you !");
				System.out.println("------------------------\n");
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

	// Pop method to remove element
		public void pop() {
			if (top == null) {
				System.out.println("Queue is empty.");
			} else {
				Node temp = top;
				System.out.println("Removing : " + temp.data);
				top = top.next;
			}
		}

		// Peek method to peek top element
		public int peek() {
			if (top != null) {
				return top.data;
			} else {
				System.out.println("Queue is empty.");
				return -1;
			}
		}
}

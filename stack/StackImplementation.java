package com.bl.stack;

import java.util.Scanner;

public class StackImplementation {
	Node top;

	Scanner sc = new Scanner(System.in);
	//method for choose the choice to Add or Display Element
	public void userMenu() {
		boolean flag =true;
		
	
		do{
			System.out.println("UserMenu");
			System.out.println(" 1.To display\n 2. push\n 3. exit");
			int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Display queue elements : ");
			display();
			System.out.println("--------------------------");
			break;
		case 2:
			System.out.println("Enter element to insert into the queue : ");
			int element = sc.nextInt();
			push(element);
			System.out.println("----------------------");
			break;
		default:
			flag = false;
			System.out.println("Thank you.");
			break;
		}
		}while(flag);
	}
	
	//method display for check element present or not
	public void display() {
	
		if(top == null) 
			System.out.println("Stack is empty");
		else {
			Node temp = top;
			while(temp.next != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
			System.out.print(temp.data + "  ");
			System.out.println();
		}	
	}
	
//method for add element
	public void push(int item) {
		Node node = new Node();
		node.data = item;
		if(node == null) {
			node.next = null;
		}
		else {
			node.next = top;
			top = node;
		}
	}
	
}	

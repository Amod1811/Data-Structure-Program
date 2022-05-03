package com.bl.queue;

/*
 * Author : Amod Chaudhari
 * perform the operation on queue to add and remove element using InQueue and DeQueue function
 */
import java.util.Scanner;

import com.bl.queue.QueueImplementation;

public class QueueMain {
	public static void main(String[] args) {
		QueueImplementation queueImplementation = new QueueImplementation();
		queueImplementation.operationsMenu();
	}
}

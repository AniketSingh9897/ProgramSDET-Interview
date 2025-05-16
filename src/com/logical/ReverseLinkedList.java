package com.logical;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		traverseLinkedList(head);
		traverseLinkedList(reverseLinkedList(head));

	}

	private static void traverseLinkedList(Node head) {
		System.out.println();
		Node current = head;
		while (current != null) {
			System.out.print(current.getData()+" ");
			current = current.next;

		}
	}

	public static Node reverseLinkedList(Node head) {
		Node current = head;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;

		}
		return previous;
	}

}

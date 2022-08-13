package LinkedListDataStructure;

import java.io.*;
import java.util.*;

public class Node {

	public static void main(String[] args) {
		ListNode node = new ListNode();
		Scanner sc = new Scanner(System.in);
		int choice, ele;
		System.out.println(
				"MENU \n1. Insert Element \n2. Delete Element \n3. Insert Element at First \n4. Insert Element at specific Index \n5. Display \n6. Exit \n");

		do {

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to be inserted: ");
				ele = sc.nextInt();
				if (node == null || node.data == 0)
					node = new ListNode(ele);
				else
					insertElement(node, ele);
				System.out.println("Element " + ele + " inserted");
				break;
			case 2:
				System.out.println("Enter index to be deleted: ");
				ele = sc.nextInt();
				deleteElement(node, ele);
				System.out.println("Element " + ele + " deleted");
				break;
			case 3:
				System.out.println("Enter the element to be inserted at head of linked list");
				ele = sc.nextInt();
				// insertAtHead(node,ele);
				ListNode res = new ListNode(ele);
				if (node == null) {

					node = res;

				} else {

					res.next = node;
					node = res;

				}
				System.out.println("Node inserted at head is " + ele);
				break;
			case 4:
				System.out.println("Enter the element to be inserted");
				ele = sc.nextInt();
				System.out.println("Enter the position to be inserted");
				int pos = sc.nextInt();
				insertAtPosition(node, ele, pos);
				System.out.println("Element " + ele + " is inserted at position " + pos);
				break;
			case 5:
				display(node);
				break;

			case 6:
				System.out.println("Quitting.. Bye!!");
				System.exit(0);

			default:
				System.out.println("Enter valid choice");

			}

		} while (choice <= 6);

	}

	public static void insertElement(ListNode node, int ele) {

		ListNode res = new ListNode(ele);

		ListNode temp = node;
		while (temp.next != null) {

			temp = temp.next;

		}
		temp.next = res;

	}

	public static void deleteElement(ListNode node, int index) {

		if (node != null) {

			ListNode temp = node;
			ListNode t;
			int pos = 0;
			while (pos < index - 1) {

				temp = temp.next;
				pos++;

			}
			t = temp.next;
			temp.next = t.next;
			t = null;
		}

	}

	public static void insertAtHead(ListNode node, int ele) {

		ListNode res = new ListNode(ele);
		if (node == null) {

			node = res;

		} else {

			res.next = node;
			node = res;

		}
	}

	public static void insertAtPosition(ListNode node, int ele, int pos) {

		System.out.println("Element " + ele + " to be inserted at position " + pos);
		if (pos == 0) {

			insertAtHead(node, ele);

		}
		int p = 0;
		ListNode temp = node;
		ListNode res = new ListNode(ele);
		while (p < pos) {

			p++;
			if (temp == null) {

				System.out.println("List Overflow - invalid position- unable to insert");
				return;
			}
			temp = temp.next;
		}

		res.next = temp.next;
		temp.next = res;

	}

	public static void display(ListNode node) {

		if (node == null) {

			System.out.println("Empty Linkedlist ");

		} else {

			ListNode temp = node;
			while (temp != null) {

				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}

	}

}

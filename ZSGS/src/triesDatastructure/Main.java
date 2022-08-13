package triesDatastructure;

import java.util.*;

public class Main {

	public static TrieNode root = new TrieNode();

	public static void main(String[] args) {

		System.out.println("TRIES!!!");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String word;
		do {

			System.out.println(
					"MENU\n1. Enter word \n2. Find word \n3. Delete Word \n4. Display Trie \n5. Exit\nEnter your choice");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter the word to be inserted");
				word = sc.next();
				insert(word);
				break;

			case 2:
				System.out.println("Enter the word to be searched");
				word = sc.next();
				search(word);
				break;

			case 3:
				System.out.println("Enter the word to be deleted");
				word = sc.next();
				deleteWord(word);
				break;

			case 4:
				System.out.println("TRIE DATA");
				display(root);
				break;

			case 5:
				System.out.println("Exiting");
				System.exit(0);

			default:
				System.out.println("Invalid choice");

			}

		} while (choice <= 5);
	}

	public static void insert(String word) {

		TrieNode temp = root;
		int length = word.length();
		for (int i = 0; i < length; i++) {

			int c = word.charAt(i) - 'a';
			System.out.println("Char is " + c + " as " + word.charAt(i));
			if (temp.children[c] == null) {

				temp.children[c] = new TrieNode();
			}
			temp = temp.children[c];
		}
		temp.isWord = true;
	}

	public static void search(String word) {

		TrieNode temp = root;
		int length = word.length();
		for (int i = 0; i < length; i++) {

			int c = word.charAt(i) - 'a';
			if (temp.children[c] == null) {

				System.out.println("Character " + ((char) c) + " of the word " + word + " is not present in the trie");
				return;
			}
			temp = temp.children[c];

		}
		if (temp.isWord) {

			System.out.println("Word is present in the trie");
		} else {
			System.out.println("Word is not present in the trie");
		}

	}

	public static boolean isEmptyNode(TrieNode node) {

		for (int i = 0; i < 26; i++) {

			if (node.children[i] != null)
				return false;
		}
		return true;
	}

	public static void deleteWord(String word) {

		TrieNode t = delete(root, word, 0);

	}

	public static TrieNode delete(TrieNode node, String word, int depth) {

		System.out.println("Delete called for word " + word + " and depth " + depth);
		if (node == null) {
			System.out.println("Node is null for depth " + depth);
			return null;
		}
		TrieNode temp = node;
		int length = word.length() - 1;
		// System.out.println("Length is "+length+" and depth is "+depth);
		int c = word.charAt(depth) - 'a';
		if (length == depth) {

			if (temp.isWord) {
				System.out.println("Word found");
				temp.isWord = false;
			}
			if (isEmptyNode(temp)) {
				System.out.println("Empty node , hence making it null");
				temp = null;
			}
			return temp;
		}

		temp.children[c] = delete(temp.children[c], word, depth + 1);
		if (isEmptyNode(temp) && !temp.isWord) {
			System.out.println("Empty node and not a word , hence returning null");
			temp = null;
		}

		return temp;

	}

	public static void display(TrieNode node) {

		TrieNode temp = node;
		for (int i = 0; i < 26; i++) {

			if (temp.children[i] != null) {

				System.out.print((char) (65 + i));
				display(temp.children[i]);
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

}

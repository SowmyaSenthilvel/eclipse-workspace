package Trees;

import java.util.*;
public class TreeImpl{

	static Node root = null;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 0,ele;
		System.out.println("Binary Tree Implementation");
		do{

			System.out.println("MENU \n1. Insert Element \n2. Delete Element \n3. Search Element \n4. Display Tree inorder \n5. Display Tree Preorder \n6. Display Tree PostOrder \n7. Display Tree BFS \n8. Exit \nEnter your choice...");
			choice = sc.nextInt();
			switch(choice){
			
				case 1: System.out.println("Enter the element to be inserted");
					ele = sc.nextInt();
					add(ele);
					break;
				case 2: System.out.println("Enter the element to be deleted");
					ele = sc.nextInt();
					delete(ele);
					break;
				case 3: System.out.println("Enter the element to be searched");
					ele = sc.nextInt();
					search(root,ele);
					break;
				case 4: System.out.println("Inorder Traversal: ");
					inOrder(root);
					System.out.print("\n");
					break;
				case 5: System.out.println("Preorder Traversal: ");
                                	preOrder(root);
                                	System.out.print("\n");
                                	break;
				case 6: System.out.println("Postorder Traversal: ");
                                	postOrder(root);
                                	System.out.print("\n");
                                	break;
				case 7: System.out.println("BFS Traversal: ");
                                	levelOrder(root);
                                	System.out.print("\n");
                                	break;
				case 8: System.out.println("Exiting!!!");
					System.exit(1);
					break;
				default: System.out.println("Invalid choice");
			}

		}while(choice <= 8);
	}

	public static void add(int ele){
	
		root = addRecursive(root,ele);

	}
	
	public static Node addRecursive(Node current, int ele){

		if(current == null){
			return new Node(ele);
		}
		if(ele < current.data){
			current.left = addRecursive(current.left,ele);
		}
		if(ele > current.data){
			current.right =  addRecursive(current.right,ele);
		}
		return current;
	}

	public static void search(Node current,int ele){
	
		if(current == null){

			System.out.println("Element not present");
			return;
		}
		if(ele == current.data){

			System.out.println("Element is present");
			return;
		}
		if(ele < current.data){
			search(current.left,ele);
		}
		else{
			search(current.right,ele);
		}
		
	}

	public static void delete(int ele){

		root = deleteRecursive(root,ele);
	}

	public static Node deleteRecursive(Node current, int ele){

		if(current == null){
			return null;
		}
		if(ele == current.data){

			System.out.println("Element found for Deletion");
			//No Children
			if(current.left == null && current.right == null){
				return null;
			}
			//One Children
			else if(current.left == null){
				return current.right;
			}
			else if(current.right == null){
				return current.left;
			}
			else{

				int smallest = findSmallest(current.right);
				current.data = smallest;
				current.right = deleteRecursive(current.right,smallest);
				return current;
			}
			

		}
		if(ele < current.data){
			current.left = deleteRecursive(current.left,ele);
		}
		else{
			current.right = deleteRecursive(current.right,ele);
		}
		return current;
	}

	public static int findSmallest(Node current){

		if(current.left == null){

			return current.data;
		}
		return findSmallest(current.left);
	}

	public static void inOrder(Node current){

		if(current != null){

			inOrder(current.left);
			System.out.print(current.data+" -> ");
			inOrder(current.right);
		}
	}

	public static void preOrder(Node current){

		if(current != null){

			System.out.print(current.data+" -> ");
                        preOrder(current.left);
                        preOrder(current.right);
                }

	}

	public static void postOrder(Node current){

		if(current != null){

                        preOrder(current.left);
                        preOrder(current.right);
			System.out.print(current.data+" -> ");
                }

	}

	public static void levelOrder(Node current){

		if(current == null){
			return;
		}
		Queue<Node> queue = new LinkedList();
		queue.add(current);
		while(!queue.isEmpty()){

			Node temp = queue.remove();
			System.out.print(temp.data+" -> ");
			if(temp.left != null){
				queue.add(temp.left);
			}
			if(temp.right != null){

				queue.add(temp.right);
			}
		}
	}
}

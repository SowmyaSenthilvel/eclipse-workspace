package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<String> stack = new Stack<>();
			stack.push("a");
			stack.push("b");
			stack.push("c");
			System.out.println(stack);
//			System.out.println("stack - remove and show top element: " + stack.pop());
//			System.out.println("stack - remove and show top element: " + stack.pop());
//			System.out.println("stack - remove and show top element: " + stack.pop());
			
			
			//System.out.println("stack.isEmpty(): " + stack.isEmpty());
			//System.out.println("stack.empty(): " + stack.empty());
			System.out.println("stack top element: " + stack.peek());
			//System.out.println("stack top element: " + stack.peek());
//			System.out.println("stack top element: " + stack.peek());
			System.out.println("stack.search(\"c\"): " + stack.search("c"));
			System.out.println("stack.search(\"b\"): " + stack.search("b"));
			System.out.println("stack.indexOf(\"a\"): " + stack.indexOf("a"));

	}

}

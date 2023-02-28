package collection1;

import java.util.List;
import java.util.Stack;

public class stack {

	
	// stack (LIFO) -- Last In First Out
	
	
	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<String>();
		
		s1.push("surya");
		
		s1.push("akash");
		
		s1.push("divya");
		
		s1.empty();
		
		System.out.println(s1);
		
		System.out.println(s1);
		
		s1.pop();
		
		System.out.println(s1);
		
		s1.peek();
		
		System.out.println(s1);
		
		
	}
}

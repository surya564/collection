package collection1;

import java.util.ArrayDeque;


// queue -- (FIFO) FIRST IN FIRST OUT

public class deQue {

	public static void main(String[] args) {
	

		ArrayDeque<String> a1 = new ArrayDeque<String>();
		
		a1.push("surya");
		
		a1.push("akash");
		
		a1.push("divya");
		
		System.out.println(a1);
		
		a1.pop();
		
		System.out.println(a1);
		
		a1.pop();
		
		System.out.println(a1);
		
	}
}

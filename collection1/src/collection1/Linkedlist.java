package collection1;


import java.util.LinkedList;

public class Linkedlist {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
	LinkedList<String> l1 = new LinkedList<String>();
	
	l1.add("surya");
	
	
	
	l1.add("akash");

	
	
	
    for(String name:l1) {
    	
    	System.out.println(name);
    }
	
    l1.add(1, "ani");
    
    System.out.println(l1);
    
    l1.remove(1);
    
    System.out.println(l1);
    
    l1.isEmpty();
    
    System.out.println(l1);
    
    l1.removeAll(l1);
    System.out.println(l1);
    
    l1.clear();
    
    System.out.println(l1);
    
    
    
}
	
}

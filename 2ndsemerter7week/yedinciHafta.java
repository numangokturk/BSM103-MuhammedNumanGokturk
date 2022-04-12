package vizeler;

import java.util.*;


public class yedinciHafta {

	public static void main(String[] args) {
		String data[]= {"java","php","pyton","c","c++"};
		
         Queue <String> q=new LinkedList<String>();
        
		
		for(String word: data)
        q.add(word);
		
		
		System.out.println(q);
		
		silme(q, "java");
		System.out.println(q);
	}

	public static void silme(Queue<String> q, String kelime ) {
		
		int size=q.size();
		for (int i = 0; i < size; i++) {

       String n = q.remove();
       if(!n.equals(kelime))
    	   q.add(n);
	}
		
	}
	
}

package vizeler;

import java.util.*;


public class Stutter {

	public static void main(String[] args) {
		// cıftleyecek

		int data[]= {3,4,8,9,1};
		
		Queue<Integer> q=new LinkedList<Integer>();
		 
		 for(int n:data)
			 q.add(n);
		 System.out.println(q);
		 stutter(q);
		 System.out.println(q);
		 
		 Stack <Integer> s=new Stack<Integer>();

		 for(int n:data)
			 s.add(n);
		 stutter2(s);
		 System.out.println(s);
		 
		 
	}
          public static void stutter(Queue<Integer>q) {
        	  
        	  int size=q.size();
        	  for (int i = 0; i < size; i++) {
				int sayi=q.remove();
				q.add(sayi);
				q.add(sayi);
				
			}
          }
//          odev olan kısım
          public static void stutter2(Stack<Integer>s) {
        	  Queue<Integer> tutsun=new LinkedList<Integer>();
        	  
        	  int size= s.size();
        	  
        	  for (int i = 0; i <size; i++) {
				int sayi=s.pop();
				
				tutsun.add(sayi);
        	  }
        	
        	  stutter(tutsun);
        	  s.addAll(tutsun);
        	  
   	  // ters oldu ama aklıma baska bısey gelmedı
          }
          
}

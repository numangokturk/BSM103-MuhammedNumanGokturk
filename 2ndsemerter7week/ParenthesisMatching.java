 package vizeler;

import java.util.*;

public class ParenthesisMatching {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("kontrole etmek ıstedıgnız ıfade ?");
    
		String exp=sc.next();
		if(isMatching(exp))
			System.out.println("dengelidir");
		else
			System.out.println("dengeli degildir");
	}
    public static boolean isMatching(String exp) {
    	
    	Stack<Character> s=new Stack<Character>();
    	
    	for (int i = 0; i < exp.length(); i++) {
			
			 if(exp.charAt(i)=='(') {
				s.push(exp.charAt(i));
		
			 }
			 else if (exp.charAt(i)==')') {
				 if(!s.isEmpty()) {
					 s.pop();					 
				 }else
					 return false;				 
			 }
		}
    	return (s.isEmpty());
    }
}

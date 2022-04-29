import java.util.*;
public class validParantheses {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		boolean tmp = validParantheses("{(())}");
		System.out.println(tmp);
		
				
	}
	
	public static boolean validParantheses(String str) {
		Stack<Character> s = new Stack<Character>();
		
		for(char x:str.toCharArray()) {
			if(x=='{' || x=='[' || x=='(') {
				s.push(x);
			}
			else if(!s.isEmpty() && (x==']' && s.peek()=='[' || x=='}' && s.peek()=='{' || x==')' && s.peek()=='(')) {
				 s.pop();
			}
			else {
				return false;
			}
		}
		return s.isEmpty();
	}

}

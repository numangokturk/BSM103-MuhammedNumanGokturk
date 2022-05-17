import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {

	public static void main(String[] args) {

		System.out.println("Lutfen bir string giriniz: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		Stack stack = new Stack();
		
		for(int index = 0; index < inputString.length(); index++) {
			stack.push(inputString.charAt(index));
		}
		String s = "";
		while(!stack.isEmpty()) {
			s = s + stack.pop();
			
		}
		if (inputString.equals(s)) {
			System.out.println("Girilen kelime palindromdur.");	
		}
		else {
			System.out.println("Girilen kelime palindrom degildir.");
		}
	}

}

import java.util.*;
public class SortExample {
public static void main (String[]args) {
	ArrayList<String> words = new ArrayList<String>();
	words.add("kayseri");
	words.add("istanbul");
	words.add("izmir");
	words.add("ankara");

	System.out.println("siralamadan once: "+words);
	System.out.println(words.get(0));
	// a-z ye siralama
	Collections.sort(words);
	System.out.println("siralamadan sonra: "+words);
	

}
}


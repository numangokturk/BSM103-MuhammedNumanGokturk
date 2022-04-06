import java.util.ArrayList;
public class StarAdd {
	public static void main(String[]args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kayseri");
		words.add("istanbul");
		words.add("izmir");
		words.add("ankara");
		
		System.out.println("dongu oncesi "+words);
		System.out.println("liste uzunlugu: "+words.size());
		
		for(int index=0;index<words.size();index+=2) {
			words.add(index,"*");
			
		}
		System.out.println("dongu sonrasi "+words);
		System.out.println("liste uzunlugu: "+words.size());
		
		for(int index=0; index<words.size();index++) {
			words.remove(index);
			
		}
		System.out.println("silme sonrasi "+words);
		System.out.println("silme sonrasi liste uzunlugu: "+words.size());
		
		
	}

}

package youtubejava;

public class PointMainDeneme {

	public static void main(String[] args) {
		
		Cat kedi1 = new Cat();
		kedi1.rengi="sari";
		System.out.println(kedi1.yas+","+kedi1.rengi+","+kedi1.isim);
		
		Cat kedi2 = new Cat("berfin",2);
		System.out.println(kedi2.yas+","+kedi2.rengi+","+kedi2.isim);
		
		Cat kedi3 = new Cat(3,"berfin","gri");
		System.out.println(kedi3.yas+","+kedi3.rengi+","+kedi3.isim);
           
	}      
}

import java.util.ArrayList;
public class KisiMain {
	public static void main(String[]args) {
	
	ArrayList<Kisi> bireyler = new ArrayList<>();
    bireyler.add(new Kisi ("numan",19));
    bireyler.add(new Kisi ("berfin",20));
    bireyler.add(new Kisi ("enes",21));
    bireyler.add(new Kisi ("oguzhan",21));
    /*
    bireyler.forEach(birey->{
    	System.out.println("isim: " +birey.getIsim()+", yas:" +birey.getYas());
    });
    System.out.println();
    */
    
    for(Kisi birey:bireyler) {
    	System.out.println("isim: "+birey.getIsim()+", yas:"+birey.getYas());
    }
}
	
}

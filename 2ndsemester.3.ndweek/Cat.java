package youtubejava;

public class Cat {

	int yas;
	String isim;
	String rengi;
	
	
	
	public Cat() {
		this.yas=0;
		this.isim="buraya isim verilmedi";
		this.rengi="renk girilmedi";
		
		
	}
	 
	public Cat(String isim,int yas) {
		this.yas =yas;
		this.isim=isim;
				
	}
	public Cat(int yas , String isim,String rengi) {
		
		this.yas =yas;
		this.isim= isim ;
		this.rengi=rengi;
	
	}
}
	

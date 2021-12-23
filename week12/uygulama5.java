package youtubejava;

import java.util.Scanner;

public class uygulama5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eleman sayisi giriniz: ");
		
		int elemanSayisi = sc.nextInt();
		
		int dizi[] = new int[elemanSayisi];
		for (int index = 0; index < dizi.length; index++) {
			System.out.println("dizinin"+index+"indeksli elemanını giriniz: ");
			dizi[index]=sc.nextInt();
		}
		double ortalama = ortalama(dizi);
		System.out.println(ortalama);
	}
	public static double ortalama(int[] dizi) {
		double avg = 0.0;
		int total =0;
		for (int index = 0; index < dizi.length; index++) {
			total +=dizi[index];
		}
		avg = (double) total / dizi.length;
		return avg;
	}

}
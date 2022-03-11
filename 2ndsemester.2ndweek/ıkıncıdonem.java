package youtubejava;
import java.util.*;
public class ıkıncıdonem {

	public static void main(String[] args) {
//	int [][] a1= {{1,2,3},{1,5,3},{1,6,3}};
//	int [][] a2= {{1,6,3},{1,5,3},{1,2,3}};
	

	}
	
//  1. orenk cozumu
	public static boolean isUnique(int []list) {
       for (int i = 0; i < list.length; i++) {
		for (int j = 0; j < list.length; j++) {
			if(list[i]==list[j]) {
				return true;
			}
		}
	}
     return false;  
	}
//	2. ornek cozumu
	public static boolean isSorted(int []list) {
	       for (int i = 0; i < list.length-1; i++) {
			
				if(list[i]>list[i+1]) {
					return false;
				}
		}
	     return true;  
		}

//	3.ornek cozumu
	public static int[][] matrixAdd(int [][]dizi1 ,int[][]dizi2) {
		int [][]dizi3= new int[dizi1.length][dizi1.length];
		
		 for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j<dizi1.length ; j++) {
	
				dizi3[i][j]=dizi1[i][j]+dizi2[i][j];
			
			}
		}
	  return dizi3;
	}
	
	//	4.ornek cozumu
 	public static double sumTo(int sayı) {
		if (sayı<0)
			throw new IllegalArgumentException();
		if (sayı== 0) {
			return 0.0;
			}
		return 1.0/sayı+sumTo(sayı-1);
	}
	
 	
 	//   5.orenk cozumu
 	public static int binarySystem(int sayı) {
		if(sayı<0) {
			System.out.println("hatalı sayı gırdnız");
		}
		
		else if(sayı>=2) {
			binarySystem(sayı/2);
			}
		System.out.print(sayı%2);
	
		return sayı;
 	}
}

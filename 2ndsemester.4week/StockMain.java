package youtubejava;

import java.util.*;

public class StockMain {

	public static void main(String[] args) {

		Scanner console =new Scanner(System.in);
		 
		System.out.println("ilk magaza ismi: ");
		String store1 = console.next();
    	Stock stock1= new Stock(store1);
     	int profit1= makePurchases(stock1,console);
		
     	System.out.println("ikinci magza ısmı : ");
     	String store2=console.next();
     	Stock stock2=new Stock(store2);
     	int profit2 =makePurchases(stock2, console);
     	
     	
     	if (profit1>profit2) {
     		System.out.println(store1+ " daha kazanclıdır.");
     		
     	}else if (profit2>profit1) {
     		System.out.println(store2+ " daha kazanclıdır. ");
     	}else {
     		System.out.println(store1+ " ve "+store2+" esittir.");
     	}
	}


    

     public static int makePurchases(Stock currentStock, Scanner console) {
    	 
    	 System.out.println("kac kez satın alım yaptın");
    	 
    	 int numPurchases = console.nextInt();
    	  
    	  for (int i = 1; i < numPurchases; i++) {
    		  System.out.println( i +": alımda kaç tane aldın? birim fiyatı nedir");
              int numShares =console.nextInt();
              int pricePerShare =console.nextInt();
               currentStock.pruchase(numShares, pricePerShare);
		}
			System.out.println("guncel bırım fıyat ? ");
           
           int currentPrice=console .nextInt();
            
           int profit = currentStock.getProfit(currentPrice);
           System.out.println("net kazanc / kayıp: "+profit+"tl");
           System.out.println();
           return profit;
     }
}
    	 
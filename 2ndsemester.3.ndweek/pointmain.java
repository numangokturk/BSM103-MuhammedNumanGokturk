package youtubejava;

public class pointmain {

	public static void main(String[] args) {

	Point point1= new Point();
	
		 point1.x= 5;
		 point1.y= -4;
		 
   	Point point2=new Point ();
		point2.x=-3;

		point2.y=4;

		System.out.println("("+point1.x+" , "+point1.y+")");
		
		double dist=Math.sqrt((point1.x *point1.x) + (point1.y *point1.y));  
	  System.out.println("orjıne olan uzaklıgı= "+dist);
	
		System.out.println("("+point2.x+" , "+point2.y+")");
	  double dist2=Math.sqrt((point2.x *point2.x) + (point2.y *point2.y));  
	  System.out.println("orjıne olan uzaklıgı= "+dist2);
	
//	noktaların yenın konumaları ıcın degıslıklık

	  point1.x+=10;
	  point1.y+=6;
	  point2.x+=1;
	  point2.y+=7;
	
//	suanda calısmaz cunku icersine ınt bır deger gırılmedı 
     Point pnt =new Point();
	  
	  pnt.x=3;
	  
	  pnt.y=8;
	  
//	  pnt.translate(2,-1);
	  
//	  System.out.println("("+pnt.x+" , "+pnt.y+")");
	  
//	  pnt.translate(-5,7);
//	  System.out.println("("+pnt.x+" , "+pnt.y+")");
	  
//	  point pnt = new point(2,3);
	     
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}

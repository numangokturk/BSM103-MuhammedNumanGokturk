package youtubejava;

public class Point {
	 int x;
	 int y;
	 
	    public  Point(int x,int y) {
	   
	    this.x=x;
	    this.y=y;
	    	System.out.println(x+" " +y);
	    }
	 
	   	public double OrjineOlanUzaklık() {
			
			  return Math.sqrt(x*x+y*y);
		}
		public void Translate(int dx,int dy) {
			x +=dx;
			y +=dy;
		}
		
}

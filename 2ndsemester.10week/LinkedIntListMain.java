
public class LinkedIntListMain {

	public static void main(String[] args) {
	       LinkedIntList linkList = new LinkedIntList();
	       linkList.add(5);
	       linkList.add(7);  
	       linkList.add(9); 
	       System.out.println(linkList.toString());
	       System.out.println(linkList.indexOf(5));
	       System.out.println(linkList.indexOf(7));
	       System.out.println(linkList.indexOf(9));
	       linkList.remove(1);
	       System.out.println(linkList.toString());
	       
	       linkList.add(0,11);
	       System.out.println(linkList.toString());
	       linkList.add(3,3);
	       System.out.println(linkList.toString());
	       
	       int count = linkList.size();
	       System.out.println(count);
	}

}

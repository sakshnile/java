package Demo;

public class Narrowing 
{
	     public void m1(String s)
	     {
	    	 System.out.println("m1 -- String"); 
	     }
	     public void m1(Object o)
	     {
	    	 System.out.println("m1 -- Object");
	     }
	     
	     public static void main(String[] args)
	     {
		      Narrowing n = new Narrowing();
		      n.m1(null);
		 }
	}

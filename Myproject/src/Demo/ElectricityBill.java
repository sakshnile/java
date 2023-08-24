package Demo;

import java.util.Scanner;

public class ElectricityBill 
{
	public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a unit:");
	     int unit = sc.nextInt();
	     double billpay = 0;
	     if(unit < 100)
	     {
	    	 billpay = unit*1.20;
	    	 System.out.println("Unit is less then 100 bill pay: " + billpay);
	     }
	     else if(unit < 300)
	     {
	    	 billpay = 100 * 1.20 + (unit - 100) * 2;
	    	 System.out.println("Unit is less then 300 bill pay: " + billpay);
	     }
	     else if(unit > 300)
	     {
	    	 billpay = 100 * 1.20 * + (unit - 300) * 3;
	    	 System.out.println("Unit is greter then 300 bill pay: " + billpay);
	     }
	}
}

package Assigment3;

public class Question7 {

	public static void main(String[] args) {
		
		int  cents=95,dollar,quarter,dimes,nickles;
		 dollar=cents*100;
		 quarter=(cents-dollar/100)/25;
		 dimes = (cents-dollar/100)/50;
		 nickles=(cents-quarter-dimes)/75;
		

		 
		 System.out.println("Your change is "+quarter+" quarters, "+dimes+" dimes, and "+nickles+" nickles");

		

		
		
		
		
	}

}

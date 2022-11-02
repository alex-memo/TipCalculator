import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Hi Welcome to Tip Calculator!"); //Welcome announcement
		System.out.println("Please rate your service satisfaccion:"); //Question text
		System.out.println("1 = Great quality"); //Describes 1
		System.out.println("0 = Bad quality"); //Describes 0
		double ans = in.nextDouble();//recieves the satisfaccion
		System.out.println("What was the total bill?");//asks the total bill
		double tot = in.nextDouble();//recieves the total
		
	
		
		if (ans > 0){
			System.out.println("You have to pay a tip of: "+ tot * .15);} //calculates the tip if the service was good by multiplying the total by .15
			else {
			System.out.println("You have to pay a bill of: "+ tot * .1); //calculates the tip if the service was poor by multiplying the total by .10
			
				}
		
		
	}

}

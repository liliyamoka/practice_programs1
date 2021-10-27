/*Write a C program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill
*/
import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
		double Amount, addcharge, totalamt;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter units : ");
		int units = sc.nextInt();
		 
		  if (units < 50)
		  {
		       Amount = units * 2.60;
		  addcharge = 25;  
		  }
		  else if (units <= 100)
		  {
		 
		  Amount = 130 + ((units - 50 ) * 3.25);
		  addcharge = 35;
		  }
		  else if (units <= 200)
		  {
		  Amount = 130 + 162.50 + ((units - 100 ) * 5.26);
		  addcharge = 45;
		  }
		  else
		  {
		 
		  Amount = 130 + 162.50 + 526 + ((units - 200 ) * 7.75);
		  addcharge = 55;
		}

		totalamt = Amount +addcharge;
		System.out.println("the total is "+totalamt);
	}

}

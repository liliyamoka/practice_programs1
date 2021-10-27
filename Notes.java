//Write a java program to count total number of notes in given amount
import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Input amount: ");
	       int amt =sc.nextInt();
	       int temp=0;
	       if(amt>=100)
	       {
	      temp=amt%2000;
	      amt=amt/2000;
	      System.out.println("the no of 2000 notes: "+amt);
	      amt=temp/500;
	      temp=temp%500;
	      System.out.println("the no.of 500 notes:"+amt);
	      amt=temp/200;
	      temp=temp%200;
	      System.out.println("the no.of 200 notes:"+amt);
	      amt=temp/100;
	      System.out.println("the no.of 100 notes:"+amt);
		}
		

	}

}

//Write a java program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;
public class DivisibleBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any num:");
		int num = sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.print("given num is divisible");
		}
		else {
			System.out.print("given num is not divisible");
		}
			
	}

}

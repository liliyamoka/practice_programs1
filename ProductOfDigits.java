//Write a java program to calculate product of digits of a number
import java.util.Scanner;
public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int product=1,digits;
		System.out.print("enter number : ");
		int num=sc.nextInt();
		while(num>0)
		{
		 digits=num%10;
		 product=product*(digits%10);
			num=num/10;
		}
		System.out.print(product);
	}

}

//Write a java program to calculate sum of digits of a number
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,digits;
		System.out.print("enter number : ");
		int num=sc.nextInt();
		while(num>0)
		{
			digits=num%10;
			sum=sum+digits;
			num=num/10;
		}
		System.out.print(sum);
	}

}

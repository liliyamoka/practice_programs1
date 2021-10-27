//Write a java program to find power of a number using for loop.
import java.util.Scanner;
public class PowerOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long power=	1;
		System.out.print("enter any number : ");
		int n=sc.nextInt();
		System.out.print("enter any number : ");
		int e=sc.nextInt();
		for(int i=1;i<=e;i++)
		{
			power=power*n;
		}
		System.out.print(power);
	}

}

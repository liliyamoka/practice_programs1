//Write a java program to find maximum between three numbers
import java.util.Scanner;
public class MaxBetween3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number:");
		int x= sc.nextInt();
		System.out.print("enter any number:");
		int y= sc.nextInt();
		System.out.print("enter any number:");
		int z= sc.nextInt();
		if(x>y&&x>z)
		{
			System.out.print(x+" is max ");
		}
		else if(y>x && y>z)
		{
			System.out.print(y+" is max");
		}
		else {
			System.out.print(z+" is max");
		}

	}

}

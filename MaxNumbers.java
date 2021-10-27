//Write a java program to find maximum between two numbers
import java.util.Scanner;
public class MaxNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number:");
		int x= sc.nextInt();
		System.out.print("enter any number:");
		int y= sc.nextInt();
		if(x>y)
		{
			System.out.print(x+"is Maximum");
		}
		else if(x<y){
			System.out.print(y+"is Maximum");
		}
		else
		{
			System.out.print("both are same");
		}
		
	}

}

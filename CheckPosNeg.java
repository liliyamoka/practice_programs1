//3. Write a java program to check whether a number is negative, positive or zero
import java.util.Scanner;
public class CheckPosNeg {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=sc.nextInt();
		
		if(a==0)
		{
			System.out.print("Number is zero");
		}
		else if(a>0){
			System.out.print("Number is positive");
		}
		else {
			System.out.print("Number is negative");
		}
	}

}

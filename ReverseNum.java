import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reverse=0;
		System.out.print("enter number : ");
		int n=sc.nextInt();
	while(n!=0)
		{
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println("Reversed Number is : " + reverse);
	}

}

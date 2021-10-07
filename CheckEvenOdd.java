import java.util.Scanner;
public class CheckEvenOdd {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.print("enter any number:");
int x= sc.nextInt();
if(x%2==0)
{
	System.out.print(x+" is Even");
}
else {
	System.out.print(x+" is Odd");
}
	}

}

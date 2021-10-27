// Write a java program to find frequency of each digit in a given integer
import java.util.Scanner;

public class FindFreqDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num,count=0,digit=0,j;
		
		System.out.println("Enter Number");
		int n=s.nextInt();

		for(j=0;j<=9;j++){
			num=n;
			while(num!=0) {
				digit=num%10;
				if(digit==j) {
					count++;
				}
			num=num/10;
			}
			if(count>0) {
				System.out.println("frequency of digit "+j+" is: "+count);
			}
			count=0;
			
		}
	}

}

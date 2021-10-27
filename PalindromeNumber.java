//Write a java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem,temp,sum=0;
		System.out.print("enter number : ");
		int num=sc.nextInt();
		 temp=num;    
		  while(num>0){    
		   rem=num%10;  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }   
		  if(temp==sum)
		  {
			  System.out.print(temp+" number  is a palindrome"); 
		  }
		  else {
			  System.out.print(temp+" number is not a palindrome");
		  }
	}

}

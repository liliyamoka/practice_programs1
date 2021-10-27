//Write a java program to count total number of vowels and consonants in a string.
import java.util.Scanner;
public class VowCon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any character:");
		char ch = sc.next().charAt(0);
		if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
		{
			System.out.print("is a vowel");
		}
		else {
			System.out.print("is a consonant");
		}
	}

}

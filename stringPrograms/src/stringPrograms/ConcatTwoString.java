package stringPrograms;

import java.util.Scanner;

public class ConcatTwoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1=sc.next();
		System.out.println("Enter 2nd string");
		String s2=sc.next();
		System.out.println("After concat :"+s1 + " "+s2);
		
		System.out.println(s1.concat(s2));
		System.out.println("    "  );
		System.out.print("nn");
		
		
	}

}

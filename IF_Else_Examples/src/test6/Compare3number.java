package test6;
import java.util.*;
public class Compare3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		System.out.println("enter third number:");
		int c=sc.nextInt();
		if (a>b && b>c) {
			System.out.println(a+" is the greatest number among 3 given number");
		}else if(a<b && a>c) {
			System.out.println(b+" is the greatest number");
		}else
			System.out.println(c+"  is the greatest number among 3 given number");
	}

}

package test6;
import java.util.*;
public class EqualsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enterd a number:");
		int a=sc.nextInt();
		System.out.println("entered a number:");
		int b=sc.nextInt();
		System.out.println("enterd a number:");
		int c=sc.nextInt();
		if(a==b && a==c && b==c) {
			System.out.println("all number are same..");
		}else if((a==b )||(a==c) || (b==c)){
			System.out.println("not all numbers are equal or different.");
		}else {
			System.out.println("numbers are different.");
		}
				
				
	}

}

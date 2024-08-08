package test3;
import java.util.*;
public class Test2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter first  number for compareing two number : ");
		int a=sc.nextInt();
		System.out.println("please enter second number for comparing two number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is biggest value among two number..");
		}else {
			System.out.println(b+" b is biggest value among two number..");
		}
		
	}
}

package test6;
import java.util.*;
public class Positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("the number is positive");
		}else if(a==0){
			System.out.println("the number is zero");
		}else {
			System.out.println("the number is negative.");
		}
			
	}

}

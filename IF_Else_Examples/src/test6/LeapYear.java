package test6;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag=false;
		if(year % 400==0) {
			flag=true;
		}else if(year % 4==0) {
			flag=true;
		}else if(year %100==0) {
			flag=true;
		}else {
			flag=false;
		}
		if(flag) {
			System.out.println("it is a leap year..");
		}else
			System.out.println("it is not a leap year..");
	}

}

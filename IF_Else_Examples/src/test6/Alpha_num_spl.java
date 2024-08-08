package test6;
import java.util.*;
public class Alpha_num_spl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some thing:");
		char data=sc.next().charAt(0);
		if( data>='a' && data<='z' || data>='A' && data<='Z') {
			System.out.println("this is a letter that you entered from the keyboard");
		}else if(data>='0'&& data <= '9') {
			System.out.println("this is a number that you enterd from the keyboard");
		}else {
			System.out.println("this is a special charater that you enterd from the keyboard.");
		}
	}

}

package test3;
import java.util.Scanner;
public class ReverseCharc {
	static String Reversecharacter(String str){
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string for reverse the charcter:");
		String str=sc.nextLine();
		
		System.out.println(Reversecharacter(str));
		
		
	}

}

package test3;
import java.util.Scanner;
public class ReverseOrder {
	static String ReverseOrder(String line) {
		StringBuilder sb=new StringBuilder();
		String []word=line.split(" ");
		
		for(int i=word.length-1;i>=0;i--) {
			sb.append(word[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some stirng for reverse:");
		String line=sc.nextLine();
		
		String sr= ReverseOrder(line);
			 System.out.println(sr);

		
	}

}

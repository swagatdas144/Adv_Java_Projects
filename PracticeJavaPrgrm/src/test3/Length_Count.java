package test3;
import java.util.Scanner;
public class Length_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string for count:");
		String St=sc.nextLine();
		int count=0;
		try {
		for(int i=0;true;i++) {
			St.charAt(i);
			count++;
		}
		}catch(Exception e) {
			
		}System.out.println(count);
	}

}

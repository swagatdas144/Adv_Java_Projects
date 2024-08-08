package test6;
import java.util.*;
class Profit_Loss{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost of the price:");
		int cp=sc.nextInt();
		System.out.println("enter the selling price:");
		int sp=sc.nextInt();
		int p,l;
		if(cp<sp) {
			p=sp-cp;
			System.out.println("the total profit is:"+p);
		}else if(cp>sp) {
			l=cp-sp;
			System.out.println("the total loss is "+l);
		}else {
			System.out.println("here is no profit and no loss..");
		}
	}
	
}

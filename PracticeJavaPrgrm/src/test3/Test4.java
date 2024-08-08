package test3;
import java.io.*;
public class Test4 {
	public static void main(String[]args) throws FileNotFoundException,IOException{
		Account acc=new Account();
		acc.setAccName("swagat");
		acc.setAccNum(1234);
		acc.setAccBal(100000);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.ser"));
		oos.writeObject(acc);
		System.out.println("account object successfully stored..");
	}
}

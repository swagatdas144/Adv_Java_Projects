package test3;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test5 {
	public static void main(String[]args) throws FileNotFoundException,IOException,ClassNotFoundException,InvalidClassException{
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.ser"));
		Object obj=ois.readObject();
		if(obj instanceof Account acc) {
			System.out.println(acc);
		}
		
	}
}

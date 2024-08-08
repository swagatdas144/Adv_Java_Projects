package test3;
class A extends Throwable{
	
}
public class Test1 {
	public static void main(String[] args) throws A {
		// TODO Auto-generated method stub
		try {
			throw new A();
		}catch(A a) {
			
		}
	}

}

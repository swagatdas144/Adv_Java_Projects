package test3;

public class Test1 {
	static int g=45;
	static int h=65;
	static int j;
	int c=25;
	int d=35;
	int e;
	public void add() {
		e=c+d;
	}
	public static void sub() {
		j=h-g;
	}
	public static void main(String[]args) {
		System.out.println("here is the addition and subtraction programme..");
		sub();
		Test1 t1=new Test1();
		t1.add();
		System.out.println("the subtraction of the two number is:"+j);
		System.out.println("the addition of the two number is:"+t1.e);
		
		
	}
}

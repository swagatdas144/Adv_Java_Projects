package test3;
class PrintNumbers{
	private boolean printed;
	public synchronized void printoddnumbers(int num) {
		if(printed) {
			try{wait();}catch(InterruptedException i) {}
		}
		System.out.println("num"+num);
		printed=true;
		notify();
	}
	
	public synchronized void printevennumbers(int num) {
		if(!printed) {
			try {wait();}catch(InterruptedException i) {
				
			}
		}
		System.out.println("num"+num);
		printed=false;
		notify();
	}
}
class Oddrunnable implements Runnable{
	private PrintNumbers pn;
	public Oddrunnable(PrintNumbers pn) {
		this.pn=pn;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i+=2) {
			pn.printoddnumbers(i);
		}
	}
	
}
class Evenrunnable implements Runnable{
private PrintNumbers pn;
public Evenrunnable(PrintNumbers pn) {
	this.pn=pn;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i+=2) {
			pn.printevennumbers(i);
		}
	}
	
}

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers printnumber=new PrintNumbers();
		Oddrunnable oddrunable=new Oddrunnable(printnumber);
		Evenrunnable evenrunable=new Evenrunnable(printnumber);
		Thread th1=new Thread(oddrunable);
		Thread th2=new Thread(evenrunable);
		th1.start();
		th2.start();
	}

}

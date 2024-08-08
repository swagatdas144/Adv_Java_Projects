package test3;
public class Test3 extends Thread
{
	@Override
	public void run() {
		
		System.out.println("run start");
		System.out.println("run state "+this.getState());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException i) {
			
		}
		System.out.println("run end"+this.getState());
	}
	public static void main(String[] args)  throws InterruptedException{
		Test3 t1=new Test3();
		System.out.println("main start "+t1.getState());
		t1.start();
		Thread.sleep(2000);
		System.out.println("main end "+t1.getState());
	}

	}


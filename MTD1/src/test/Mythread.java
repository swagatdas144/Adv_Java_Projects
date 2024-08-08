package test;
public class Mythread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(getName()+":"+i);
			if(i==5 && getName().equals("child2")) {
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	
		}
	}
	public static void main(String[]args)throws InterruptedException {
		System.out.println("main is started..");
		Mythread m1=new Mythread();
		m1.setName("child 1");
		m1.start();
		Mythread m2=new Mythread();
		m2.setName("child2");
		m2.start();
		m1.join();
		m2.join();
		System.out.println("main is existed..");
	}
}
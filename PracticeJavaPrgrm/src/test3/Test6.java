package test3;

class Factory{
	private int items; 
	public boolean itemsavailable;
	public synchronized void produce(int items) {
		if (itemsavailable) {
			try{wait();}catch(InterruptedException i){
				
			}
		}
		this.items=this.items+items;
		itemsavailable=true;
		System.out.println("items produced"+items);
		notify();
	}
	public synchronized void consume(int items) {
		
		if (! itemsavailable ) {
			try {wait();}catch(InterruptedException i) {
		}
		}
		this.items=this.items-items;
		itemsavailable=false;
		System.out.println("items consumed"+items);
		notify();
	}
}
class Producer implements Runnable{
	private Factory fa;
	public  Producer(Factory fa) {
		// TODO Auto-generated constructor stub
		this.fa=fa;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			fa.produce(i);
		}
	}
	
}
class Consumer implements Runnable{
	private Factory fa;
	public   Consumer(Factory fa) {
		// TODO Auto-generated constructor stub
		this.fa=fa;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			fa.consume(i);
		}
	}
	
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Producer producer=new Producer(factory);
		Consumer consumer=new Consumer(factory);
		Thread th1=new Thread(producer);
		Thread th2=new Thread(consumer);
		th1.start();
		th2.start();
		
		
		
	}

}


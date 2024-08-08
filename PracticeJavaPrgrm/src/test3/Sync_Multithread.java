package test3;
class Addition{
	private int x;
	private int y;
	void add(int x,int y) {
		for(int i=1;i<20;i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		synchronized (this) {
			for(int i=21;i<=50;i++) {
				System.out.println(i+" ");
			}
		}
		for(int i=51;i<=60;i++) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
}
class Thread1{
	
}

public class Sync_Multithread {
	public static void main(String[] args) {
		Addition a=new Addition();
		
	}
}

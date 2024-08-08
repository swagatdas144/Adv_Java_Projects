package test3;

public class TestNit_Table_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nit_Table_Collection nit=new Nit_Table_Collection();
		System.out.println(nit.capacity());
		System.out.println(nit.size());
		System.out.println(nit);
		nit.put(1,"nit");
		System.out.println(nit);
		nit.put(2,5);
		System.out.println(nit);
		nit.put(3,6.5);
		System.out.println(nit);
		nit.put(4,"nit");
		System.out.println(nit);
		nit.put(5,"nit");
		System.out.println(nit);
		nit.put(6,"nit");
		System.out.println(nit);
		nit.put(7,true);
		System.out.println(nit);
		nit.put(8,"nit");
		System.out.println(nit);
		nit.put(9,"nit");
		System.out.println(nit);
		nit.put(10,"nit");
		System.out.println(nit);
		nit.put(11, 8);
		System.out.println(nit);
	
		
		System.out.println(nit.capacity());
		System.out.println(nit.size());
	}

}

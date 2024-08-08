package test3;

public class Test_NitCollection {

	public static void main(String[] args) {
		NitCollection nit=new NitCollection();
		System.out.println(nit.capacity());
		System.out.println(nit.size());
		nit.add(5);
		nit.add("nit");
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(6);
		nit.add(true);
		nit.add(6);
		nit.add(6);
		nit.add(10.5);
		System.out.println(nit.capacity());
		System.out.println(nit.size());
		System.out.println(nit);
	}

}

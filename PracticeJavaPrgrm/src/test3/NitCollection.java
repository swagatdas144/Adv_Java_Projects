package test3;

import java.util.Arrays;

public class NitCollection {
	private Object[] elementdata;
	private int elementcount;
	public NitCollection() {
		elementdata=new Object[10];
	}
	public  int capacity() {
		return elementdata.length;
		
	}
	public int size() {
		return elementcount;
	}
	public void add(Object obj) {
		if(size()==capacity()) {
			grow();
		}
		
		elementdata[elementcount]=obj;
		elementcount++;
	}
	private void grow() {
		Object[]nextarray=new Object[capacity()*2];
		for(int i=0;i<elementdata.length;i++) {
			nextarray[i]=elementdata[i];
		}
		elementdata=nextarray;
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(elementdata);
	}
	
}

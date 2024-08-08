package test3;

import java.util.Arrays;

public class Nit_Table_Collection {
	private Object[] keys;
	private Object[] values;
	private int sizes;
	public Nit_Table_Collection() {
		keys=new Object[10];
		values=new Object[10];
	}
	public int capacity() {
		return keys.length;
	}
	public int size() {
		return sizes;
	}
	public void put(Object key,Object value) {
		if(size()==capacity()) {
			grow();
		}
		keys[sizes]=key;
		values[sizes]=value;
		sizes++;
	}
	private void grow() {
		Object[] nextkeysarray=new Object[capacity()*2];
		Object[] nextvalues=new Object[capacity()*2];
		for(int i=0;i<keys.length;i++) {
			nextkeysarray[i]=keys[i];
			nextvalues[i]=values[i];
		}
		keys=nextkeysarray;
		values=nextvalues;
			
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(keys)+"\n"+Arrays.toString(values);
	}
	
}

package test3;

import java.io.Serializable;

public class Account implements Serializable {
private static final long serialVersionUID=1L;
private  String AccName;
private long AccNum;
private double AccBal;
public String getAccName() {
	return AccName;
}
public void setAccName(String accName) {
	AccName = accName;
}
public long getAccNum() {
	return AccNum;
}
public void setAccNum(long accNum) {
	AccNum = accNum;
}
public double getAccBal() {
	return AccBal;
}
public void setAccBal(double accBal) {
	AccBal = accBal;
}

	@Override
	public String toString() {
		return "====Account details======="+"\n"+
				"account name=:"+AccName+"\n"+
				"account number:"+AccNum+"\n"+
				"account balance:"+AccBal;
	}

}

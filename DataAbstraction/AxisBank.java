package DataAbstraction;

public class AxisBank implements Bank {
	String branch;
	public int getRateOfIntrest(int per,int amount) {
		return amount*per/100;
	}

}

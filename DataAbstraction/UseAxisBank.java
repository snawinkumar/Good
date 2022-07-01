package DataAbstraction;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank axisBank=new AxisBank();
		axisBank.branch="IGP";
		System.out.println(axisBank.branch);
		System.out.println(axisBank.getRateOfIntrest(8,500000));
	}

}
package week1.day1;

public class ClassAndObjectsEx {

	int cost;
	int logo;
	boolean isTouchScreen;
	String brandName;
	
	public void makeCalls() {
		System.out.println("Making calls");

	}
	
	public void payMoney() {
		System.out.println("Pay Money");

	}
	
	public static void main(String[] args) {
		ClassAndObjectsEx samsung= new ClassAndObjectsEx();
		ClassAndObjectsEx apple= new ClassAndObjectsEx();
		
		samsung.brandName="Samsung";
		samsung.cost=12000;
		samsung.isTouchScreen=true;
		System.out.println("BrandName:" +samsung.brandName);
		System.out.println("Cost:" +samsung.cost);
		System.out.println("isTouchScreen:" +samsung.isTouchScreen);
	}

}

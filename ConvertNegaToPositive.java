package week1.day1;

public class ConvertNegaToPositive {

	public static void main(String[] args) {
		int num =-40;
		int num1;
		if(num>0)
		{
			System.out.println("The number is positive "+num);
		}
		else if(num<0)
		{
			System.out.println("The number is negative: "+num);
			num1=num;
			num = num*-1;
			System.out.println("The number "+num1+ " is converted to "+num);
		}
		else
		{
			System.out.println("The number is neither negative nor positive: "+num);
		}
	}

}

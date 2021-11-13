package week3Assignment7;

public class StringComparison {

	public static void main(String[] args) {
String String1= "I am Learing Java";
String String2= "I am learing java?";
//Comparing with == operator
if(String1==String2)
{
	System.out.println("Same Text");
}
else
	System.out.println("Different text");

	//Comparing with equals operator
	if(String1.equals(String2))
	{
		System.out.println("Same Text");
	}
	else
		System.out.println("Different text");
		
	
	//Comparing with equalsIgnorecase operator
		if(String1.equalsIgnoreCase(String2))
		{
			System.out.println("Same Text");
		}
		else
			System.out.println("Different text");
			}
}

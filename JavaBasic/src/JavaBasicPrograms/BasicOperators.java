package JavaBasicPrograms;

public class BasicOperators {
	
	public static void main(String args[])
	{
		//Arithmetic operators
		int a=10,b=5;
		int c;
		
		System.out.println(":Arithmetic operators:");
		
		//+ returns addition of two numbers
		c=a+b;
		System.out.println("a+b="+c);
		
		//- returns subtraction of two numbers
		c=a-b;
		System.out.println("a-b="+c);
		
		//* returns multiplication of two numbers
		c=a*b;
		System.out.println("a*b="+c);
				
		// / returns division of two numbers
		c=a/b;
		System.out.println("a/b="+c);
				
		// % returns modulus of two numbers
		c=a%b;
		System.out.println("a%b="+c);
		
		//Assignment Operator
		
		System.out.println(":Assignment Operator:");
		
		// = assigns a value to a variable
		c=a;
		System.out.println("value of c is "+c);
		
		//Compound assignment operators (eg: += ; -= ; *= ; /=)
		int d=10;
		
		System.out.println(":Coumpond Assignment:");
		System.out.println("Value of d is "+d);
		
		d+=5;
		System.out.println("d+=5 gives "+d);
		
		d-=5;
		System.out.println("d-=5 gives "+d);
		
		d*=5;
		System.out.println("d*=5 gives "+d);
		
		d/=5;
		System.out.println("d/=5 gives "+d);
		
		//ternary operator demonstration
		
		c=(10==c)?1:0;
		System.out.println("Ternary out check c gives "+c);
		
	}

}

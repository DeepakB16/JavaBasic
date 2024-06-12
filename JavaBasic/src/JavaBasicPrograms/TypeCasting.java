package JavaBasicPrograms;

public class TypeCasting {
	
	public static void main(String[] args) {
		// widening or implicit type casting
		
		System.out.println(":Implicit Type Casting:"); //Lower byte to Higher Byte Conversion
		
		byte b = 10; 
		int i = b; //4 bytes
		System.out.println("Byte to Interger i : "+i);
		
		float f = 22.14f;	// 4 bytes
		double d = f;		// 8 bytes
		System.out.println("Float to Double d : "+d);
		
		char ch = 'A';	// 2 bytes
		int i3 = ch;	// 4 bytes
		System.out.println("Char to Integer i3 : "+i3); //returns ASCII code for the character
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println("Char Unicode to Integer i4 : "+i4); //The Unicode is coverted to its respective value
		
		// narrowing/explicit type casting
		
		System.out.println(":Explicit Type Casting:"); //Higher Byte to Lower Byte Conversion

		double f1 = 10.52f;	
		long l = (long) f1;
		System.out.println("Float to Long l : "+l);

		long l1 = 923372036854775806l;
		int i2 = (int) l1;
		System.out.println("Long to Interger i2 : "+i2);

		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println("Float to Interger i2 : "+i1);

		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println("Byte to Char ch1 : "+ch1);
	}

}

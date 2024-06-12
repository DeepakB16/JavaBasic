package JavaBasicPrograms;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a=5;
		
		System.out.println("a="+a);
		
		//Increment
		System.out.println(":Increment:");
		
		System.out.println("Pre-Increment (++a) : "+(++a)); //increment while this line is executed
		System.out.println("Post-Increment (a++) : "+(a++)); //increment after this line is executed
		System.out.println("Next line after post increment a = "+a);
		
		//Decrement
		System.out.println(":Decrement:");
		
		System.out.println("Pre-Decrement (--a) : "+(--a)); //Decrement while this line is executed
		System.out.println("Post-Decrement (a--) : "+(a--)); //Decrement after this line is executed
		System.out.println("Next line after Post Decrement a = "+a);

	}

}

package eee;

public class e1{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person not eligible");
		}
		else
		{
			System.out.println("Person is eligible");
		}
	}
	
	public static void main(String[] args) {
		e1 e = new e1();
		e.validate(70);
		
	
	}
}


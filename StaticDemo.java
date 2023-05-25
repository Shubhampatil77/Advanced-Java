package Lambada;
interface Sayable
{
	public static void print()
	{
		System.out.println("Inside Static Method:");
	}
	public default void say()
	{
		System.out.println("Inside Default Method :");
	}
	
	public void Display();
}

public class StaticDemo implements Sayable{

	public void Display() {
		System.out.println("Inside Abstract Method:");

	}

	public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
		obj.say();
		obj.Display();
		Sayable.print();
		
		

	}
}
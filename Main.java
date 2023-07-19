package Multithreading;

public class Main {
	public static void main(String[] args) {
		NumThread Shubham=new NumThread();
		Shubham.run();
		System.out.println("Shubham Ravinda Patil");
		
		for(int n=1;n<=10;n++)
		{
			System.out.println("Shubham");
		}
	}
}
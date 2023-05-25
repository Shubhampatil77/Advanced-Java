package Lambada;
interface Drawable1
{
	public void draw();
}
public class FuctionInterfaceWithLambada {

	public static void main(String[] args) {
		int width=10;
		Drawable d1=()->{System.out.println("Width="+width);
	};
	d1.Draw();
	} 
}

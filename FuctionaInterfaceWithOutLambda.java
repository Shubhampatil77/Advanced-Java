package Lambada;
interface Drawable
{
	public void Draw();
}
public class FuctionaInterfaceWithOutLambda {

	public static void main(String[] args) {
		int width=10;
		Drawable d1=new Drawable()
				{
			public void Draw()
			{
				System.out.print("Width="+width);
			}
			};
			d1.Draw();
			}
}
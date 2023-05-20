package Collection;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

class Book implements Comparable<Book>
{
	int bid,price;
	String title;
	public Book(int bid,int price,String title)
	{
		super();
		this.bid=bid;
		this.price=price;
		this.title=title;
	}
	@Override
	public String toString() 
	{
		return "Book [bid=" + bid + ", price=" + price + ", title=" + title + "]";
	}
	public int compoentTO(Book b2)
	{
		if(price==b2.price)
			return 0;
		else if(price<b2.price)
			return 1;
		else
			return -1;
		}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class CompraterComprable 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ArrayList<Book>list=new ArrayList<Book>();
		list.add(new Book(1,100,"ABC"));
		list.add(new Book(2,400,"XYZ"));
		list.add(new Book(3,600,"ASD"));
		list.add(new Book(4,800,"PQR"));
		Collections.sort(list);
		for(Book b:list);
	}
}
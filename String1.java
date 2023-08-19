package Practice;

public class String1 {

	public static void main(String[] args) {
		String s1=new String("Profound");
		System.out.println(s1);
		System.out.println("Length="+s1.length());
		System.out.println("SubString="+s1.substring(3));
		System.out.println("SubString="+s1.substring(0, 3));
		
		String s2= new String("Edtech");
		System.out.println(s2);
		System.out.println(s1.equals("Profound"));
		System.out.println("Concat="+s1.concat(s2));
		System.out.println("Concat="+s1.charAt(4));
		
		String s3="Java Is Delopevd By Games Gosling";
		
		System.out.println(s3);
		
		String s4[]=s3.split(" ");
			for(String x:s4)
				
				
				System.out.println(x);
		
	}

}

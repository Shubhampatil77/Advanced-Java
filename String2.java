package Practice;

public class String2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Profound");
		System.out.println(sb);
		System.out.println("Insert:"+sb.insert(8,"It"));
		System.out.println("Append:"+sb.append("Solutions"));
		System.out.println("Delete:"+sb.delete(8,10));
		System.out.println("Replace:"+sb.replace(8,10,"IT"));
	}

}

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayEx5 
{
	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList();
		al.add("Partha");
		al.add("West Bengal");
		al.add("India");
		al.add(15000);
		System.out.println(al);
		al.add(3,"QSpider");
		System.out.println(al);
		for(Object i:al)
		{
			System.out.println("printimg is in loop "+i);
		}
		Iterator<Object>st=al.iterator();
		while(st.hasNext())
		{
			System.out.println(st.next());
		}
	}
}

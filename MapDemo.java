import java.util.*;

class MapDemo
{
	public static void main(String args[])
	{
		HashMap m1 = new HashMap();

		m1.put(1 ," Ram");
		m1.put(2 ," Krishna");
		m1.put(3 ," Brahmha");
		m1.put(4 ," Mahadev");
		m1.put(5 ," ganesh");

        	System.out.println("\n Hash Map : " + m1);

		Set s=m1.entrySet();

		Iterator itr=s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();

        		System.out.println(entry.getKey()+" " +entry.getValue());

		}

		LinkedHashMap m2 = new LinkedHashMap();

		m2.put(1 ," Ram");
		m2.put(2 ," Krishna");
		m2.put(3 ," Brahmha");
		m2.put(4 ," Mahadev");
		m2.put(5 ," ganesh");

        	System.out.println("\n Linked Hash Map : " + m2);

		Set s1=m2.entrySet();

		Iterator itr1=s1.iterator();

		while(itr1.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr1.next();

        		System.out.println(entry.getKey()+" " +entry.getValue());

		}


		TreeMap m3 = new TreeMap();

		m3.put(1 ," Ram");
		m3.put(2 ," Krishna");
		m3.put(3 ," Brahmha");
		m3.put(4 ," Mahadev");
		m3.put(5 ," ganesh");

        	System.out.println("\n Tree Map : " + m3);

		Set s2=m3.entrySet();

		Iterator itr2=s2.iterator();

		while(itr2.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr2.next();

        		System.out.println(entry.getKey()+" " +entry.getValue());

		}


	}
}


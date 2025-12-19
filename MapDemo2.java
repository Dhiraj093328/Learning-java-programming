import java.util.*;

class MapDemo2
{
	public static void main(String args[])
	{
		HashMap m1 = new HashMap();

		m1.put(1,"Ram");
		m1.put(2,"Krishna");
		m1.put(3,"Brahmha");
		m1.put(4,"Mahadev");
		m1.put(5,"ganesh");

        	System.out.println("\n Hash Map : " + m1);

		Set s=m1.entrySet();

		Iterator itr=s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();

        		System.out.println(entry.getKey()+" " +entry.getValue());

		}

		m1.remove(3);
        	System.out.println("\n After remove Hash map : " + m1);


        	System.out.println("\n Key set"+m1.keySet());

        	System.out.println("\n Key 4 is exisist : " + m1.containsKey(4));
        	System.out.println("\n Ram is exisist : " + m1.containsValue("Ram"));
        	System.out.println("\nGet (2)?"+m1.get(2));

		//replace key
		m1.replace(4,"Bholenath");

        	System.out.println("\n After replace  KeyValue 4: " + m1);


	}
}


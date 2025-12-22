import java.util.*;

enum colors { GREEN, SAFFRON, BLUE, RED, YELLOW }

public class MapSetTest 
{
    public static void main(String args[])
	{
		EnumMap<colors,String> map=new EnumMap<colors,String>(coloprs.class);
		map.put(colors.GREEN,"1");
		map.put(colors.SAFFRON,"2");
		map.put(colors.BLUE,"3");

		System.out.printl(map);

	}
}

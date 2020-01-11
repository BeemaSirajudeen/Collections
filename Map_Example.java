import java.util.*;
public class Map_Example 
{

	public static void main(String[] args)
	{
		Map<Integer,String>map=new TreeMap<Integer,String>();// Creating tree map
		// adding element
		map.put(1,"Amit");
		map.put(5,"Rahul");
		map.put(2,"Jai");
		map.put(6,"Amit");
		// printing element
		for(Map.Entry e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
		
		
	}

}

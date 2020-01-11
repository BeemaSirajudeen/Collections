import java.util.*;
public class LinkedHashMap_Example1 
{

	public static void main(String[] args) 
	{

		Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		// adding element
		map.put("ONE",1);
		map.put("TWO",2);
		map.put("THREE",3);
		map.put("FOUR",4);
		// printing element
		for(Map.Entry e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}

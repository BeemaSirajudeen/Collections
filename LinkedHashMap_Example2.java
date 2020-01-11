import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class LinkedHashMap_Example2 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));//creating buffer object
		System.out.println("Enter the number of values to be inserted in map : ");
		int n=Integer.parseInt(sc.readLine());//reading limit
		int i;
		TreeMap<String,Integer>map=new TreeMap<String,Integer>();//creating TreeMap
		for(i=0;i<n;i++)//adding elements to TreeMap
		{
			String s=sc.readLine();
			int c=Integer.parseInt(sc.readLine());
			map.put(s,c);
		}	
	
		System.out.println("Enter the index to be removed : ");
		String s1=sc.readLine();
		map.remove(s1);//removing elements using key
		System.out.println(map);
		System.out.println("size : "+map.size());
	}

}

package set;
import java.util.*;
public class HashSetExample_4
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			int c=s.nextInt();
			set.add(c);
			
		}
		System.out.println("numbers:"+set);
		set.remove(10);
		System.out.println("After remove(10): "+set);
		HashSet<Integer>set1=new HashSet<Integer>();
		
		for(int n3:set)
		{
			int n4=n3;
			int n5=(int)Math.sqrt(n4);
			if((n5*n5)==n4)
			{
				set1.add(n4);
			}
		}
		set.removeAll(set1);
		System.out.println("After removeAll(perfectSquare):"+set);
		
	
		set.clear();
		System.out.println("After clear():"+set);
	}

}

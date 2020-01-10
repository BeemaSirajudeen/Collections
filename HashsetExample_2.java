package set;
import java.util.*;
public class HashsetExample_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashSet<Integer>alist=new HashSet<Integer>(); // creating ArrayList
		for(int i=0;i<n;i++)
		{
			int c=s.nextInt();
			alist.add(c);// adding elements to ArrayList
		}
		HashSet<Integer>set=new HashSet<Integer>();// creating the HashSet
		set.addAll(alist);// adding elements of ArrayList to HashSet using addAll()
		System.out.println(set);
		
		

	}

}

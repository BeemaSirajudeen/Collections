package set;
import java.util.*;
public class HashsetExample_1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashSet<Integer>set1=new HashSet<Integer>();// creating ArrayList of set1
		for(int i=0;i<n;i++)
		{
			int c=s.nextInt();
			set1.add(c);// adding elements to ArrayList
		}
		System.out.println(set1);
		HashSet<Integer>set2=new HashSet<Integer>();// creating ArrayList of set2
		int m=s.nextInt();
		for(int i=0;i<m;i++)
		{
			int d=s.nextInt();
			set2.add(d);//adding elements to set2
		}
		System.out.println(set2);
		HashSet<Integer>union=new HashSet<Integer>(set1);// Creating set for union by passing first set as object
		union.addAll(set2);//union operation is performed by addAll()
		System.out.println("Union"+union);
		HashSet<Integer>intersection=new HashSet<Integer>(set1);// Creating set for intersection by passing first set as object
		intersection.retainAll(set2);//intersection operation is performed by retainAll()
		System.out.println("Intersection"+intersection);
		HashSet<Integer>symmdifference=new HashSet<Integer>(set1);//Creating set for Symmetric difference by passing first set as object
		symmdifference.addAll(set2);//Symmetric difference operation is performed by addAll()
		System.out.println("Symmetric difference"+symmdifference);
		
	}

}

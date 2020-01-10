package arrayList;
import java.util.*;
public class ArrayListExample_Sort
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer>marks=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int c=s.nextInt();
			marks.add(c);
			
		}
		ArrayList<Integer>sorted=(ArrayList<Integer>)marks.clone();
		System.out.println("Actual list:"+marks);
		Collections.sort(sorted); // sort the array list values
		System.out.println("sorted list"+sorted);
	}

}

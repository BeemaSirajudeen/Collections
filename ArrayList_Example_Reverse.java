package arrayList;
import java.util.*;
public class ArrayList_Example_Reverse 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String>Stationarylist=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			Stationarylist.add(str);
		}
		System.out.println(Stationarylist);
		List<String>newlist=new ArrayList<String>(); // to print array list in reverse order
		for(int j=n-1;j>=0;j--)
		{
			
			newlist.add(Stationarylist.get(j));
		}
		System.out.println(newlist);

	}

}

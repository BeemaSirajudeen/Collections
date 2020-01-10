package linkedlist;
import java.util.*;
public class LinkedList_Example_Copy 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<String>list=new LinkedList<String>();// creating linked list
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			list.add(str);// adding word to linked list
		}
		int m=s.nextInt();
		ArrayList<String>alist=new ArrayList<String>();
		for(int j=0;j<m;j++)
		{
			String str1=s.next();
			alist.add(str1);// adding word to linked list
		}
		
		System.out.println("Actual Linked list:"+list);
		list.addAll(alist);
		System.out.println("After copy"+list);
		
		

	}

}

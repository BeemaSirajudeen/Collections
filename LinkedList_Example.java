package linkedlist;
import java.util.*;
public class LinkedList_Example 
{

	public static void main(String[] args) 
	{
		List word=new LinkedList(); // creating linked list
		word.add("Competition");// adding word to linked list
		word.add("Be positive");
		word.add("Happy Day");
		Iterator itr=word.iterator();// creating object for iterator
		while(itr.hasNext()) // check there is next element or not
		{
			System.out.println(itr.next());// return element in the linked list
		}
		
	}

}

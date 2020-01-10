package arrayList;
import java.util.*;
class Contacts
{
	private String name;
	private String phone_no;
	 public Contacts(String name,String phone_no)
	 {
		 this.name=name;
		 this.phone_no=phone_no;
		 
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String getPhone()
	 {
		 return phone_no;
	 }
}
public class ArrayList_Example_UserDefined 
{
	

	public static void main(String[] args)
	
	{
		ArrayList<Contacts>contact=new ArrayList<Contacts>();  // create an array list to store contacts
		
			Contacts obj=new Contacts("tim","15456787");         // create an object for contacts by user defined contacts value
			Contacts obj1=new Contacts("john","181888425");
			contact.add(obj);
			contact.add(obj1);
			
		    for(int i=0;i<contact.size();i++)
			 {
				 System.out.println(contact.get(i).getName()+""); 
				 System.out.println(contact.get(i).getPhone()+""); 
	
		     }
	}
}


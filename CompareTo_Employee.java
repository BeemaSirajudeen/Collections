import java.util.*;

public class CompareTo_Employee implements Comparable<CompareTo_Employee>
{
	private String name;
	private int age;
	// to return name
	public String getName()
	{
		return name;
	}
	// to set name to global variable
	public void setName(String name)
	{
		this.name=name;
	}
	//return age
	public int getAge()
	{
		return age;
	}
	// to set age to global variable
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int compareTo(CompareTo_Employee e) 
	{
		if(age>e.getAge())
		{
			return 1;
		}
		else if(age<e.getAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		

}
}

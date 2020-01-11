import java.util.*;
import java.util.*;
public class HashMap_Employee_Main 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,HashMap_Employee>map=new HashMap<Integer,HashMap_Employee>();// creating HashMap for classEmployee
		HashMap_Employee[]emp=new HashMap_Employee[n];//creating array of class object
		// adding elements to HashMap
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new HashMap_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
			
			
		}
		//return elements from HashMap
		for(Map.Entry<Integer,HashMap_Employee> e:map.entrySet())
		{
		   HashMap_Employee obj=e.getValue();
		   System.out.println(e.getKey()+" "+obj.getName()+" "+obj.getAge());
		   sc.close();
		}
		
		

	}

}

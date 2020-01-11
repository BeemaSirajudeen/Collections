import java.util.*;
public class LinkedHashMap_Employee_Main 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,LinkedHashMap_Employee>map=new HashMap<Integer,LinkedHashMap_Employee>();// creating LinkedHashMap for classEmployee
		LinkedHashMap_Employee[]emp=new LinkedHashMap_Employee[n];//creating array of class object
		// adding elements to LinkedHashMap
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new LinkedHashMap_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
			
			
		}
		//return elements from LinkedHashMap
		for(Map.Entry<Integer,LinkedHashMap_Employee> e:map.entrySet())
		{
			LinkedHashMap_Employee obj=e.getValue();
		   System.out.println(e.getKey()+" "+obj.getName()+" "+obj.getAge());
		   sc.close();
		}
		

	}

}

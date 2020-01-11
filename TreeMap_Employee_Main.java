import java.util.*;
public class TreeMap_Employee_Main
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,TreeMap_Employee>map=new HashMap<Integer,TreeMap_Employee>();// creating TreeMap for classEmployee
		TreeMap_Employee[]emp=new TreeMap_Employee[n];//creating array of class object
		// adding elements to TreeMap
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new TreeMap_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
			
			
		}
		//return elements from TreeMap
		for(Map.Entry<Integer,TreeMap_Employee> e:map.entrySet())
		{
			TreeMap_Employee obj=e.getValue();
		   System.out.println(e.getKey()+" "+obj.getName()+" "+obj.getAge());
		   sc.close();
		}
	}

}

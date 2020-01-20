import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompareTo_Employee_Main {

	public static void main(String[] args) {
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,CompareTo_Employee>map=new HashMap<Integer,CompareTo_Employee>();// creating CompareTo for classEmployee
		CompareTo_Employee[]emp=new CompareTo_Employee[n];//creating array of class object
		// adding elements to CompareTo
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new CompareTo_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
		}
		for(Map.Entry<Integer,CompareTo_Employee> e:map.entrySet())
		{
			CompareTo_Employee obj=e.getValue();
		   System.out.println(e.getKey()+" "+obj.getName()+" "+obj.getAge());
		   sc.close();
		}

	}

}

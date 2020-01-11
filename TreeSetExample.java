package set;
import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetExample 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Employee>hashset=new TreeSet<Employee>();// creating TreeSet for classEmployeee
		Employee[]emp=new Employee[n];//creating array of class object
		// adding elements to treeSet
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
			
		}
		//return elements from TreeSet
		for(Employee e:hashset)
		{
		   System.out.println(e.getName()+" "+e.getAge());
		   sc.close();
		}
	}

}

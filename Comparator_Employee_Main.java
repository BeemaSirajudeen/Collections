import java.util.*;

public class Comparator_Employee_Main 
{

	public static void main(String[] args) 
	{
		 
			int n,i;
			String name;
			int age;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			List<Comparator_Employee>list=new LinkedList<Comparator_Employee>();// creating CompareTo for classEmployee
			Comparator_Employee[]emp=new Comparator_Employee[n];//creating array of class object
			// adding elements to CompareTo
			for(i=0;i<n;i++)
			{
				name=sc.next();
				age=sc.nextInt();
				emp[i]=new Comparator_Employee();
				emp[i].setAge(age);
				emp[i].setName(name);
				list.add(i,emp[i]);
			}
			System.out.println("Name wise Comparison");
			Collections.sort(list,new NameComparator());
			for(Comparator_Employee e:list)
			{
			  System.out.println(e.getName()+" "+e.getAge());
			}
			System.out.println("Age wise Comparison");
			Collections.sort(list,new AgeComparator());
			for(Comparator_Employee e:list)
			{
				System.out.println(e.getName()+" "+e.getAge());
			}
			   sc.close();
			}

		}

	class AgeComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Comparator_Employee e1=(Comparator_Employee)o1;
			Comparator_Employee e2=(Comparator_Employee)o2;
			if(e1.getAge()==e2.getAge())
			{
				return 0;
			}
			else if(e1.getAge()>e2.getAge())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
	class NameComparator implements Comparator<Comparator_Employee>
	{
		public int compare(Comparator_Employee o1,Comparator_Employee o2)
		{
			Comparator_Employee e1=(Comparator_Employee)o1;
			Comparator_Employee e2=(Comparator_Employee)o2;
			return e1.getName().compareTo(e2.getName());
		}
	}



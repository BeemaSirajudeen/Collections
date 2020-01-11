package set;

public class Employee implements Comparable<Employee>
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
		@Override
		public int compareTo(Employee o) 
		{
			return 1;
		}
}
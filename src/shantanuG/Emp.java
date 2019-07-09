package shantanuG;

public class Emp {
	
	String name;
	int deptId;
	float sal;
	Emp(String name, int deptId, float sal)
	{
		this.name=name;
		this.deptId=deptId;
		this.sal=sal;
	}
	
	static void compareEmpSalary(Emp e1,Emp e2)
	{
		if(e1.sal>e2.sal)
		{
			System.out.println(e1.name);
			System.out.println(e1.deptId);
			System.out.println(e1.sal);
		}
		else if(e2.sal>e1.sal)
		{
			System.out.println(e2.name);
			System.out.println(e2.deptId);
			System.out.println(e2.sal);
		}
		else
		{
			System.out.println("Both employees draw equal salary");
		}
		
	}
	
	public static void main(String[] args) {
		
		Emp e1=new Emp("Shantanu",25,25000);
		Emp e2=new Emp("Shailesh",28,35000);
		
		compareEmpSalary(e1,e2);
	}

}

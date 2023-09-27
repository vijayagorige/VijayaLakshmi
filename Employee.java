package miniProject2;
abstract public class Employee 
{
	private String name;
	public double baseSalary;
	private int empid;
	private static int idcount;
	public double bonus;
	public Employee manager;
	public Accountant accountantSupport;
	public double bonusBudget;
	abstract public String employeeStatus();
	public Employee(String name,double baseSalary)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		idcount++;
		this.empid=idcount;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	public String getName()
	{
		return name;
	}
	public int getEmployeeID()
	{
		return this.empid;
	}
	public Employee getManager()
	{
		return manager;
	}
	public void setManager(Employee manager)
	{
		this.manager=manager;
	}
	 public Accountant getAccountantSupport()
	 {
	        return accountantSupport;
     }
	public boolean equals(Employee other)
	{
		if(this.getEmployeeID()==other.getEmployeeID())
			return true;
		else
			return false;
	}
	public String toString()
	{
		return this.getEmployeeID()+" "+this.getName();
	}
	
}

package miniProject2;
public class BusinessEmployee extends Employee
{
	public double bonusBudget;
	public BusinessEmployee(String name)
	{
		super(name,50000);
		this.bonusBudget=0;
	}
	public double getBonusBudget()
	{
		return bonusBudget;
	}
	public void setBonusBudget(double bonusBudget) 
	{
        this.bonusBudget = bonusBudget;
    }
	public String employeeStatus() 
	{
        return this.getEmployeeID()+" "+this.getName()+" with a budget of "+this.bonusBudget;
    }
}

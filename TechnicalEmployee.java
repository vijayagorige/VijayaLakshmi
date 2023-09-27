package miniProject2;
public class TechnicalEmployee extends Employee 
{
	public int checkIns;
	public TechnicalEmployee(String name)
	{
		super(name,75000);
		this.checkIns = 0;
	}
	 public void setCheckin()
	 {
		 checkIns++;
	 }
	public String employeeStatus()
	{
		return this.getEmployeeID()+" "+this.getName()+" has "+this.checkIns+" successful checkIns";
	}
}

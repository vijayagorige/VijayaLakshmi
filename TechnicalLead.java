package miniProject2;
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee
{
	private ArrayList<SoftwareEngineer> team=new ArrayList<SoftwareEngineer>();
    public int headCount;
    public TechnicalLead(String name)
    {
        super(name);
        this.headCount = 4;
    }
    public boolean hasHeadCount()
    {
         if(team.size() < this.headCount)
        	 return true;
         else
        	 return false;
    }
    public boolean addReport(SoftwareEngineer e)
    {
        if (hasHeadCount())
        {
            team.add(e);
            e.setManager(this);
            return true;
        }
        else
        	return false;
    }
    public boolean approveCheckIn(SoftwareEngineer e) 
    {
    	if(e.getManager().equals(this) && e.getCodeAccess())
    		return true;
    	else
    		return false;
    }
    public boolean requestBonus(Employee e, double bonus) 
    {
        BusinessLead manager = (BusinessLead)getAccountantSupport().getManager();
        if (manager.requestBonus(e, bonus))
        	return true;
        else
        	return false;
    }
    public String getTeamStatus() 
    {
    	 if (team.size()==0)
    	 {
             return this.employeeStatus()+ " and no direct reports yet";
         } 
    	 else 
    	 {
             String teamStatus="";
             for (int i=0;i<team.size();i++)
             {
                 teamStatus+=(team.get(i).employeeStatus()+"\n");
             }
         return this.employeeStatus()+" and is managing: \n"+teamStatus;
         }
    }
    public ArrayList<SoftwareEngineer> getTeam()
    {
        return team;
    }
}

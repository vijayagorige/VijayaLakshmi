package miniProject2;
public class Details
{
	public static void main(String[] args) 
	{
		TechnicalLead t1 = new TechnicalLead("Koushik");
        SoftwareEngineer se1 = new SoftwareEngineer("Kasey");
        SoftwareEngineer se2 = new SoftwareEngineer("Govind");
        SoftwareEngineer se3 = new SoftwareEngineer("Swapna");
        t1.addReport(se1);
        se1.checkInCode();
        se1.checkInCode();
        t1.addReport(se2);
        t1.addReport(se3);
        se3.checkInCode();
        se3.checkInCode();
        System.out.println("TechnicalLead Team-1 Status:");
        System.out.println(t1.getTeamStatus());
        TechnicalLead t2 = new TechnicalLead("Rahul");
        SoftwareEngineer se4 = new SoftwareEngineer("Vinod");
        SoftwareEngineer se5 = new SoftwareEngineer("Shyam");
        SoftwareEngineer se6 = new SoftwareEngineer("Sundar");
        SoftwareEngineer se7 = new SoftwareEngineer("Keerthana");
        t2.addReport(se4);
        t2.addReport(se5);
        t2.addReport(se6);
        t2.addReport(se7);
        se4.checkInCode();
        se6.checkInCode();
        se6.checkInCode();
        se6.checkInCode();
        se6.checkInCode();   
        System.out.println("TechnicalLead Team-2 Status:");
        System.out.println(t2.getTeamStatus());
        BusinessLead b = new BusinessLead("Tom");
        Accountant ac1 = new Accountant("Robert");
        Accountant ac2 = new Accountant("Jhon");
        b.addReport(ac1,t1);
        b.addReport(ac2,t2);
        System.out.println("BusinessLead Team Status:");
        System.out.println(b.getTeamStatus());
        System.out.println("Employee manager name:");
        System.out.println(se2.toString() + "'s manager is " + se2.getManager().toString());
        System.out.println(se6.toString() + "'s manager is " + se6.getManager().toString());
        System.out.println(ac2.toString() + "'s manager is " + ac2.getManager().toString());
        System.out.println();
        System.out.println("Testing BusinessLead approvedBonus method");
        System.out.print(se1.getManager() + " is asking for $10,000 bonus for "+se1.getName()+", (the Approval result should be TRUE): ");
        System.out.println(t1.requestBonus(se1, 10000));
        System.out.println("Updated budget is: \n"+se1.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.print(se6.getManager() + " is asking for $5,000 bonus for "+se6.getName() +", (the Approval result should be TRUE): ");
        System.out.println(t2.requestBonus(se6, 5000));
        System.out.println("Updated budget is: \n"+se6.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.print(se6.getManager() + " is asking for $400,000 bonus  for "+se6.getName()+", (the Approval result should be FALSE): ");
        System.out.println(t2.requestBonus(se6, 400000));
        System.out.println("Updated budget is: \n"+se6.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.println();
	}

}

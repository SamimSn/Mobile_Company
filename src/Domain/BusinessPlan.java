package Domain;

public class BusinessPlan extends MobilePlan 
{

    private int numberOfEmployees;
    private int ABN;

    public BusinessPlan(int numberOfEmployees, int ABN, String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate)
    {
        super(userName, id, handset, internetQuota, capLimit, expiryDate);
        this.numberOfEmployees = numberOfEmployees;
        this.ABN = ABN;
    }

    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public int getABN()
    {
        return ABN;
    }

    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public void setABN(int ABN)
    {
        this.ABN = ABN;
    }

    public void print()
    {
        super.print();
        System.out.print(" employee count: " + numberOfEmployees + " ABN: " + ABN);
    }

    @Override
    public String toString() 
    {
        return super.toString() + " - employee count: " + numberOfEmployees + " - ABN: " + ABN;
    }

    @Override
    public double calcPayment(double flatRate) 
    {
        double payment = (handSet.getPrice() / 24) +( capLimit / 10 )+ (internetQuota * 10) + (flatRate);
        if (numberOfEmployees > 10) 
        {
            payment += (numberOfEmployees - 10) * 50;
        }
        return payment;
    }

    //lab4

    BusinessPlan(BusinessPlan businessPlan) // copy constructor
    { 
        super(businessPlan);
        numberOfEmployees = businessPlan.numberOfEmployees;
        ABN = businessPlan.ABN;
    }

    public BusinessPlan clone() throws CloneNotSupportedException // clone()
    { 
        BusinessPlan result = (BusinessPlan) super.clone();
        result.numberOfEmployees = numberOfEmployees;
        result.ABN = ABN;
        return result;
    }

    //lab6

    public String toDilimatedString()
    {
        return "BP," + super.toDilimatedString() + "," + numberOfEmployees + "," + ABN;
    }

}

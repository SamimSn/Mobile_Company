package Domain;

public class PersonalPlan extends MobilePlan {

    private String city;

    public PersonalPlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate, String city) 
    {
        super(userName, id, handset, internetQuota, capLimit, expiryDate);
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setCapLimit(int capLimit)
    {
        this.capLimit = capLimit;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.print(" city: " + city);
    }

    @Override
    public String toString() 
    {
        return super.toString() + " - city: " + city;
    }

    @Override
    public double calcPayment(double flatRate) 
    {
        return (handSet.getPrice() / 24) + (capLimit / 20) + (internetQuota * 5) + (flatRate);
    }

    // lab4

    public PersonalPlan(PersonalPlan personalPlan) // copy constructor
    { 
        super(personalPlan);
        this.city = personalPlan.city;
    }

    public PersonalPlan clone() throws CloneNotSupportedException  // clone()
    {
        PersonalPlan result = (PersonalPlan) super.clone();
        result.city = city;
        return result;
    }

    //lab6

    public String toDilimatedString()
    {
        return "PP," + super.toDilimatedString() + "," + city;
    }

    
}
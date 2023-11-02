package Domain;

public class MyException extends Exception 
{    
//    int amount;
//
//    public MyException(int amount)
//    {
//        this.amount = amount;
//    }
//
//    public MyException(double amount)
//    {
//        this.amount = (int) amount;
//    }
    
    public MyException()
    {
        
    }
    
    @Override
    public String toString()
    {
//        return "----Please Enter a Positive number! Increase atleast <" + (-amount) + ">" ;
        return "Enter a positive number please.";
    }
}

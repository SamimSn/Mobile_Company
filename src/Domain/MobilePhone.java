package Domain;

import java.io.Serializable;

public class MobilePhone implements Cloneable, Serializable
{

    private String model;
    private MobileType type;
    private int memorySize;
    private double price;

    public MobilePhone(String model, MobileType type, int memorySize, double price) 
    {
        this.model = model;
        this.type = type;
        this.memorySize = memorySize;
        this.price = price;
    }

    public String getModel() 
    {
        return model;
    }

    public MobileType getType() 
    {
        return type;
    }

    public int getMemorySize() 
    {
        return memorySize;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public void print() 
    {
        System.out.print("model: " + model + " - type: " + type + " - memory size: " + memorySize + " - price: " + price);
    }

    @Override
    public String toString() 
    {
        return "model: " + model + " - type: " + type + " - memory size: " + memorySize + " - price: " + price;
    }

    public void priceRise(double rise) 
    {
        price += (rise * price);
    }

    //lab4

    public MobilePhone(MobilePhone mobilePhone) // copy constructor
    { 
        model = mobilePhone.model;
        type = mobilePhone.type;
        memorySize = mobilePhone.memorySize;
        price = mobilePhone.price;
    }

    public MobilePhone clone() throws CloneNotSupportedException
    { // clone()
        return (MobilePhone) super.clone();
    }

    //lab6

    public String toDilimatedString()
    {
        return model + "," + type + "," + memorySize + "," + price;
    }

}
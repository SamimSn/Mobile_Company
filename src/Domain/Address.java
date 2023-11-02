package Domain;

import java.io.Serializable;

public class Address implements Cloneable, Comparable<Address>, Serializable
{

    private int streetNum;
    private String street;
    private String suburb;
    private String city;

    public Address(int streetNum, String street, String suburb, String city)
    {
        this.streetNum = streetNum;
        this.street = street;
        this.suburb = suburb;
        this.city = city;
    }

    public int getStreetNum() 
    {
        return streetNum;
    }

    public String getStreet()
    {
        return street;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getCity()
    {
        return city;
    }

    public void setStreetNum(int streetNum) 
    {
        this.streetNum = streetNum;
    }
    
    public void setStreet(String street) 
    {
        this.street = street;
    }
    
    public void setSuburb(String suburb) 
    {
        this.suburb = suburb;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }

    public void print()
    {
        System.out.print("city: " + city + " suburb: " + suburb + " street: " + street + " street number: " + streetNum);
    }

    @Override
    public String toString()
    {
        return "city: " + city + " suburb: " + suburb + " street: " + street + " street number: " + streetNum;
    }

    //lab4

    public Address(Address address)
    {
        streetNum = address.streetNum;
        street = address.street;
        suburb = address.suburb;
        city = address.city;
    }

    public Address clone() throws CloneNotSupportedException
    {
        return (Address) super.clone();
    }

    @Override
    public int compareTo(Address other) // compare by city name
    { 
        return city.compareTo(other.city);
    }

    //lab6

    public String toDilimatedString()
    {
        return city + "," + suburb + "," + street + "," + streetNum;
    }
}

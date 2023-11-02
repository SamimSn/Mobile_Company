package Domain;

import java.io.Serializable;

public class MyDate implements Cloneable, Comparable<MyDate>, Serializable 
{

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) 
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() 
    {
        return year;
    }

    public int getMonth() 
    {
        return month;
    }

    public int getDay() 
    {
        return day;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public void setMonth(int month) 
    {
        this.month = month;
    }

    public void setDay(int day) 
    {
        this.day = day;
    }

    public void print() 
    {
        System.out.print(day + "/" + month + "/" + year);
    }

    @Override
    public String toString() 
    {
        return day + "/" + month + "/" + year;
    }

    public boolean isExpired(MyDate expiryDate) 
    {
        if (year < expiryDate.year) 
        {
            return false;
        } 
        else if (year == expiryDate.year) 
        {
            if (month < expiryDate.month) 
            {
                return false;
            } 
            else if (month == expiryDate.month) 
            {
                if (day < expiryDate.day) 
                {
                    return false;
                } 
                else if (day == expiryDate.day) 
                {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean isValid() 
    {
        if ((1900 <= year && year <= 2060) && (1 <= month && month <= 12) && (1 <= day && day <= 30)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    // lab4

    public MyDate(MyDate myDate) // copy constructor
    { 
        year = myDate.year;
        month = myDate.month;
        day = myDate.day;
    }

    public MyDate clone() throws CloneNotSupportedException // clone()
    { 
        return (MyDate) super.clone();
    }

    @Override
    public int compareTo(MyDate other) // compare by date
    { 
        if(year == other.year && month == other.month && day == other.day)
        {
            return 0;
        }
        if(isExpired(other))
        {
            return 1;
        }
        else
        {
            return -1;
        } 
    }

    //lab6

    public String toDelimitedString() 
    {
        return day + "," + month + "," + year;
    }
}

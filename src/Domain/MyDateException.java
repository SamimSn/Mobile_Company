package Domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samim
 */
public class MyDateException extends Exception 
{
    
    MyDate date;
    
    public MyDateException (MyDate date)
    {
        this.date = date;
    }
    
    @Override
    public String toString()
    {
        return date + "  is invalid.";
    }
}

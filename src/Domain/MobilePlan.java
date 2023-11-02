package Domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public abstract class MobilePlan implements Cloneable, Comparable<MobilePlan>, Serializable
{

    protected String userName;
    protected int id;
    protected MobilePhone handSet;
    protected int internetQuota;
    protected int capLimit;
    protected MyDate expiryDate;

        
    public MobilePlan(String userName, int id, MobilePhone handSet, int internetQuota, int capLimit, MyDate expiryDate)
    {
        try
        {
            if(!isValidUserName(userName))
            {
                throw new PlanUserNameException(userName);
            }
            this.userName = userName;
        }
        catch (PlanUserNameException e)
        {
//            UI
//            System.out.println(e);
//            GUI
            JOptionPane.showMessageDialog(null, e);
            this.userName = e.getUserName();
        }
        try
        {
            if(!isValidID(id))
            {
                throw new PlanException(id);
            }
            this.id = id;
        }
        catch (PlanException e) //---------------------------------
        {
//            UI
//            System.out.println(e);
//            GUI
            JOptionPane.showMessageDialog(null, e); 
            this.id = e.getID();
        } 
        this.handSet = handSet;
        this.internetQuota = internetQuota;
        this.capLimit = capLimit;
        this.expiryDate = expiryDate;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getId()
    {
        return id;
    }

    public MobilePhone getHandset()
    {
        return handSet;
    }

    public int getInternetQuota()
    {
        return internetQuota;
    }

    public int getCapLimit()
    {
        return capLimit;
    }

    public MyDate getExpiryDate()
    {
        return expiryDate;
    }

    public String getModel()
    {
        return handSet.getModel();
    }

    public int getYear()
    {
        return expiryDate.getYear();
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setMobileModel(String model)
    {
        this.handSet.setModel(model);
    }

    public void setExpiryDate(MyDate expiryDate)
    {
        this.expiryDate = expiryDate;
    }
    
    public void setHandSet(MobilePhone handSet)
    {
        this.handSet = handSet;
    }
    
    public void setInternetQuota(int internetQuota)
    {
        this.internetQuota = internetQuota;
    }
    
    public void setCapLimit(int capLimit)
    {
        this.capLimit = capLimit;
    }

    public void print()
    {
        System.out.print("username: " + userName + " - id: " + id + " - internet quota: " + internetQuota + " - cap limit: " + capLimit + " - expiry date: " + expiryDate + " - hand set: (");
        handSet.print();
        System.out.print(")");
    }

    public void print(int flatRate)
    {
        print();
        System.out.print(" - Monthly Payment: " + calcPayment(flatRate));
    }

    @Override
    public String toString()
    {
        return "username: " + userName + " - id: " + id + " - internet Quota: " + internetQuota + " - cap limit: " + capLimit + " - expiry date: " + expiryDate + " - hand set: (" + handSet + ")";
    }

    public abstract double calcPayment(double flatRate);

    public static void printPlans(ArrayList<MobilePlan> plans)
    {
        // System.out.println();
        // for (MobilePlan pln : plans)
        // {
        //     System.out.print("--");
        //     pln.print();
        //     System.out.println();
        // }
        plans.forEach
        (
            x -> 
            {
                System.out.print("--");
                System.out.println(x);
            }        
        );
    }

    public static void printPlans(ArrayList<MobilePlan> plans, int flatRate)
    {
        // System.out.println();
        // for (MobilePlan pln : plans)
        // {
        //     System.out.print("--");
        //     pln.print();
        //     System.out.printf(" calculation payement: %.2f $", pln.calcPayment(flatRate));
        //     System.out.println();
        // }
        plans.forEach
        (
            x ->
            {
                System.out.print("--");
                System.out.println(x);
                System.out.printf(" calculation payement: %.2f $\n", x.calcPayment(flatRate));
            }
        );
    }

    public static double calcTotalPayments(ArrayList<MobilePlan> plans, int flatRate)
    {
        // double total = 0;
        // for (MobilePlan pln : plans)
        // {
        //     total += pln.calcPayment(flatRate);
        // }
        // return total;
        return plans.stream().map(x -> x.calcPayment(flatRate)).reduce(0.0, (x,y) -> x+y);
    }

    public void mobilePriceRise(double risePercent)
    {
        handSet.priceRise(risePercent);
    }

    public static void mobilePriceRiseAll(ArrayList<MobilePlan> plans, double risePercent)
    {
        // for (MobilePlan pln : plans)
        // {
        //     pln.mobilePriceRise(risePercent);
        // }
        plans.stream().forEach(x -> x.mobilePriceRise(risePercent));
    }

    public static ArrayList<MobilePlan> filterByMobileModel(ArrayList<MobilePlan> plans, String mobileModel)
    {
        // ArrayList<MobilePlan> filteredPlans = new ArrayList<>();
        // for (MobilePlan pln : plans) 
        // {
        //     if (pln.handSet.getModel().contains(mobileModel))
        //     {
        //         filteredPlans.add(pln);
        //     }
        // }
        // return filteredPlans;
        return (ArrayList<MobilePlan>) plans.stream().filter(x -> x.handSet.getModel().contains(mobileModel)).collect(Collectors.toList());
    }

    public static ArrayList<MobilePlan> filterByExpiryDate(ArrayList<MobilePlan> plans, MyDate date) 
    {
        // ArrayList<MobilePlan> filteredPlans = new ArrayList<>();
        // for (MobilePlan pln : plans) 
        // {
        //     if (!pln.expiryDate.isExpired(date)) 
        //     {
        //         filteredPlans.add(pln);
        //     }
        // }
        // return filteredPlans;
        return (ArrayList<MobilePlan>) plans.stream().filter(x -> (x.expiryDate.isExpired(date))).collect(Collectors.toList());
    }

    // lab4

    public MobilePlan(MobilePlan mobilePlan)  // copy constructor
    {
        userName = mobilePlan.userName;
        id = mobilePlan.id;
        handSet = new MobilePhone(mobilePlan.handSet);
        internetQuota = mobilePlan.internetQuota;
        capLimit = mobilePlan.capLimit;
        expiryDate = new MyDate(mobilePlan.expiryDate);
    }

    public MobilePlan clone() throws CloneNotSupportedException  // clone()
    {
        MobilePlan output = (MobilePlan) super.clone();
        output.handSet = handSet.clone();
        output.expiryDate = expiryDate.clone();
        return output;
    }

    public static ArrayList<MobilePlan> shallowCopy(ArrayList<MobilePlan> plans)
    {
        ArrayList<MobilePlan> result = new ArrayList<>();
        // for (MobilePlan plan : plans)
        // {
        //     result.add(plan);
        // }
        // return result;
        plans.stream().forEach(result::add);
        return result;
    }

    public static ArrayList<MobilePlan> deepCopy(ArrayList<MobilePlan> plans) throws CloneNotSupportedException
    {
        // ArrayList<MobilePlan> result = new ArrayList<>();
        // for (MobilePlan plan : plans)
        // {
        //     result.add(plan.clone());
        // }        
        // return result;
        return plans.stream().collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public int compareTo(MobilePlan other) // compare by date
    { 
        return expiryDate.compareTo(other.expiryDate);
    }

    // lab5

    public static void printPlans(HashMap<Integer, MobilePlan> plans)
    {
        // System.out.println();
        // for (MobilePlan pln : plans.values())
        // {
        //     System.out.print("--");
        //     pln.print();
        //     System.out.println();
        // }
        plans.values().forEach
        (
            x -> 
            {
                System.out.print("--");
                System.out.println(x);
            }        
        );
    }

    public static void printPlans(HashMap<Integer, MobilePlan> plans, int flatRate) 
    {
        // System.out.println();
        // for (MobilePlan pln : plans.values()) 
        // {
        //     System.out.print("--");
        //     pln.print();
        //     System.out.printf(" calculation payement: %.2f $", pln.calcPayment(flatRate));
        //     System.out.println();
        // }
        plans.values().forEach
        (
            x ->
            {
                System.out.print("--");
                System.out.println(x);
                System.out.printf(" calculation payement: %.2f $\n", x.calcPayment(flatRate));
            }
        );
    }

    public static double calcTotalPayments(HashMap<Integer, MobilePlan> plans, int flatRate) 
    {
        // double total = 0;
        // for (MobilePlan pln : plans.values()) 
        // {
        //     total += pln.calcPayment(flatRate);
        // }
        // return total;
        return plans.values().stream().map(x -> x.calcPayment(flatRate)).reduce(0.0, (x,y) -> x+y);
    }

    public static void mobilePriceRiseAll(HashMap<Integer, MobilePlan> plans, double risePercent) 
    {
        // for (MobilePlan pln : plans.values()) 
        // {
        //     pln.mobilePriceRise(risePercent);
        // }
        plans.values().stream().forEach(x -> x.mobilePriceRise(risePercent));
    }

    public static ArrayList<MobilePlan> filterByMobileModel(HashMap<Integer, MobilePlan> plans, String mobileModel) 
    {
        // ArrayList<MobilePlan> filteredPlans = new ArrayList<>();
        // for (MobilePlan pln : plans.values()) 
        // {
        //     if (pln.handSet.getModel().contains(mobileModel)) 
        //     {
        //         filteredPlans.add(pln);
        //     }
        // }
        // return filteredPlans;
        return (ArrayList<MobilePlan>) plans.values().stream().filter(x -> x.handSet.getModel().contains(mobileModel)).collect(Collectors.toList());
    }

    public static ArrayList<MobilePlan> filterByExpiryDate(HashMap<Integer, MobilePlan> plans, MyDate date) 
    {
        // ArrayList<MobilePlan> filteredPlans = new ArrayList<>();
        // for (MobilePlan pln : plans.values()) 
        // {
        //     if (!pln.expiryDate.isExpired(date)) 
        //     {
        //         filteredPlans.add(pln);
        //     }
        // }
        // return filteredPlans;
        return (ArrayList<MobilePlan>) plans.values().stream().filter(x -> (x.expiryDate.isExpired(date))).collect(Collectors.toList());
    }

    public static ArrayList<MobilePlan> shallowCopy(HashMap<Integer, MobilePlan> plans) 
    {
        ArrayList<MobilePlan> result = new ArrayList<>();
        // for(MobilePlan plan : plans.values())
        // {
        //     result.add(plan);
        // }
        plans.values().stream().forEach(result::add);
        return result;
        // return shallowCopy((ArrayList<MobilePlan>) plans.values());
    }

    public static ArrayList<MobilePlan> deepCopy(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    {
        // ArrayList<MobilePlan> result = new ArrayList<>();
        // for(MobilePlan plan : plans.values())
        // {
        //     result.add(plan.clone());
        // }
        // return result;
        return (ArrayList<MobilePlan>) plans.values().stream().collect(Collectors.toCollection(ArrayList::new));        
        // return deepCopy((ArrayList<MobilePlan>) plans.values());
    }

    public static HashMap<Integer, MobilePlan> shallowCopyHashMap(HashMap<Integer, MobilePlan> plans) 
    {
        HashMap<Integer, MobilePlan> result = new HashMap<Integer, MobilePlan>();
        // for(MobilePlan plan : plans.values())
        // {
        //     result.put(plan.getId(),plan);
        // }
        plans.values().stream().forEach
        (
            x ->
            {
                result.put(x.getId(), x);
            }
        );
        return result;
    }

    public static HashMap<Integer, MobilePlan> deepCopyHashMap(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    {
        // HashMap<Integer, MobilePlan> result = new HashMap<Integer, MobilePlan>();
        // for(MobilePlan plan : plans.values())
        // {
        //     result.put(plan.getId(), plan.clone());
        // }
        // return result;
        return plans.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue(),(x, y) -> x, HashMap::new)); // ????
    }

    public boolean isValidID(int ID)
    {
        if(300000 <= ID && ID <= 399999)
        {
            return true;
        }
        return false;
    }
    
    // lab6

    public static HashMap<Integer, MobilePlan> load(String fileName)
    {
        HashMap<Integer, MobilePlan> plans = new HashMap<Integer, MobilePlan>();
        ObjectInputStream inputst = null;
        try
        {
            inputst = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));           
        }
        catch(IOException ex)
        {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try
        {
           while(true)
            {
              MobilePlan plan = (MobilePlan) inputst.readObject();
              plans.put(plan.getId() ,plan);
            }
        }
        catch(EOFException ex)
        {
            System.out.println("no more record!");
        }
        catch (ClassNotFoundException ex) 
        {
            System.err.println("error in wrong class in the file ");
        } 
        catch(IOException ex)
        {
            System.err.println("error in add object to the file ");
            System.exit(1);
        }
        try
        {
            if(inputst !=null)
            {
                inputst.close();           
            }
            
        }
        catch(IOException ex)
        {
            System.err.println("error in close the file ");
            System.exit(1);
        }
        return plans;
    }

    public static boolean save(HashMap<Integer, MobilePlan> plans, String fileName)
    {
        ObjectOutputStream outputst = null;
        
        try
        {
            outputst = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));           
        }
        catch(IOException ex)
        {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try
        {
            for (MobilePlan plan : plans.values())
            {
                outputst.writeObject(plan);
            }
        }
        catch(IOException ex)
        {
            System.err.println("error in adding the objects to the file ");
            System.exit(1);
        } 
        try
        {
            if(outputst !=null)
            {
                outputst.close();           
            }
            
        }
        catch(IOException ex)
        {
            System.err.println("error in closing the file ");
            System.exit(1);
        }
        return true;
    }

    public String toDilimatedString()
    {
        return userName + "," + id + "," + internetQuota + "," + capLimit + "," + expiryDate.toDelimitedString() + "," + handSet.toDilimatedString();    
    }

    public static HashMap<Integer, MobilePlan> loadTextFile(String fileName) 
    {
        HashMap<Integer, MobilePlan> loads = new HashMap<Integer, MobilePlan>();
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
        }
        catch (IOException e)
        {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        String line = null;
        try
        {
            line = reader.readLine();
        }
        catch (IOException e)
        {
            System.err.println("error in adding the objects from the file ");
            System.exit(1);
        }
        while (line != null) 
        {
            line = line.trim();
            String[] fields = line.split(",");

            String userName = fields[1];
            int id = Integer.parseInt(fields[2]);
            int internetQuota = Integer.parseInt(fields[3]);
            int capLimit = Integer.parseInt(fields[4]);
            int day = Integer.parseInt(fields[5]);
            int month = Integer.parseInt(fields[6]);
            int year = Integer.parseInt(fields[7]);
            String model = fields[8];
            String type = fields[9];
            MobileType typeEnum = null;
            if (type.equalsIgnoreCase("ANDROID")) 
            {
                typeEnum = MobileType.Android;
            } 
            else if (type.equalsIgnoreCase("IOS")) 
            {
                typeEnum = MobileType.IOS;
            } 
            else if (type.equalsIgnoreCase("WINDOWS")) 
            {
                typeEnum = MobileType.Windows;
            }
            int memorySize = Integer.parseInt(fields[10]);
            double price = Double.parseDouble(fields[11]);

            switch (fields[0]) 
            {
                case "PP":
                    
                    String city = fields[12];
                    PersonalPlan plan = new PersonalPlan(userName, id, new MobilePhone(model, typeEnum, memorySize, price), internetQuota, capLimit, new MyDate(year, month, day), city);
                    loads.put(plan.getId(), plan);
                    break;

                case "BP":
                
                    int numberOfEmployees = Integer.parseInt(fields[12]);
                    int ABN = Integer.parseInt(fields[13]);
                    BusinessPlan planBp = new BusinessPlan(numberOfEmployees, ABN, userName, id, new MobilePhone(model, typeEnum, memorySize, price), internetQuota, capLimit, new MyDate(year, month, day));
                    loads.put(planBp.getId(), planBp);
                    break;
            }
            try
            {
                line = reader.readLine();
            }
            catch (IOException e)
            {
                System.err.println("error in adding the objects from the file ");
                System.exit(1);
            }        
        }
        try
        {
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error in closing the file");
            System.exit(1);
        }
        return loads;
    }

    public static Boolean saveTextFile(HashMap<Integer, MobilePlan> saves, String fileName)
    {
        BufferedWriter writer = null;
        try 
        {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (MobilePlan plan : saves.values()) 
            {
                writer.write(plan.toDilimatedString() + "\n");
            }
            writer.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error in reading file");
            return false;
        }
        return true;
    }

    public boolean isValidUserName(String userName)
    {
        if(Pattern.matches("USR[0-9]{6}U", userName))
        {
           return true; 
        }
        return false;
    }
    
    // -------static inner class
    // not in design
    static class Comparing implements Comparator<MobilePlan>
    {
        @Override
        public int compare(MobilePlan o1, MobilePlan o2) {
            int object1 = Integer.parseInt(o1.getUserName().substring(3, 9));
            int object2 = Integer.parseInt(o2.getUserName().substring(3, 9));
            return object1 - object2;
        }
    }            
    
    public static void sortByUsername(ArrayList<MobilePlan> plans)
    {
        Collections.sort(plans, new Comparing());
    }
    // not in design
    // -------static inner class
}

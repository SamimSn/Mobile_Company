package Domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class User implements Cloneable, Comparable<User>, Serializable
{

    private String name;
    private String password;
    private int userID;
    private Address address;
    // private ArrayList<MobilePlan> plans;
    private HashMap<Integer, MobilePlan> plans;
    private static int count = 100; // base ID

    public User(String name, Address address, String password) // Auto ID
    {
        this.name = name;
        this.userID = id();
        this.address = address;
        this.password = password;
        // this.plans = new ArrayList<>();
        this.plans = new HashMap<Integer, MobilePlan>();
    }

    public User(String name, int userID, String password, Address address) // Including ID --> fileHandeling
    {
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.address = address;
        this.plans = new HashMap<Integer, MobilePlan>();
    }

    public String getPassword() 
    {
        return password;
    }

    public int getStreetNum() 
    {
        return address.getStreetNum();
    }
    
    public String getStreet() 
    {
        return address.getStreet();
    }
    
    public String getSuburb() 
    {
        return address.getSuburb();
    }
    
    public String getCity() 
    {
        return address.getCity();
    }
    
    public String getName() 
    {
        return name;
    }

    public Address getAddress() 
    {
        return address;
    }

    public int getUserID() 
    {
        return userID;
    }

    public HashMap<Integer, MobilePlan> getPlans() 
    {
        return plans;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void setAddress(Address address) 
    {
        this.address = address;
    }
    
    public void setStreetNum(int streetNum) 
    {
        this.address.setStreetNum(streetNum);
    }
    
    public void setStreet(String street) 
    {
        this.address.setStreet(street);
    }
    
    public void setSuburb(String suburb) 
    {
        this.address.setSuburb(suburb);
    }
     
    public void setCity(String city) 
    {
        this.address.setCity(city);
    }

    public int id() 
    {
        return count++;
    }

    public boolean addPlan(int userID, String password, MobilePlan plan) 
    {
        if(validateUser(userID, password))
        {
            if (findPlan(plan.getId()) == null) 
            {
                // plans.add(plan);
                plans.put(plan.getId(), plan);
                return true;
            }
            return false;
        }
        else
        {
            return false;
        }
            
    }

    public MobilePlan findPlan(int planID) 
    {
        // for (MobilePlan pln : plans) {
        //     if (pln.getId() == planID) {
        //         return pln;
        //     }
        // }
        // return null;
        return plans.get(planID);
    }

    public void printUserInformation(int id, String pass) 
    {
        if(validateUser(id, pass))
        {
            System.out.print("user id: " + userID + " - name: " + name + " - address: (");
            address.print();
            System.out.print(")");
        }
    }

    public void print(int id, String pass) 
    {
        if(validateUser(id, pass))
        {
            printUserInformation(id, pass);
            System.out.print(" ----- plans:");
            printPlans(id, pass);
        }
    }

    public void print(int id, String pass, int flatRate) 
    {
        if(validateUser(id, pass))
        {
            printUserInformation(id, pass);
            System.out.print(" ----- plans:");
            printPlans(id, pass, flatRate);
        }
    }

    @Override
    public String toString()
    {
        String result = "userID: " + userID + " - name: " + name + " - address: (" + address + ") ----- plans:";
        // for (MobilePlan pln : plans) {
        for(MobilePlan pln : plans.values())
        {
            result += "\n--" + pln;
        }
        return result;
    }

    public void printPlans(int userID, String password, int flatRate) 
    {
        if(validateUser(userID, password))
        {
            MobilePlan.printPlans(plans, flatRate);
        }
    }

    public void printPlans(int userID, String password) 
    {
        if(validateUser(userID, password))
        {
            MobilePlan.printPlans(plans);
        }
    }

    public double calcTotalPayments(int userID, String password, int flatRate) 
    {
        if(validateUser(userID, password))
        {
            return MobilePlan.calcTotalPayments(plans, flatRate);
        }
        return 0;
    }

    public void mobilePriceRiseAll(int userID, String password, double risePercent) 
    {
        if(validateUser(userID, password))
        {
            MobilePlan.mobilePriceRiseAll(plans, risePercent);
        }
    }

    public ArrayList<MobilePlan> filterByMobileModel(int userID, String password, String mobileModel) 
    {
        if(validateUser(userID, password))
        {
            return MobilePlan.filterByMobileModel(plans, mobileModel);    
        }
        return new ArrayList<MobilePlan>();
    }

    public ArrayList<MobilePlan> filterByExpiryDate(int userID, String password, MyDate date) 
    {
        if(validateUser(userID, password))
        {
            return MobilePlan.filterByExpiryDate(plans, date);    
        }
        return new ArrayList<MobilePlan>();
    }

    public boolean createPersonalPlan(int userID, String password, String username, int id, MobilePhone mobilePhone, int internetQuota, int capLimit, MyDate expiryDate, String city) 
    {
        if(validateUser(userID, password))
        {
            return addPlan(userID, password, new PersonalPlan(username, id, mobilePhone, internetQuota, capLimit, expiryDate, city));
        }
        return false;
    }

    public boolean createBusinessPlan(int userID, String password, String username, int id, MobilePhone mobilePhone, int internetQuota, int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN) 
    {
        if(validateUser(userID, password))
        {
            return addPlan(userID, password, new BusinessPlan(numberOfEmployees, ABN, username, id, mobilePhone, internetQuota, capLimit, expiryDate));    
        }
        return false;
    }

    public boolean validateUser(int userID, String password) 
    {
        if (userID == this.userID && password.equals(this.password)) 
        {
            return true;
        }
        return false;
    }

    public boolean removePlan(int userID, String password, int planID) 
    {
        if(validateUser(userID, password))
        {
            MobilePlan mobilePlan = findPlan(planID);
            if (mobilePlan != null) 
            {
                plans.remove(planID);
                return true;
            } 
            else 
            {
                return false;
            }
        }
        return false;
    }

    public ArrayList<String> populateDistinctMobileModels(int userID, String password) 
    {
        if(validateUser(userID, password))
        {
//            ArrayList<String> models = new ArrayList<>();
//            // for (MobilePlan plan : plans) {
//            for(MobilePlan plan : plans.values())
//            {
//                boolean isFound = false;
//                for (String model : models) 
//                {
//                    if (plan.getModel().equals(model)) 
//                    {
//                        isFound = true;
//                        break;
//                    }
//                }
//                if (!isFound) 
//                {
//                    models.add(plan.getModel());
//                }
//            }
//            return models;
            Set<String> list = new HashSet<String>();
            plans.values().stream().forEach(x -> list.add(x.getModel()));
            return new ArrayList<String>(list);
        }
        return new ArrayList<String>();
    }

    public int getTotalCountForMobileModel(int userID, String password, String mobileModel) 
    {
        if(validateUser(userID, password))
        {
//            int count = 0;
//            // for (MobilePlan plan : plans) {
//            for (MobilePlan plan : plans.values()) 
//            {
//                if (plan.getModel().equals(mobileModel)) 
//                {
//                    count++;
//                }
//            }
//            return count;
            return (int) plans.values().stream().filter(x -> x.getModel().equals(mobileModel)).count();
        }
        return 0;
    }

    public double getTotalPaymentForMobileModel(int userID, String password, String mobileModel, int flatRate) 
    {
        if(validateUser(userID, password))
        {
//            double result = 0;
//            // for (MobilePlan plan : plans) {
//            for(MobilePlan plan : plans.values())
//            {
//                if (plan.getModel().equals(mobileModel)) 
//                {
//                    result += plan.calcPayment(flatRate);
//                }
//            }
//            return result;
            return (double) plans.values().stream().filter(x -> x.getModel().equals(mobileModel)).map(x -> x.calcPayment(flatRate)).reduce(0.0, (x, y) -> x+y);
        }
        return 0;
    }

    public ArrayList<Integer> getTotalCountPerMobileModel(int userID, String password, ArrayList<String> mobileModels) 
    {
        if(validateUser(userID, password))
        {
//            ArrayList<Integer> counts = new ArrayList<>();
//            for (String model : mobileModels) 
//            {
//                counts.add(getTotalCountForMobileModel(userID, password, model));
//            }
//            return counts;
            ArrayList<Integer> list = new ArrayList<Integer>();
            mobileModels.stream().forEach(x -> list.add(getTotalCountForMobileModel(userID, password, x)));
            return list;
        }
        return new ArrayList<Integer>();
    }

    public ArrayList<Double> getTotalPaymentPerMobileModel(int userID, String password, ArrayList<String> mobileModels, int flatRate) 
    {
        if(validateUser(userID, password))
        {
//            ArrayList<Double> payments = new ArrayList<>();
//            for (String model : mobileModels) 
//            {
//                payments.add(getTotalPaymentForMobileModel(userID, password, model, flatRate));
//            }
//            return payments;
            ArrayList<Double> list = new ArrayList<Double>();
            mobileModels.stream().forEach(x -> list.add(getTotalPaymentForMobileModel(userID, password, x, flatRate)));
            return list;
        }
        return new ArrayList<Double>();
    }

    public void reportPaymentsPerMobileModel(int userID, String password, ArrayList<String> mobileModels, ArrayList<Integer> counts, ArrayList<Double> monthlyPayments) 
    {
        if(validateUser(userID, password))
        {
            System.out.println("-MobileModel-\t\t\t-TotalMonthlyPayment-\t\t\t-AverageMonthlyPayment-");
            for (int i = 0; i < counts.size(); i++) 
            {
                System.out.printf(mobileModels.get(i) + "\t\t\t%.2f $", monthlyPayments.get(i));
                System.out.printf("\t\t\t%.2f $\n", (monthlyPayments.get(i) / counts.get(i)));
            }
        }
    }

    // lab4

    public User(User user) // copy constructor
    { 
        name = user.name;
        userID = user.userID;
        address = new Address(user.address);
        password = user.password;
        // plans = new ArrayList<>();
        plans = new HashMap<Integer, MobilePlan>();
        // for (MobilePlan plan : user.plans) {
        for (MobilePlan plan : user.plans.values()) 
        {
            if(plan instanceof PersonalPlan)
            {
                // plans.add(new PersonalPlan((PersonalPlan) plan));
                plans.put(plan.getId(),new PersonalPlan((PersonalPlan) plan));
            }
            else
            {
                plans.put(plan.getId(),new BusinessPlan((BusinessPlan) plan));
            }
        }
    }

    @Override
    public User clone() throws CloneNotSupportedException // clone()
    { 
        User result = (User) super.clone();
        result.address = address.clone();
        result.plans = deepCopyPlansHashMap();
        return result;
    }

    public static ArrayList<User> shallowCopy(ArrayList<User> users) 
    {
        ArrayList<User> result = new ArrayList<>();
        // for (User user : users) 
        // {
        //     result.add(user);
        // }
        users.stream().forEach(result::add);
        return result;
    }

    public static ArrayList<User> deepCopy(ArrayList<User> users) throws CloneNotSupportedException 
    {
        // ArrayList<User> result = new ArrayList<>();
        // for (User user : users) 
        // {
        //     result.add(user.clone());
        // }
        // return result;
        return users.stream().collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<MobilePlan> deepCopyPlans() throws CloneNotSupportedException 
    {
        return MobilePlan.deepCopy(plans);
    }

    public ArrayList<MobilePlan> shallowCopyPlans() 
    {
        return MobilePlan.shallowCopy(plans);
    }

    @Override
    public int compareTo(User other) // compare by city name
    { 
        return address.compareTo(other.address);
    }

    // public int compareTo1(User other) // compare by total payment
    // { 
    //     if(calcTotalPayments(2) > other.calcTotalPayments(2))
    //     {
    //         return 1;
    //     }
    //     else if(calcTotalPayments(2) < other.calcTotalPayments(2))
    //     {
    //         return -1;
    //     }
    //     else
    //     {
    //         return 0;
    //     }
    // }

    public ArrayList<MobilePlan> sortPlansByDate()
    {
        ArrayList<MobilePlan> sortedPlans = shallowCopyPlans();
        Collections.sort(sortedPlans);
        return sortedPlans;
    }

    // lab5

    public static ArrayList<User> deepCopy(HashMap<Integer, User> users) throws CloneNotSupportedException
    {
        // ArrayList<User> result = new ArrayList<>();
        // for(User user: users.values())
        // {
        //     result.add(user.clone());
        // }
        // return result;
        return users.values().stream().collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<User> shallowCopy(HashMap<Integer, User> users)
    {
        ArrayList<User> result = new ArrayList<>();
        // for(User user: users.values())
        // {
        //     result.add(user);
        // }
        users.values().stream().forEach(result::add);
        return result;
    }

    public static HashMap<Integer, User> deepCopyHashMap(HashMap<Integer, User> users) throws CloneNotSupportedException
    {
        // HashMap<Integer, User> result = new HashMap<Integer, User>();
        // for(User user : users.values())
        // {
        //     result.put(user.getUserID(), user.clone());
        // }
        // return result;
        return users.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue(),(x, y) -> x, HashMap::new)); // ?????
    }

    public static HashMap<Integer, User> shallowCopyHashMap(HashMap<Integer, User> users) 
    {
        HashMap<Integer, User> result = new HashMap<Integer, User>();
        // for(User user : users.values())
        // {
        //     result.put(user.getUserID(), user);
        // }
        users.values().stream().forEach
        (
            x ->
            {
                result.put(x.getUserID(), x);
            }
        );
        return result;
    }

    public HashMap<Integer, MobilePlan> deepCopyPlansHashMap() throws CloneNotSupportedException 
    {
        return MobilePlan.deepCopyHashMap(plans);
    }

    public HashMap<Integer, MobilePlan> shallowCopyPlansHashMap() 
    {
        return MobilePlan.shallowCopyHashMap(plans);
    }

    public HashMap<String, Integer> getTotalCountPerMobileModel(int userID, String password)
    {
        if(validateUser(userID, password))
        {
//            HashMap<String, Integer> result = new HashMap<String, Integer>();
//            for(MobilePlan plan : plans.values())
//            {
//                Integer count = result.get(plan.getModel());
//                if(count != null)
//                {
//                    result.put(plan.getModel(), count + 1);
//                }
//                else
//                {
//                    result.put(plan.getModel(), 1);
//                }
//            }
//            return result;
            return (HashMap<String, Integer>) plans.values().stream().map(plan -> plan.getModel()).collect(Collectors.toMap(key -> key,value -> 1,(a, b) -> a + b));
        }        
        return new HashMap<String, Integer>();
        
    }

    public HashMap<String, Double> getTotalPaymentPerMobileModel(int userID, String password, int flatRate)
    {
        if(validateUser(userID, password))
        {
//            HashMap<String, Double> result = new HashMap<String, Double>();
//            for(MobilePlan plan : plans.values())
//            {
//                Double payment = result.get(plan.getModel());
//                if(payment != null)
//                {
//                    result.put(plan.getModel(),  payment + plan.calcPayment(9));
//                }
//                else
//                {
//                    result.put(plan.getModel(), plan.calcPayment(9));
//                }
//            }
//            return result;
            return (HashMap<String, Double>) plans.values().stream().collect(Collectors.toMap(x -> x.getModel(),x -> x.calcPayment(flatRate),(a, b) -> a + b));
            
        }        
        return new HashMap<String, Double>();        
    } 

    public void reportPaymentsPerMobileModel(int userID, String password, HashMap<String, Integer> counts , HashMap<String, Double> payments)
    {
        if(validateUser(userID, password))
        {
            System.out.println("-MobileModel-\t\t\t-TotalMonthlyPayment-\t\t\t-AverageMonthlyPayment-\n");
//            for(String model : payments.keySet())
            payments.keySet().forEach
            (
                x ->
                {
                    System.out.printf(x + "\t\t\t %.2f $", payments.get(x));
                    System.out.printf("\t\t\t %.2f $\n",(payments.get(x)/counts.get(x)));
                }
            );
            
        }
    }

    // lab6

    public static HashMap<Integer, User> load(String fileName)
    {
        HashMap<Integer, User> loads = new HashMap<Integer, User>();
        ObjectInputStream input = null;
        try 
        {
            input = new ObjectInputStream(new FileInputStream(fileName));
        } 
        catch (IOException e) {
            System.out.println("Error in create/open file. ");
            System.exit(1);
        }
        try 
        {
            while (true) 
            {
                User user = (User) input.readObject();
                loads.put(user.getUserID(), user);
            }
        }
        catch (EOFException e) 
        {
            System.out.println("No more records!");
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println("Error in wrong class");
        } 
        catch (IOException e) 
        {
            System.out.println("Error in add obj to file ");
            System.exit(1);
        }
        try 
        {
            if (input != null) 
            {
                input.close();
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error in close file");
            System.exit(1);
        }
        return loads;
    }

    public static boolean save(HashMap<Integer, User> users, String fileName)
    {

        ObjectOutputStream output = null;
        try 
        {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } 
        catch (IOException e) 
        {
            System.out.println("Error in create/open file. ");
            System.exit(1);
        }
        try 
        {
            for (User user : users.values()) 
            {
                output.writeObject(user);
            }
        } 
        catch (IOException ex) 
        {
            System.err.println("error in adding the objects to the file ");
            System.exit(1);
        }
        try 
        {
            if (output != null)
            {
                output.close();
            }
            
        } 
        catch (IOException ex) 
        {
            System.err.println("error in closing the file ");
            System.exit(1);
        }
        return true;
    }

    public String toDilimatedString()
    {
        String toDilimatedString = userID + "," + name + "," + password + "," + address.toDilimatedString() + "," + plans.size();
        for(MobilePlan plan: plans.values())
        {
            toDilimatedString += "," + plan.toDilimatedString();
        }
        return toDilimatedString;
    }

    public static Boolean saveTextFile(HashMap<Integer, User> users, String fileName)
    {
        BufferedWriter out = null;
        try 
        {
            out = new BufferedWriter(new FileWriter(fileName));
            for (User user : users.values()) 
            {
                out.write(user.toDilimatedString() + "\n");
            }
            out.close();
        } 
        catch (IOException e) 
        {
            System.err.println("error in closing the file ");
            return false;
        }
        return true;
    }

    public static HashMap<Integer, User> loadTextFile(String fileName) 
    {
        HashMap<Integer, User> loads = new HashMap<Integer, User>();
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
            String[] field = line.split(",");
            int userID = Integer.parseInt(field[0]);
            String name = field[1];
            String password = field[2];
            String city = field[3];
            String suburb = field[4];
            String street = field[5];
            int streetNum = Integer.parseInt(field[6]);
            int plansCount = Integer.parseInt(field[7]);
            User user = new User(name, userID, password, new Address(streetNum, street, suburb, city));
            int counter = 8;
            for (int i = 0; i < plansCount; i++) 
            {
                switch (field[counter++]) 
                {
                    case "PP":
                        String userName = field[counter++];
                        int id = Integer.parseInt(field[counter++]);
                        int internetQuota = Integer.parseInt(field[counter++]);
                        int capLimit = Integer.parseInt(field[counter++]);
                        int day = Integer.parseInt(field[counter++]);
                        int month = Integer.parseInt(field[counter++]);
                        int year = Integer.parseInt(field[counter++]);
                        String model = field[counter++];
                        String type = field[counter++];
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
                        int memorySize = Integer.parseInt(field[counter++]);
                        double price = Double.parseDouble(field[counter++]);
                        String city1 = field[counter++];
                        PersonalPlan plan = new PersonalPlan(userName, id, new MobilePhone(model, typeEnum, memorySize, price), internetQuota, capLimit, new MyDate(year, month, day), city1);
                        user.addPlan(userID, password, plan);
                        break;

                    case "BP":
                        String userNameBp = field[counter++];
                        int idBp = Integer.parseInt(field[counter++]);
                        int internetQuotaBp = Integer.parseInt(field[counter++]);
                        int capLimitBp = Integer.parseInt(field[counter++]);
                        int dayBp = Integer.parseInt(field[counter++]);
                        int monthBp = Integer.parseInt(field[counter++]);
                        int yearBp = Integer.parseInt(field[counter++]);
                        String modelBp = field[counter++];
                        String typeBp = field[counter++];
                        MobileType typeEnumBp = null;
                        if (typeBp.equalsIgnoreCase("ANDROID")) 
                        {
                            typeEnumBp = MobileType.Android;
                        } 
                        else if (typeBp.equalsIgnoreCase("IOS")) 
                        {
                            typeEnumBp = MobileType.IOS;
                        } 
                        else if (typeBp.equalsIgnoreCase("WINDOWS")) 
                        {
                            typeEnumBp = MobileType.Windows;
                        }
                        int memorySizeBp = Integer.parseInt(field[counter++]);
                        double priceBp = Double.parseDouble(field[counter++]);
                        int numberOfEmployees = Integer.parseInt(field[counter++]);
                        int ABN = Integer.parseInt(field[counter++]);
                        BusinessPlan planBp = new BusinessPlan(numberOfEmployees, ABN, userNameBp, idBp, new MobilePhone(modelBp, typeEnumBp, memorySizeBp, priceBp), internetQuotaBp, capLimitBp, new MyDate(yearBp, monthBp, dayBp));
                        user.addPlan(userID, password, planBp);
                        break;
                }
                loads.put(user.getUserID(), user);
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

    //advanced A2

    public int[] planCount(int userID, String password, int[] ranges, int flatRate)
    {
        if(validateUser(userID, password))
        {
            int[] planCount = new int[ranges.length-1];                          
            for(int i=0; i<planCount.length-1; i++)
            {
//                int count = 0;
//                for(MobilePlan plan: plans.values())
//                {
//                    if(ranges[i]<=plan.calcPayment(flatRate) && plan.calcPayment(flatRate)<ranges[i+1])
//                    {
//                        count++;
//                    }
//                }
//                planCount[i] = count;     
                int first = ranges[i];
                int second = ranges[i+1];
                planCount[i] = (int) plans.values().stream().filter(x -> (first<=x.calcPayment(flatRate) && x.calcPayment(flatRate)<second)).count();
            }
            return planCount;
        }
        return null;
    }  
    
}

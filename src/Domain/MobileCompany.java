package Domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MobileCompany implements Cloneable, Serializable
{

    private String name;
    // private ArrayList<User> users;
    private HashMap<Integer, User> users;
    private String mobileCompanyUsername;
    private String mobileCompanyPassword;
    private int flatRate;

    public MobileCompany(String name, String mobileCompanyUsername, String mobileCompanyPassword, int flatRate) 
    {
        this.name = name;
        this.mobileCompanyUsername = mobileCompanyUsername;
        this.mobileCompanyPassword = mobileCompanyPassword;
        this.flatRate = flatRate;
        // this.users = new ArrayList<User>();
        this.users = new HashMap<Integer, User>();
    }

    public String getName() 
    {
        return name;
    }

    public HashMap<Integer, User> getUsers()
    {
        return users;
    }

    public String getMobileCompanyUsername() 
    {
        return mobileCompanyUsername;
    }

    public String getMobileCompanyPassword() 
    {
        return mobileCompanyPassword;
    }

    public int getFlatRate() 
    {
        return flatRate;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setMobileCompanyUsername(String mobileCompanyUsername) 
    {
        this.mobileCompanyUsername = mobileCompanyUsername;
    }

    public void setMobileCompanyPassword(String mobileCompanyPassword) 
    {
        this.mobileCompanyPassword = mobileCompanyPassword;
    }

    public void setFlatRate(int flatRate) {
        this.flatRate = flatRate;
    }

    public boolean validateMobileCompany(String username, String password)
    {
        if (username.equals(mobileCompanyUsername) && password.equals(mobileCompanyPassword)) 
        {
            return true;
        }
        return false;
    }

    public boolean addUser(String mobileCompanyUsername,String mobileCompanyPassword, User user) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            if (findUser(user.getUserID()) == null) 
            {
                // users.add(user);
                users.put(user.getUserID(), user);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean addUser(String mobileCompanyUsername,String mobileCompanyPassword, String name, Address address, String password) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            return addUser(mobileCompanyUsername, mobileCompanyPassword, new User(name, address, password));
        }
        return false;
    }

    public User findUser(int userID) 
    {
        // for (User user : users) {
        //     if (user.getUserID() == userID) {
        //         return user;
        //     }
        // }
        // return null;
        return users.get(userID);
    }

    // mobileCompany menu
    public boolean addPlan(String mobileCompanyUsername, String mobileCompanyPassword, int userID, MobilePlan plan) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.addPlan(user.getUserID(), user.getPassword(), plan);
            }
            return false;
        }
        return false;
    }

    // user menu
    public boolean addPlan(int userID, String password, MobilePlan plan)
    {
        if(validateUser(userID, password))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.addPlan(userID, password, plan);
            }
            return false;
        }
        return false;
    }

    public MobilePlan findPlan(int userID, int planID) 
    {
        // if (user != null) {
        //     return user.findPlan(planID);
        // }
        // return null;
        User user = findUser(userID);
        return user.findPlan(planID);
    }

    // mobileCompany menu
    public void printPlans(String mobileCompanyUsername, String mobileCompanyPassword, int userID) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                user.print(user.getUserID(), user.getPassword(), flatRate);
            } 
            else 
            {
                System.out.println("\n|--- (no such user) ---|");
            }
        }
    }

    // user menu
    public void printPlans(int userID, String password) 
    {
        if(validateUser(userID, password))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                user.print(userID, password, flatRate);
            } 
            else 
            {
                System.out.println("\n|--- (no such user) ---|");
            }
        }
    }

    public void print(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            System.out.println("company name: " + name + " - flat rate: " + flatRate + "\n");
            if (users != null) 
            {
                // for (User user : users) {
                for(User user : users.values())
                {
                    user.print(user.getUserID(),user.getPassword(),flatRate);
                    System.out.print("|----- (user) -----|\n");
                }
            } 
            else 
            {
                System.out.println("\n|----- (no user exists) -----|\n");
            }
        }
    }

    @Override
    public String toString() 
    {
        String result = "company name: " + name + " - flat rate: " + flatRate + "\n\n";
        // for (User user : users) {
        for(User user : users.values())
        {
            result += user + "\n|----- (user) -----|\n";
        }
        return result;
    }

    public boolean createPersonalPlan(String mobileCompanyUsername, String mobileCompanyPassword, int userID, String username, int id, MobilePhone mobilePhone, int internetQuota, int capLimit, MyDate expiryDate, String city)  
    {
        if(validateMobileCompany(username, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.createPersonalPlan(user.getUserID(), user.getPassword(), username, id, mobilePhone, internetQuota, capLimit, expiryDate, city);
            }
            return false;
        }
        return false;
    }

    public boolean createBusinessPlan(String mobileCompanyUsername, String mobileCompanyPassword, int userID, String username, int id, MobilePhone mobilePhone, int internetQuota, int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN) 
    {
        if(validateMobileCompany(username, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.createBusinessPlan(user.getUserID(), user.getPassword(), username, id, mobilePhone, internetQuota, capLimit, expiryDate, numberOfEmployees, ABN);
            }
            return false;
        }
        return false;
    }

    public double calcTotalPayments(String mobileCompanyUsername, String mobileCompanyPassword, int userID) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.calcTotalPayments(user.getUserID(), user.getPassword(), flatRate);
            }
            return 0;
        }
        return 0;
    }

    public double calcTotalPayments(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            // double result = 0;
            // // for (User user : users) {
            // for(User user : users.values())
            // {
            //     result += calcTotalPayments(mobileCompanyUsername, mobileCompanyPassword, user.getUserID());
            // }
            // return result;
            return users.values().stream().mapToDouble(x -> x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate)).sum();
        }
        return 0;
    }

    public boolean mobilePriceRise(String mobileCompanyUsername, String mobileCompanyPassword, int userID, double risePercent) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                user.mobilePriceRiseAll(user.getUserID(), user.getPassword(), risePercent);
                return true;
            }
            return false;
        }
        return false;
    }

    public void mobilePriceRise(String mobileCompanyUsername, String mobileCompanyPassword, double risePercent) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            // for (User user : users) {
            // for(User user : users.values())
            // {
            //     mobilePriceRise(mobileCompanyUsername, mobileCompanyPassword, user.getUserID(), risePercent);
            // }
            users.values().stream().forEach(x -> mobilePriceRise(mobileCompanyUsername, mobileCompanyPassword, x.getUserID(), risePercent));
        }
    }

    public ArrayList<MobilePlan> allPlans(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            ArrayList<MobilePlan> mobilePlans = new ArrayList<>();
//            // for (User user : users) {
//            for (User user : users.values()) 
//            {
//                // for (MobilePlan mobilePlan : user.getPlans()) {
//                for (MobilePlan mobilePlan : user.getPlans().values()) 
//                {
//                    mobilePlans.add(mobilePlan);
//                }
//            }
//            return mobilePlans;
            ArrayList<MobilePlan> mobilePlans = new ArrayList<MobilePlan>();
            users.values().forEach
            (
                x ->
                {
                    x.getPlans().values().forEach(mobilePlans::add);
                }
            );
            return mobilePlans;
        }
        return new ArrayList<MobilePlan>();
    }

    public HashMap<Integer, MobilePlan> allPlansHashMap(String mobileCompanyUsername, String mobileCompanyPassword) // hashmap
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            HashMap<Integer, MobilePlan> allUserPlans = new HashMap<Integer, MobilePlan>();
//            for (User user : users.values()) 
//            {
//                for (MobilePlan plan : user.getPlans().values()) 
//                {
//                    allUserPlans.put(plan.getId(), plan); 
//                }
//            }
//            return allUserPlans;
//            HashMap<Integer, MobilePlan> allUserPlans = new HashMap<Integer, MobilePlan>();
//            users.values().forEach
//            (
//                x ->
//                {
//                    x.getPlans().values().forEach
//                    (
//                        y  ->
//                        {
//                            allUserPlans.put(y.getId(), y);
//                        }                                
//                    );
//                }
//            );
//            return allUserPlans;
            HashMap<Integer, MobilePlan> allUserPlans = new HashMap<Integer, MobilePlan>();
        for(User user : users.values())
        {
            allUserPlans.putAll(user.getPlans());
        }
        return allUserPlans;
        }
        return new HashMap<Integer, MobilePlan>();
    }

    public ArrayList<MobilePlan> filterByMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, int userID, String mobileModel) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.filterByMobileModel(user.getUserID(), user.getPassword(), mobileModel);
            }
            return new ArrayList<>();
        }
        return new ArrayList<MobilePlan>();
    }

    public ArrayList<MobilePlan> filterByExpiryDate(String mobileCompanyUsername, String mobileCompanyPassword, int userID, MyDate date) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.filterByExpiryDate(user.getUserID(), user.getPassword(), date);
            }
            return new ArrayList<>();
        }
        return new ArrayList<MobilePlan>();
    }

    // admin menu
    public ArrayList<MobilePlan> filterByMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, String mobileModel) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            // ArrayList<MobilePlan> resultList = new ArrayList<>();
            // // for (User user : users) {
            // for (User user : users.values()) 
            // {
            //     ArrayList<MobilePlan> filteredList = user.filterByMobileModel(user.getUserID(), user.getPassword(), mobileModel);
            //     for (MobilePlan mobilePlan : filteredList) 
            //     {
            //         resultList.add(mobilePlan);
            //     }
            // }
            // return resultList;
            return MobilePlan.filterByMobileModel(allPlans(mobileCompanyUsername, mobileCompanyPassword), mobileModel);
        }
        return new ArrayList<MobilePlan>();
    }

    // user menu
    public ArrayList<MobilePlan> filterByMobileModel(int userID, String password, String mobileModel) 
    {
        if(validateUser(userID, password))
        {
//            ArrayList<MobilePlan> resultList = new ArrayList<>();
//            // for (User user : users) {
//            for (User user : users.values()) 
//            {
//                ArrayList<MobilePlan> filteredList = user.filterByMobileModel(user.getUserID(), user.getPassword(), mobileModel);
//                for (MobilePlan mobilePlan : filteredList) 
//                {
//                    resultList.add(mobilePlan);
//                }
//            }
//            return resultList;
            return MobilePlan.filterByMobileModel(allPlans(mobileCompanyUsername, mobileCompanyPassword), mobileModel);
        }
        return new ArrayList<MobilePlan>();
    }

    // admin menu
    public ArrayList<MobilePlan> filterByExpiryDate(String mobileCompanyUsername, String mobileCompanyPassword, MyDate date) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            ArrayList<MobilePlan> resultList = new ArrayList<>();
//            // for (User user : users) {
//            for (User user : users.values()) 
//            {
//                ArrayList<MobilePlan> filteredList = user.filterByExpiryDate(user.getUserID(), user.getPassword(), date);
//                for (MobilePlan mobilePlan : filteredList) 
//                {
//                    resultList.add(mobilePlan);
//                }
//            }
//            return resultList;
            return MobilePlan.filterByExpiryDate(allPlans(mobileCompanyUsername, mobileCompanyPassword), date);
        }
        return new ArrayList<MobilePlan>();
    }

    // user menu
    public ArrayList<MobilePlan> filterByExpiryDate(int userID, String password, MyDate date) 
    {
        if(validateUser(userID, password))
        {
//            ArrayList<MobilePlan> resultList = new ArrayList<>();
//            // for (User user : users) {
//            for (User user : users.values()) 
//            {
//                ArrayList<MobilePlan> filteredList = user.filterByExpiryDate(user.getUserID(), user.getPassword(), date);
//                for (MobilePlan mobilePlan : filteredList) 
//                {
//                    resultList.add(mobilePlan);
//                }
//            }
//            return resultList;
            return MobilePlan.filterByExpiryDate(allPlans(mobileCompanyUsername, mobileCompanyPassword), date);
        }
        return new ArrayList<MobilePlan>();
    }

    public ArrayList<String> populateDistinctCityNames(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            ArrayList<String> cities = new ArrayList<String>();
//            for (User user : users.values()) 
//            {
//                boolean isFound = false;
//                for (String city : cities) 
//                {
//                    if (city.equals(user.getCity())) 
//                    {
//                        isFound = true;
//                        break;
//                    }
//                }
//                if (!isFound) 
//                {
//                    cities.add(user.getCity());
//                }
//            }
//            return cities;
            Set<String> list = new HashSet<String>();
            users.values().forEach(x -> list.add(x.getCity()));
            return new ArrayList<String>(list);
        }
        return new ArrayList<String>();
    }

    public double getTotalPaymentForCity(String mobileCompanyUsername, String mobileCompanyPassword, String city) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            double result = 0;
//            for (User user : users.values()) 
//            {
//                if (user.getCity().equals(city)) 
//                {
//                    result += user.calcTotalPayments(user.getUserID(), user.getPassword(), flatRate);
//                }
//            }
//            return result;
            return users.values().stream().filter(x -> x.getCity().equals(city)).mapToDouble(x -> x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate)).sum();
        }
        return 0;
    }

    public ArrayList<Double> getTotalPaymentPerCity(String mobileCompanyUsername, String mobileCompanyPassword, ArrayList<String> cities) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            ArrayList<Double> totalPaymentPerCity = new ArrayList<>();
//            for (String city : cities) 
//            {
//                totalPaymentPerCity.add(getTotalPaymentForCity(mobileCompanyUsername, mobileCompanyPassword, city));
//            }
//            return totalPaymentPerCity;
            ArrayList<Double> list = new ArrayList<Double>();
            cities.forEach(x -> list.add(getTotalPaymentForCity(mobileCompanyUsername, mobileCompanyPassword, x)));
            return list;
        }
        return new ArrayList<Double>();
    }

    public void reportPaymentPerCity(String mobileCompanyUsername, String mobileCompanyPassword, ArrayList<String> cities, ArrayList<Double> payments) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            System.out.println("-CityName-\t\t\t-TotalMonthlyPayment-");
            for (int i = 0; i < payments.size(); i++) 
            {
                System.out.printf(cities.get(i) + "\t\t\t%.2f $\n", payments.get(i));
            }
        }
    }

    public boolean validateUser(int userID, String password) 
    {
        User user = findUser(userID);
        if (user != null) 
        {
            return user.validateUser(userID, password);
        } 
        return false;
    }

    // admin menu
    public boolean removePlan(String mobileCompanyUsername, String mobileCompanyPassword, int userID, int planID) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.removePlan(user.getUserID(), user.getPassword(), planID);
            } 
            return false;
        }
        return false;
    }

    // user menu
    public boolean removePlan(int userID, String password, int planID) 
    {
        if(validateUser(userID, password))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                return user.removePlan(userID, password, planID);
            } 
            return false;
        }
        return false;
    }

    public boolean removeUser(String mobileCompanyUsername, String mobileCompanyPassword, int userID) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            User user = findUser(userID);
            if (user != null) 
            {
                users.remove(userID);
                return true;
            }
            return false;
        }
        return false;
    }

    public ArrayList<String> populateDistinctMobileModels(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
//            ArrayList<String> mobileModels = new ArrayList<>();
//            for (User user : users.values()) 
//            {
//                for (String userModel : user.populateDistinctMobileModels(user.getUserID(), user.getPassword())) 
//                {
//                    boolean isFound = false;
//                    for (String model : mobileModels) 
//                    {
//                        if (model.equals(userModel)) 
//                        {
//                            isFound = true;
//                            break;
//                        }
//                    }
//                    if (!isFound) 
//                    {
//                        mobileModels.add(userModel);
//                    }
//                }
//            }
//            return mobileModels;
            Set<String> list = new HashSet<String>();
            allPlans(mobileCompanyUsername, mobileCompanyPassword).forEach(x -> list.add(x.getModel()));
            return new ArrayList<String>(list);
        }
        return new ArrayList<String>();
    }         
    
    public ArrayList<Integer> getTotalCountPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, ArrayList<String> mobileModels) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            ArrayList<Integer> resultCounts = new ArrayList<Integer>();
            for(int i = 0; i < mobileModels.size(); i++) 
            {
                resultCounts.add(0);
            }
            for (User user : users.values()) 
            {
                ArrayList<Integer> userCountsList = user.getTotalCountPerMobileModel(user.getUserID(), user.getPassword(), mobileModels);
                for (int i = 0; i < userCountsList.size(); i++) 
                {
                    resultCounts.set(i, resultCounts.get(i) + userCountsList.get(i));
                }
            }
            return resultCounts;            
        }
        return new ArrayList<Integer>();
    }

    public ArrayList<Double> getTotalPaymentPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, ArrayList<String> mobileModels) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            ArrayList<Double> resultPayments = new ArrayList<Double>();
            for (int i = 0; i < mobileModels.size(); i++) 
            {
                resultPayments.add(0.0);
            }
//            for (User user : users.values()) 
//            {
//                ArrayList<Double> userResultPayments = user.getTotalPaymentPerMobileModel(user.getUserID(), user.getPassword(), mobileModels, flatRate);
//                for (int i = 0; i < userResultPayments.size(); i++) 
//                {
//                    resultPayments.set(i, resultPayments.get(i) + userResultPayments.get(i));
//                }
//            }    
            users.values().stream().forEach
            (
                user -> 
                {                    
                    ArrayList<Double> userResultPayments = user.getTotalPaymentPerMobileModel(user.getUserID(), user.getPassword(), mobileModels, flatRate);
                    for (int i = 0; i < userResultPayments.size(); i++) 
                    {
                        resultPayments.set(i, resultPayments.get(i) + userResultPayments.get(i));
                    }
                }
            );
            return resultPayments;
        }
        return new ArrayList<Double>();
    }

    public void reportPaymentsPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, ArrayList<String> mobileModels, ArrayList<Integer> counts, ArrayList<Double> monthlyPayments) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            System.out.println("-MobileModel-\t\t\t-TotalMonthlyPayment-\t\t\t-AverageMonthlyPayment-");
            for (int i = 0; i < counts.size(); i++) 
            {
                System.out.printf(mobileModels.get(i)+"\t\t\t%.2f $", monthlyPayments.get(i));
                System.out.printf("\t\t\t%.2f $\n", (double) (monthlyPayments.get(i) / counts.get(i)));
            }
        }
    }

    //lab4

    public MobileCompany(MobileCompany mobileCompany)  // copy constructor
    {
        name = mobileCompany.name;
        mobileCompanyUsername = mobileCompany.mobileCompanyUsername;
        mobileCompanyPassword = mobileCompany.mobileCompanyPassword;
        flatRate = mobileCompany.flatRate;
        // users = new ArrayList<>();
        users = new HashMap<Integer, User>();
        // for(User user: mobileCompany.users){
        for(User user: mobileCompany.users.values())
        {
            users.put(user.getUserID(), new User(user));
        }
    }

    public MobileCompany clone() throws CloneNotSupportedException // clone()
    { 
        MobileCompany output = (MobileCompany) super.clone();
        output.users = deepCopyUsersHashMap();
        return output;
    }

    public ArrayList<User> deepCopyUsers() throws CloneNotSupportedException
    {
        return User.deepCopy(users);
    }

    public ArrayList<User> shallowCopyUsers() 
    {
        return User.shallowCopy(users);
    }

    public ArrayList<User> sortUsers() // sort by city name
    { 
        ArrayList<User> sortedUsers = shallowCopyUsers();
        Collections.sort(sortedUsers);
        return sortedUsers;
    }

    // lab5

    public HashMap<Integer, User> deepCopyUsersHashMap() throws CloneNotSupportedException 
    {
        return User.deepCopyHashMap(users);
    }

    public HashMap<Integer, User> shallowCopyUsersHashMap()
    {
        return User.shallowCopyHashMap(users);
    }

    public HashMap<String, Double>  getTotalPaymentPerCity(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            // HashMap<String, Double> result = new HashMap<String, Double>();
            // for(User user: users.values())
            // {
            //     Double payment = result.get(user.getCity());
            //     if(payment != null)
            //     {
            //         result.put(user.getCity(), payment + user.calcTotalPayments(user.getUserID(), user.getPassword(), flatRate));
            //     }
            //     else
            //     {
            //         result.put(user.getCity(), user.calcTotalPayments(user.getUserID(), user.getPassword(), flatRate));
            //     }
            // }
            // return result;
            Map<String, Double> map = new HashMap<String, Double>();
            users.values().forEach(x -> map.put(x.getCity(), x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate)));
            return (HashMap<String, Double>) map;
        }
        return new HashMap<String, Double>();
    }

    public HashMap<String, Integer> getTotalCountPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            HashMap<String, Integer> result = new HashMap<String, Integer>();
            for(User user: users.values())
            {
                for(MobilePlan plan : user.shallowCopyPlans())
                {
                    Integer count = result.get(plan.getModel());
                    if(count != null)
                    {
                        result.put(plan.getModel(), count + 1);
                    }
                    else
                    {
                        result.put(plan.getModel(), 1);
                    }                    
                }
            }
            return result;            
        }
        return new HashMap<String, Integer>();
    }

    public HashMap<String,Double> getTotalPaymentPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword) 
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            HashMap<String, Double> result = new HashMap<String, Double>();
            for(User user: users.values())
            {
                for(MobilePlan plan : user.shallowCopyPlans())
                {
                    Double payment = result.get(plan.getModel());
                    if(payment != null)
                    {
                        result.put(plan.getModel(), payment + plan.calcPayment(flatRate));
                    }
                    else
                    {
                       result.put(plan.getModel(), plan.calcPayment(flatRate));
                    }                    
                }
            }
            return result;
        }
        return new HashMap<String, Double>();
    }

    public void reportPaymentsPerCity(String mobileCompanyUsername, String mobileCompanyPassword, HashMap<String, Double> payments)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            System.out.println("-CityName-\t\t\t-TotalMonthlyPayment-\n");
            for(String city : payments.keySet())
            {
                System.out.printf(city + "\t\t\t %.2f $\n" , payments.get(city));
            }
        }
    }

    public void reportPaymentsPerMobileModel(String mobileCompanyUsername, String mobileCompanyPassword, HashMap<String, Integer> counts , HashMap<String, Double> payments)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            System.out.println("-MobileModel-\t\t\t-TotalMonthlyPayment-\t\t\t-AverageMonthlyPayment-\n");
            for(String model : payments.keySet())
            {
                System.out.printf(model + "\t\t\t %.2f $", payments.get(model));
                System.out.printf("\t\t\t %.2f $\n",(payments.get(model)/counts.get(model)));
            }
        }
    }

    //lab6

    public Boolean load(String fileName) 
    {        
        ObjectInputStream input = null;
        try 
        {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("./DataBase/" + fileName)));
        } 
        catch (IOException ex) 
        {
            System.err.println("error in create/open the file ");
            ex.printStackTrace();
            return false;
        }
        MobileCompany company = null;
        try 
        {
            company = (MobileCompany) input.readObject();
        } 
        catch (EOFException ex) 
        {
            System.out.println("no more record!");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.err.println("error in wrong class in the file ");
            return false;
        } 
        catch (IOException ex) 
        {
            System.err.println("error in add object to the file ");
            return false;
        }
        try
        {
            if (input != null) 
            {
                input.close();
            }
        } 
        catch (IOException ex) 
        {
            System.err.println("error in close the file ");
            return false;
        }
        this.mobileCompanyUsername = company.mobileCompanyUsername;
        this.mobileCompanyPassword = company.mobileCompanyPassword;
        this.users = company.users;
        this.flatRate = company.flatRate;
        this.name = company.name;
        return true;
    }


    public Boolean save(String fileName) 
    {
        //not in design
           File theDir = new File("./DataBase");
            if (!theDir.exists())
            {
                theDir.mkdirs();
            }
        //not in design
        ObjectOutputStream output = null;
        try 
        {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("./" + theDir + "/" + fileName)));
        } 
        catch (IOException ex) 
        {
            System.err.println("error in create/open the file ");
            return false;
        }
        try 
        {
            output.writeObject(this);
        } 
        catch (IOException ex) 
        {
            System.err.println("error in adding the objects to the file ");
            return false;
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
            return false;
        }
        return true;
    }

    public String toDelimitedString() 
    {
        String toDelimitedString = name + "," + mobileCompanyUsername + "," + mobileCompanyPassword + "," + flatRate + "," + users.size();
        for (User user : users.values()) 
        {
            toDelimitedString += "," + user.toDilimatedString();
        }
        return toDelimitedString;
    }

    public Boolean saveTextFile(String fileName) 
    {
        //not in design
           File theDir = new File("./DataBase");
            if (!theDir.exists())
            {
                theDir.mkdirs();
            }
        //not in design
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter("./" + theDir + "/" + fileName));
            writer.write(this.toDelimitedString() + "\n");
            writer.close();
        }
        catch (IOException e) 
        {
            System.err.println("error in closing the file ");
            return false;
        }
        return true;
    }

    public Boolean loadTextFile(String fileName) 
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader("./DataBase/" + fileName));
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
        while (line != null) {
            line = line.trim();
            String[] field = line.split(",");
            this.name = field[0];
            this.mobileCompanyUsername = field[1];
            this.mobileCompanyPassword = field[2];
            this.flatRate = Integer.parseInt(field[3]);
            this.users = new HashMap<Integer, User>();
            int userCount = Integer.parseInt(field[4]);
            int counter = 5;
            for (int i = 0; i < userCount; i++) 
            {
                int userID = Integer.parseInt(field[counter++]);
                String name1 = field[counter++];
                String password = field[counter++];
                String city = field[counter++];
                String suburb = field[counter++];
                String street = field[counter++];
                int streetNum = Integer.parseInt(field[counter++]);
                int plansCount = Integer.parseInt(field[counter++]);
                User user = new User(name1, userID, password, new Address(streetNum, street, suburb, city));
                for (int j = 0; j < plansCount; j++) 
                {
                    String test = field[counter++];
                    switch (test) 
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
                        user.addPlan(user.getUserID(), user.getPassword(), plan);
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
                        user.addPlan(user.getUserID(), user.getPassword(), planBp);
                        break;
                    }
                }
                this.users.put(user.getUserID(), user);
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
        return true;
    }

    public MobileCompany()
    {

    }

    // assignment2

    // InnerClass---------------
    class SortUsersByTotalMonthlyPayment implements Comparator<User>
    {
        @Override
        public int compare(User a, User b) // compare by total payment
        {
            return (int) (a.calcTotalPayments(a.getUserID(), a.getPassword(), flatRate) - b.calcTotalPayments(b.getUserID(), b.getPassword(), flatRate));            
        }
    }
    
    // not in design
    class SortUsersByUserName implements Comparator<User>
    {
        @Override
        public int compare(User a, User b) // compare by total payment
        {
            return a.getName().compareTo(b.getName());
        }
    }
    // not in design
    
    // InnerClass----------------
    
    public ArrayList<User> sortUsersByMonthlyPayment()
    {
        ArrayList<User> sortedList = new ArrayList<>(users.values());
        Collections.sort(sortedList, new SortUsersByTotalMonthlyPayment());
        return sortedList;
    }

    public ArrayList<User> sortUsersByUsername()
    {
        ArrayList<User> sortedList = new ArrayList<>(users.values());
        Collections.sort(sortedList, new SortUsersByUserName());
        return sortedList;
    }
    
    public HashMap<String, ArrayList<User>> getUsersPerCity(String mobileCompanyUsername, String mobileCompanyPassword)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            HashMap<String, ArrayList<User>> usersPerCity = new HashMap<>();
            ArrayList<String> cities = populateDistinctCityNames(mobileCompanyUsername, mobileCompanyPassword);
            for(String city: cities)
            {
                ArrayList<User> users = new ArrayList<>();
                for(User user: this.users.values())
                {
                    if(user.getCity().equals(city))
                    {
                        users.add(user);
                    }
                }
                usersPerCity.put(city, users);
            }  
            return usersPerCity;
        }
        return new HashMap<String, ArrayList<User>>();
    }

    public HashMap<String, ArrayList<MobilePlan>> filterPlansByExpiryDate (String mobileCompanyUsername, String mobileCompanyPassword, MyDate expiryDate)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            HashMap<String, ArrayList<MobilePlan>> filteredPlans = new HashMap<>();
            for(User user: users.values())
            {
                ArrayList<MobilePlan> plans = new ArrayList<>();
                for(MobilePlan plan: user.getPlans().values())
                {
                    if(plan.getExpiryDate().isExpired(expiryDate))
                    {
                        plans.add(plan);
                    }
                }
                filteredPlans.put(user.getName(), plans);
            }
            return filteredPlans; 
        }
        return new HashMap<String, ArrayList<MobilePlan>>();
    }

    //advanced A2

    public int[] planCount(String mobileCompanyUsername, String mobileCompanyPassword, int[] ranges)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            int[] planCount = new int[ranges.length-1];
            for(int i=0;i<planCount.length-1;i++)
            {
                planCount[i] = 0;
            }
//            for(User user : users.values())
//            {
            users.values().stream().forEach
            (
                user ->
                {
                    int[] userPlanCount = user.planCount(user.getUserID(), user.getPassword(), ranges, flatRate);
                    for(int i=0; i<userPlanCount.length-1; i++)
                    {
                        planCount[i] += userPlanCount[i];
                    }    
                }                
            );            
            return planCount;
        }
        return null;
    }
    
    public int[] userCount(String mobileCompanyUsername, String mobileCompanyPassword, int[] ranges)
    {
        if(validateMobileCompany(mobileCompanyUsername, mobileCompanyPassword))
        {
            int[] userCount = new int[ranges.length-1];            
            for(int i=0; i<userCount.length-1; i++)
            {
//                int count = 0;                
//                for(User user : users.values())
//                {
//                    double userPayment = user.calcTotalPayments(user.getUserID(), user.getPassword(), flatRate);                   
//                    if(ranges[i] <= userPayment && userPayment < ranges[i+1])
//                    {
//                        count++;
//                    }
//                }
//                userCount[i] = count;
                int first = ranges[i];
                int second = ranges[i+1];
                userCount[i] = (int)users.values().stream().filter
                (
                    x ->
                    {
                        double userPayment = x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate);
                        return first <= userPayment && userPayment < second;
                    }
                ).count();
                        
            }
            return userCount;
        }
        return null;
    }
    
}

package maps.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapsPractice {

    public static void main(String[] args) {
        Employee e1=new Employee(245,"Dan","123-45-6789");
        Employee e2=new Employee(16,"Alex","987-65-4321");
        Employee e3=new Employee(123,"Tom","567-89-1234");
        Employee e4=new Employee(0,"Bro","123-45-6789");
        
        Map<Integer,Employee> myHashMap=new HashMap<>();
        
        System.out.println("Let's retrieve the employees\n");
        
        myHashMap.put(e1.getEmpID(),e1);
        myHashMap.put(e2.getEmpID(),e2);
        myHashMap.put(e3.getEmpID(),e3);
        myHashMap.put(e4.getEmpID(),e4);
        
        Set<Integer> myHashMapKeys=myHashMap.keySet();
        
        for(Integer i:myHashMapKeys){
            System.out.println(myHashMap.get(i));
        }
        
        System.out.println("\nNow to sort them in a TreeMap\n");
        
        Map<Integer,Employee> myTreeMap=new TreeMap<>();
        
        myTreeMap.put(e2.getEmpID(),e2);
        myTreeMap.put(e1.getEmpID(),e1);
        myTreeMap.put(e4.getEmpID(),e4);
        myTreeMap.put(e3.getEmpID(),e3);
        
        Set<Integer> myTreeMapKeys=myTreeMap.keySet();
        
        for(Integer i:myTreeMapKeys){
            System.out.println(myTreeMap.get(i));
        }
        
        System.out.println("\nNow to remove duplicates\n");
        
        Set<Employee> myTreeSet=new TreeSet<>();
        
        //duplicate removal works when 4 and 1 are the first entries
        //does not work if they are the last entries
        //sos
        myTreeSet.add(e2);
        myTreeSet.add(e4);
        myTreeSet.add(e3);
        myTreeSet.add(e1);
        
        List<Employee> employees=new ArrayList<>(myTreeSet);
        
        for(Employee e:employees){
            System.out.println(e);
        }
    }
}

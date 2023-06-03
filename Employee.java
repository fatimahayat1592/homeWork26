package homeWork26;

import java.util.HashMap;
import java.util.Map;

public class Employee {

/*2)Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000*/
      public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("Jimmy Hike", 23545.0);
        map.put("Smith Doe", 50000.0);
        map.put("John Smith", 100000.0);
        map.put("Jane Johny", 35000.0);
        String highestPaidEmployee="";
        double highestSalary=0;
        for(var v:map.entrySet()){
            if (v.getValue() > highestSalary) {
                highestSalary =v.getValue();
                highestPaidEmployee=v.getKey();
            }

        }
        System.out.println(highestPaidEmployee+" =$"+highestSalary);
    }
}
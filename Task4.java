package homeWork26;

import java.util.ArrayList;
import java.util.Collection;

public class Task4 {
   /* Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
   public static void main(String[] args) {
       Collection<Integer> numbers=new ArrayList<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(6);
       numbers.add(7);
       numbers.add(3);
       numbers.add(4);
       int sum=0;
       for(Integer i:numbers){
           sum=sum+i;
       }
       System.out.println(sum);
   }
}

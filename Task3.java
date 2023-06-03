package homeWork26;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Task3 {
    /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
     Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {


        Collection<String> words = new LinkedHashSet<>();
      words.add("Today");
      words.add("is");
      words.add("Java");
      words.add("Practice");
      words.add("day");
      for(String s:words){
        System.out.print(s+" ");

    }
}}
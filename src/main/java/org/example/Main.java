package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Map<Integer , String > map = new HashMap<>();
        map.put(101,"Sona");
        map.put(102,"Anos");
        map.put(103,"Amos");
        map.put(104,"soma");
        System.out.println("-------------------------------");
        System.out.println(map);


        System.out.println(map.containsKey(109));
        System.out.println( map.get(104));

        for(Integer x:map.keySet()){
            System.out.println(x);
        }

        for(Map.Entry<Integer,String> x : map.entrySet()){
            System.out.println(x.getKey() +" , "+x.getValue());
            System.out.println();
        }
     }
}
package com.Krishna;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("murali" , 10);
        hmap.put("krishna" , 20);
        hmap.put("polisetti", 30);

        hmap.forEach((key, value)-> System.out.println(key + " "+value));

        if(hmap.containsKey("murali"))
        {
            System.out.println(hmap.get("murali"));
        }

        for (Map.Entry<String, Integer> entry : hmap.entrySet()){
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
    }
}

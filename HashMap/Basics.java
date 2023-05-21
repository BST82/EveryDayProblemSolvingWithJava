package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Basics{

    public static void main(String[] args){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 150);
        hm.put("America", 70);
        hm.put("China", 200);
        hm.put("Korea", 50);

        System.out.println(hm);
        hm.put("Nigeria", 5);
        hm.put("America", 20);
        System.out.println(hm);

        //get 
        System.out.println(hm.get("America"));
        System.out.println(hm.containsKey("India"));
       
        //keyset
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String key:hm.keySet()){
            Integer val=hm.get(key);
            System.out.println(key+" "+val);
        }

        // O(N) operations take time  
    }
}
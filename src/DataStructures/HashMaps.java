package DataStructures;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        hashmaps();
    }

    private static void hashmaps() {
        HashMap<String,String> map = new HashMap<String,String>();
        // add a key and value.
        map.put("USA","WDC");
        map.put("India","Delhi");
        map.put("China","Beijing");
        map.put("Russia","Moscow");
//        Replacing Moscow with 'Replaced'
//        map.replace("Russia","Moscow","Replaced");
        System.out.println(map.get("Russia"));
        System.out.println(map);
        System.out.println(map.size());
        for (String s :
                map.keySet()) {
            System.out.print(s + " -> ");
            System.out.print(map.get(s) + "\n");
        }
    }
}

package DataStructures;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(100, "Spongebob");
        table.put(102, "Patrick");
        table.put(101, "Squidward");
        table.put(103, "Sandy");
        table.put(104, "Mr. Krabs");
        System.out.println(table);
        for(Integer Key : table.keySet()) {
            System.out.println(Key + " -> " + table.get(Key));
        }
        System.out.println('\n');
        for(Integer key : table.keySet()) {
            System.out.println(key.hashCode() + " -> " + table.get(key).hashCode());
        }
    }
}

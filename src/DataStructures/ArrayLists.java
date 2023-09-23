package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {
        arrayList();
    }
    public static void arrayList() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(1,9);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(arr.contains(3));
        System.out.println(arr.lastIndexOf(2));
        System.out.println(arr);
    }
}

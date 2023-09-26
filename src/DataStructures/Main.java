package DataStructures;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(5);

        arr.add("A");
        arr.add("B");
        arr.add("C");

        System.out.println(arr);
        System.out.println("size: " + arr.size);
        System.out.println("capacity: " + arr.capacity);
        System.out.println("empty: " + arr.isEmpty());

    }
}

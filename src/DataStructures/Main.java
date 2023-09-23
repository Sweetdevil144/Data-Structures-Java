package DataStructures;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(10);
        arr.add("Abhinav");
        arr.add("Pandey");
        arr.add("Abhinav");
        arr.add("Pandey");
        arr.add("Abhinav");
        arr.add("Pandey");
        System.out.println(arr.toString());
        System.out.println(arr.size);
        System.out.println("Empty : " + arr.isEmpty());
        System.out.println(arr.capacity);
    }
}

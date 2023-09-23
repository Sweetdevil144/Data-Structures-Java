package DataStructures;

public class DynamicArray {
    int size,capacity;
    Object[] array;
    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size+=1;
    }
    public void insert(int index, Object data) {
        if(size >= capacity) {
            grow();
        }
    }
    public void delete(Object data) {

    }
    public void search(Object data) {

    }
    private void grow() {
        capacity = size+1;
    }
    private void shrink() {

    }
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            if(i<size-1) {
                str.append(array[i]).append(", ");
            } else {
                str.append(array[i]).append("]");
            }
        }
        return str.toString();
    }
}

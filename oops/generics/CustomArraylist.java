package oops.generics;

import java.util.Arrays;

public class CustomArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    
    public CustomArraylist(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    
    
    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }
 @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


public static void main(String[] args) {
    CustomArraylist<Integer> list3 = new CustomArraylist<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);
}
}

package com.course.onseo.generic;

import com.course.onseo.animals.Animal;


public class Container<T> {
    private T[] arr;

    public T getByIndex(int index) {
        return arr[index];
    }

    public boolean isEmpty() {
        return arr==null || arr.length==0;
    }

    public int getLength () {
        if (arr==null) return 0;
        else return arr.length;
    }

    public void addOneElement(T element) {
        if (isEmpty()) {
            arr = (T[]) (new Object[]{element});
        }
        else {
            T[] newArr = (T[]) (new Object[arr.length+1]);
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = element;
            arr = newArr;
        }
    }

    public void addAllElements(T[] elements) {
        if (isEmpty()) {
            T[] newArr = (T[]) (new Object[elements.length]);
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = elements[i];
            }
            arr = newArr;
        }
        else {
            T[] newArr = (T[]) (new Object[arr.length+ elements.length]);
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            for (int i = 0; i < elements.length; i++) {
                newArr[i+arr.length] = elements[i];
            }
            arr = newArr;
        }
    }
    
    public void clearAll() {
        arr = (T[]) (new Object[0]);
    }



}

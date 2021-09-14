package com.company;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyCollection<T> implements Iterator<T>, Iterable<T> {
    private T[] collection;
    private Class<T> classType;
    public int currentIndex;

    public MyCollection(Class<T> classType) {
        this.classType = classType;
        collection = (T[]) Array.newInstance(classType, 0);
        currentIndex = -1;
    }

    public T getByIndex(int index) {
        return collection[index];
    }

    public int getSize() {
        return collection.length;
    }

    public void add(T value) {
        T[] temp = (T[]) Array.newInstance(classType, collection.length + 1);

        for (int i = 0; i < collection.length; i++) {
            temp[i] = collection[i];
        }

        temp[temp.length - 1] = value;

        collection = temp;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.length - 1;
    }

    @Override
    public T next() {
        currentIndex++;
        return collection[currentIndex];
    }

    @Override
    public Iterator<T> iterator() {
        currentIndex = -1;
        return this;
    }
}

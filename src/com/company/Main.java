package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>(Integer.class);

        collection.add(10);
        collection.add(867);
        collection.add(3);

        for (int i = 0; i < collection.getSize(); i++) {
            System.out.println(collection.getByIndex(i));
        }

        for (int item : collection) {
            System.out.println(item);
        }

        for (int item : collection) {
            System.out.println(item);
        }

        /*while (collection.hasNext()){
            int item = collection.next();
            System.out.println(item);
        }*/


        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(18);

        for (int item : list) {
            item++;
            System.out.println(item);
        }*/

    }
}

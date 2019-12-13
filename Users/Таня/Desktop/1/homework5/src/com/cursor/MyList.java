package com.cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class MyList<T extends Number & Comparable<? super T>> {


    private List<T> arrayList = new ArrayList<>();

    public MyList() {
    }

    public void add(T data) {
        arrayList.add(data);
    }

    public void print() {
        for (T value : arrayList) {
            System.out.println(value);
        }
    }

    public T findLargestElement() {
        return Collections.max(arrayList);
    }

    public T findSmallestElement() {
        return Collections.min(arrayList);
    }

}

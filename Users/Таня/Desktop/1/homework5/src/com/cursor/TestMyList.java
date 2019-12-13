package com.cursor;

public class TestMyList {
    public static void start() {
        MyList<Integer> arrayList = new MyList<>();
        arrayList.add(345);
        arrayList.add(-2);
        arrayList.add(0);
        arrayList.add(8);
        arrayList.add(1000);

        arrayList.print();

        System.out.println("The largest element of list is " + arrayList.findLargestElement());
        System.out.println("The smallest element of list is " + arrayList.findSmallestElement());
    }
}

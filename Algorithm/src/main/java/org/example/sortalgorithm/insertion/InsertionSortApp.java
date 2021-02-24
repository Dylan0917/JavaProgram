package org.example.sortalgorithm.insertion;

import java.util.Arrays;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InsertionSortApp.java
 * @Description TODO
 * @createTime 2021年02月24日 21:55:00
 */
public class InsertionSortApp {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Integer[] a = {6,5,4,3,2,1};
        insertionSort.soft(a);
        System.out.println(Arrays.asList(a));
    }
}

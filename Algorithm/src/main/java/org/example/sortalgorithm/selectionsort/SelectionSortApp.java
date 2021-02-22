package org.example.sortalgorithm.selectionsort;

import java.util.Arrays;

/**
 * @author yu.wenhua
 * @desc 2.选择排序
 * @date 2021/2/22 16:34
 */
public class SelectionSortApp {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Integer[] a = {6,5,4,3,2,1};
        selectionSort.soft(a);
        System.out.println(Arrays.asList(a));
    }
}

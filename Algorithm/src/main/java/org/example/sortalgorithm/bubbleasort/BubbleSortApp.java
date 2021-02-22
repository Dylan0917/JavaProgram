package org.example.sortalgorithm.bubbleasort;

import java.util.Arrays;

/**
 * @author yu.wenhua
 * @desc    冒泡排序
 * @date 2021/2/22 16:09
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Integer[] a = {6,5,4,3,2,1};
        bubble.soft(a);
        System.out.println(Arrays.asList(a));
    }
}

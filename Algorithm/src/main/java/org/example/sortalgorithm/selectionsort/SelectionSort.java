package org.example.sortalgorithm.selectionsort;

import org.example.sortalgorithm.BaseOpration;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/22 16:34
 */
public class SelectionSort extends BaseOpration {
    @Override
    public void soft(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (greater(a[minIndex],a[j])){
                    minIndex = j;
                }
            }
            exch(a,i,minIndex);
        }
    }

}

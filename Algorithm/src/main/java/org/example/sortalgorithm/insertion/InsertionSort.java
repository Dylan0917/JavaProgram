package org.example.sortalgorithm.insertion;

import org.example.sortalgorithm.BaseOpration;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InsertionSort.java
 * @Description  插入排序
 * @createTime 2021年02月24日 21:55:00
 */
public class InsertionSort extends BaseOpration {
    @Override
    public void soft(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }
}

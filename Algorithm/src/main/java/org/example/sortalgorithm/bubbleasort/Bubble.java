package org.example.sortalgorithm.bubbleasort;

import org.example.sortalgorithm.BaseOpration;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/22 16:12
 */
public class Bubble extends BaseOpration {
    @Override
    public void soft(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (this.greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }
}

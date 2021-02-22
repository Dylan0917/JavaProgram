package org.example.sortalgorithm;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/2/22 16:15
 */
public abstract class BaseOpration {
    public abstract void soft(Comparable[] a);
    public  Boolean greater(Comparable a,Comparable b){
        int i = a.compareTo(b);
        return i > 0;
    }
    public  void exch(Comparable[] a,int i,int j){
        Comparable tem;
        tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }
}

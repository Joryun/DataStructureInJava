package com.sort.insertSort;

/**
 *
 * @ClassName: ArrayInsert
 * @Description: 插入排序算法实现
 * @author Joryun
 * @date 2017年4月9日 下午10:38:17
 */
public class ArrayInsert {

    private long[] a;
    private int nElems;

    public ArrayInsert(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void insertSort() {
        int out;
        int in;

        for (out = 1; out < nElems; out++) {
            for (in = out - 1; in >= 0; in++) {

            }
        }

    }

}

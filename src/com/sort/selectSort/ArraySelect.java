package com.sort.selectSort;

/**
 *
 * @ClassName: ArraySelect
 * @Description: 选择排序算法实现
 * @author Joryun
 * @date 2017年4月9日 下午1:49:28
 */
public class ArraySelect {

    private long[] a;
    private int nElems;

    public ArraySelect(int max) {
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

    public void selectSort() {
        int out;
        int in;
        int minArrayNum;

        for (out = 0; out < nElems; out++) {
            minArrayNum = out;
            for (in = out; in < nElems; in++) {
                if (a[minArrayNum] > a[in]) {
                    minArrayNum = in;
                }
            }
            swap(out, minArrayNum);

        }

    }

}


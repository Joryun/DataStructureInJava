package com.sort.insertSort;

/**
 * @author Joryun
 * @ClassName: ArrayInsert
 * @Description: 插入排序算法实现
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

            long temp = a[out];     //暂时存储out所指向的值
            in = out;       //先令in=out再向左移动，目的在于若无需移动，则将temp插入此位置即可

            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];      //若temp小于比较的数值，则向右移
                --in;
            }
            a[in] = temp;   //将temp插入此位置
        }
    }

}

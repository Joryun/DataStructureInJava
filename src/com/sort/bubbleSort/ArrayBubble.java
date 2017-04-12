package com.sort.bubbleSort;

/**
 *
 * @ClassName: ArrayBubble
 * @Description: 提供插入，排序，展示等方法
 * @author Joryun
 * @date 2017年3月27日 下午2:57:20
 */

public class ArrayBubble {

    private long[] a;	//ref to array a

    private int nElems;		//数组数据项个数

    public ArrayBubble(int max) {		//constructor
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;		//insert it
        nElems++;		//increment size
    }

    public void display() {		//displays array contents
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");		//display it
        }
        System.out.println("");
    }

    /*
     * 思路：
     * 将最小数据项置于数组的最开始，最大项置于数组的最后
     * 外层for，out从数组的最后开始，即out=nElems-1，每经过一次循环out减一
     * 内层for，in的区间范围由out限制，旨在比较区间内相邻两数大小，从而完成一次冒泡排序过程
     */
    public void bubbleSort() {
        int out;
        int in;

        //nElems为数组数据项个数
        for(out=nElems-1; out>1; out--){	//outer loop

            for(in=0; in<out; in++){	//inner loop

                if (a[in] > a[in+1]) {
                    swap(in, in+1);	//swap them
                }
            }
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}





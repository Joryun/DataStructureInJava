package com.sort.bubbleSort;

/**
 *
 * @ClassName: BubbleSort
 * @Description: 构造数组并插入数据，将其测试冒泡排序
 * @author Joryun
 * @date 2017年3月27日 下午2:57:14
 */

public class BubbleSort {

    public static void main(String[] args) {

        int maxSize = 100;		//array size
        ArrayBubble array;		//reference to array
        array = new ArrayBubble(maxSize);

        array.insert(77);		//insert 10 items
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        array.display();		//display items

        array.bubbleSort();		//bubble sort them

        array.display();		//display them again

    }

}

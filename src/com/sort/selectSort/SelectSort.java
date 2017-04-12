package com.sort.selectSort;

/**
 *
 * @ClassName: SelectSort
 * @Description: 选择排序测试用例
 * @author Joryun
 * @date 2017年4月9日 下午1:47:37
 */
public class SelectSort {

    public static void main(String[] args) {

        int maxSize = 100;

        ArraySelect array = null;
        array = new ArraySelect(maxSize);

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

        array.display();

        array.selectSort();

        array.display();

    }
}

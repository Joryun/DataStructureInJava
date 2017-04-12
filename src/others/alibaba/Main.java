package others.alibaba;

/**
 * Created by joryun on 2017/4/12.
 *
 * 阿里的消息中间件，负责淘宝天猫支付宝等各个系统的消息中转，削峰填谷及架构的解耦。
 * 在每年的双11中承载了数万亿的消息。在消息中间件中，topic代表了消息类型，一个应用去订阅消息，
 * 首先要给自己申请一个订阅组名称groupId，然后通过groupId去订阅这个topic，这就形成了一个订阅关系。
 * 在电商平台中，有几十万个订阅组，也有几十万个topic，生产环境里也有几十万的订阅关系。
 * 这里假定：订阅组有自己想订阅的topic，每个topic只能有一个订阅组订阅，在这种场景下，
 * 满足订阅组的订阅意愿前提，给定一组订阅意愿，我们计算会有多少种订阅关系。
 * 限定订阅组和topic的数量是一致的。
 * sub代表想订阅，unsub代表不想订阅。
 * 例如：

                topic_0      topic_1      topic_2
 groupId_A       sub          sub          unsub
 groupId_B       unsub        sub          sub
 groupId_C       sub          unsub        unsub

 上面的表说明 groupId_A想订阅topic_0 和 topic_1, groupId_B想订阅topic_1和topic_2，groupId_C只想订阅topic_0。

 那么可能的订阅关系组合只有一个，是（groupId_A，topic_1） (groupId_B, topic_2) (groupId_C,topic_0)
 *
 */

import java.util.Scanner;

public class Main {
    static long caculateSubs(int n, int[][] array) {
        int res = 0;
        int row = 0, row1 = n-1;    //row控制从左到右，row1控制从右到左
        int flag = 0, flag1 = 0;    //遇1加1，遇0归0
        int i = 0, j = 0;       //i：行  j：列
        int i1 = 0, j1 = n-1;      //i1：行  j1：列

        for (int k = 0; k < n * n; k++) {
            if (array[i][j] == 1 && row <= n-1) {
                i = (i + 1 + n) % n;
                j = (j + 1 + n) % n;
                flag++;
                if (flag % n == 0) {
                    res++;
                    flag = 0;
                    j = (++row + n) % n;
                    i = 0;
                }
            } else {
                if (row >= n) {
                    break;
                }
                flag = 0;
                i = 0;
                j = (++row + n) % n;

            }

            if (array[i1][j1] == 1 && row >= 0) {
                i1 = (i1 + 1 + n) % n;
                j1 = (j1 - 1 + n) % n;

                flag1++;
                if (flag1 % n == 0) {
                    res++;
                    flag1 = 0;
                    i1 = 0;
                    j1 = (--row1 + n) % n;

                }
            } else {
                if (row1 <= -1) {
                    break;
                }
                flag1 = 0;
                i1 = 0;
                j1 = (--row1 + n) % n;

            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _array_rows = 0;
        int _array_cols = 0;
        _array_rows = _n;
        _array_cols = _n;

        int[][] _array = new int[_array_rows][_array_cols];
        for (int _array_i = 0; _array_i < _array_rows; _array_i++) {
            for (int _array_j = 0; _array_j < _array_cols; _array_j++) {
                _array[_array_i][_array_j] = in.nextInt();
            }
        }
        if (in.hasNextLine()) {
            in.nextLine();
        }
        res = caculateSubs(_n, _array);
        System.out.println(res);
    }

}


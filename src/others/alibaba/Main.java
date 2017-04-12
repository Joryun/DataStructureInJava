package others.alibaba;

/**
 * Created by joryun on 2017/4/12.
 */

import java.util.Scanner;

public class Main {
    static long caculateSubs(int n, int[][] array) {
        int res = 0;
        int row = 0, row1 = 2;
        int flag = 0, flag1 = 0;
        int i = 0, j = 0;
        int i1 = 2, j1 = 0;

        for (int k = 0; k < n * n; k++) {
            if (array[i][j] == 1 && row <= 2) {
                i = (i + 1 + n) % n;
                j = (j + 1 + n) % n;
                flag++;
                if (flag % n == 0) {
                    res++;
                    flag = 0;
                    i = (++row + n) % n;
                    j = 0;
                }
            } else {
                if (row >= 3) {
                    break;
                }
                flag = 0;
                i = (++row + n) % n;
                j = 0;
            }

            if (array[i1][j1] == 1 && row >= 0) {
                i1 = (i1 - 1 + n) % n;
                j1 = (j1 + 1 + n) % n;
                flag1++;
                if (flag1 % n == 0) {
                    res++;
                    flag1 = 0;
                    i1 = (--row1 + n) % n;
                    j1 = 0;
                }
            } else {
                if (row1 <= -1) {
                    break;
                }
                flag1 = 0;
                i1 = (--row1 + n) % n;
                j1 = 0;
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


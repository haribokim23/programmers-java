package p120xxx.p120882;

// 제목 : 등수 매기기

import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        double[] averages = new double[length];

        for (int index = 0; index < length; index++) {
            averages[index] = (score[index][0] + score[index][1]) / 2.0;
        }

        double[] sorted = new double[length];
        System.arraycopy(averages, 0, sorted, 0, length);
        Arrays.sort(sorted);
        int[] orders = new int[length];

        for (int index = 0; index < length; index++) {
            int order = 0;

            for (int i = 0; i < length; i++) {
                order = i;

                if (averages[index] < sorted[i]) {
                    order--;
                    break;
                }
            }

            orders[index] = length - order;
        }

        return orders;
    }
}

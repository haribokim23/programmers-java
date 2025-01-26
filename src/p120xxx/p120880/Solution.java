package p120xxx.p120880;

// 제목 : 특이한 정렬

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        Integer[] temp = new Integer[length];

        for (int index = 0; index < length; index++) {
            temp[index] = numlist[index];
        }

        Arrays.sort(temp, new Comparator<>() {
            @Override
            public int compare(Integer number1, Integer number2) {
                int difference1 = Math.abs(n - number1);
                int difference2 = Math.abs(n - number2);

                if (difference1 < difference2) {
                    return -1;
                } else if (difference1 == difference2) {
                    return number1 > number2 ? -1 : 1;
                } else {
                    return 1;
                }
            }
        });

        for (int index = 0; index < length; index++) {
            numlist[index] = temp[index];
        }

        return numlist;
    }
}

package p120xxx.p120897;

// 제목 : 약수 구하기

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] factors = new int[n * 2];
        int count = 0;

        for (int factor = 1; factor <= n; factor++) {
            if (n % factor == 0) {
                factors[count++] = factor;
            }
        }

        int[] factors2 = new int[count];
        System.arraycopy(factors, 0, factors2, 0, count);
        Arrays.sort(factors2);
        return factors2;
    }
}

package p120xxx.p120808;

// 제목 : 분수의 덧셈

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 = numer1 * denom2 + numer2 * denom1;
        denom1 *= denom2;

        for (int number = 2; number <= Math.min(numer1, denom1); ) {
            if (numer1 % number == 0 && denom1 % number == 0) {
                numer1 /= number;
                denom1 /= number;
                continue;
            }

            number++;
        }

        return new int[]{numer1, denom1};
    }
}

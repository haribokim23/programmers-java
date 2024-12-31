package p120xxx.p120840;

// 제목 : 구슬을 나누는 경우의 수

import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger count = BigInteger.ONE;

        for (int i = share + 1; i <= balls; i++) {
            count = count.multiply(BigInteger.valueOf(i));
        }

        for (int i = 2; i <= balls - share; i++) {
            count = count.divide(BigInteger.valueOf(i));
        }

        return count.intValue();
    }
}

package p120xxx.p120878;

// 제목 : 유한소수 판별하기

class Solution {
    public int solution(int a, int b) {
        for (int factor = Math.min(a, b); factor > 1; factor--) {
            if (a % factor == 0 && b % factor == 0) {
                a /= factor;
                b /= factor;
            }
        }

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }
}

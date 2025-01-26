package p120xxx.p120836;

// 제목 : 순서쌍의 개수

class Solution {
    public int solution(int n) {
        int count = 0;

        for (int factor = 1; factor <= n; factor++) {
            if (n % factor == 0) {
                count++;
            }
        }

        return count;
    }
}

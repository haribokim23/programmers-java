package p120xxx.p120891;

// 제목 : 369게임

class Solution {
    public int solution(int order) {
        int count = 0;

        while (order > 0) {
            int number = order % 10;
            if (number != 0 && number % 3 == 0) {
                count++;
            }

            order /= 10;
        }

        return count;
    }
}

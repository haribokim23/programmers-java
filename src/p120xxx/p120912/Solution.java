package p120xxx.p120912;

// 제목 : 7의 개수

class Solution {
    public int solution(int[] array) {
        int count = 0;

        for (int number : array) {
            while (number > 0) {
                if (number % 10 == 7) {
                    count++;
                }

                number /= 10;
            }
        }

        return count;
    }
}

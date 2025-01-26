package p120xxx.p120890;

// 제목 : 가까운 수

class Solution {
    public int solution(int[] array, int n) {
        int value = 0;
        int minDifference = 100;

        for (int number : array) {
            int difference = Math.abs(number - n);

            if (difference < minDifference) {
                minDifference = difference;
                value = number;
                continue;
            }

            if (difference == minDifference) {
                value = Math.min(value, number);
            }
        }

        return value;
    }
}

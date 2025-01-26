package p120xxx.p120923;

// 제목 : 연속된 수의 합

class Solution {
    public int[] solution(int num, int total) {
        int[] numbers = new int[num];
        int start;

        if (total % num == 0) {
            start = total / num - num / 2;
        } else {
            start = total / num - num / 2 + 1;
        }

        for (int index = 0; index < num; index++) {
            numbers[index] = start + index;
        }

        return numbers;
    }
}

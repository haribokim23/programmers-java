package p120xxx.p120813;

// 제목 : 짝수는 싫어요

class Solution {
    public int[] solution(int n) {
        int count = n / 2 + n % 2;
        int[] array = new int[count];

        for (int index = 0; index < count; index++) {
            array[index] = index * 2 + 1;
        }

        return array;
    }
}

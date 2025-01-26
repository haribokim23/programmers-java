package p120xxx.p120862;

// 제목 : 최댓값 만들기 (2)

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return Math.max(numbers[0] * numbers[1], numbers[length - 1] * numbers[length - 2]);
    }
}

package p120xxx.p120847;

// 제목 : 최댓값 만들기(1)

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return numbers[length - 1] * numbers[length - 2];
    }
}

package p120xxx.p120811;

// 제목 : 중앙값 구하기

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

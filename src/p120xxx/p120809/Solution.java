package p120xxx.p120809;

// 제목 : 배열 두 배 만들기

class Solution {
    public int[] solution(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] *= 2;
        }

        return numbers;
    }
}

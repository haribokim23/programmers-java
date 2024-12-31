package p120xxx.p120833;

// 제목 : 배열 자르기

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1 + 1;
        int[] answer = new int[length];
        System.arraycopy(numbers, num1, answer, 0, length);
        return answer;
    }
}

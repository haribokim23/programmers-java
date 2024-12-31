package p120xxx.p120817;

// 제목 : 배열의 평균값

class Solution {
    public double solution(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}

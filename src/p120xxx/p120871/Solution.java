package p120xxx.p120871;

// 제목 : 저주의 숫자 3

class Solution {
    public int solution(int n) {
        int number = 1;

        while (n-- > 1) {
            number++;

            while (number % 3 == 0 || Integer.toString(number).contains("3")) {
                number++;
            }
        }

        return number;
    }
}

package p120xxx.p120905;

// 제목 : n의 배수 고르기

class Solution {
    public int[] solution(int n, int[] numlist) {
        int index = 0;

        for (int number : numlist) {
            if (number % n == 0) {
                numlist[index++] = number;
            }
        }

        int[] array = new int[index];
        System.arraycopy(numlist, 0, array, 0, index);
        return array;
    }
}

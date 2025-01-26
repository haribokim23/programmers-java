package p120xxx.p120899;

// 제목 : 가장 큰 수 찾기

class Solution {
    public int[] solution(int[] array) {
        int maxNumber = 0;
        int maxIndex = 0;

        for (int index = 0; index < array.length; index++) {
            int number = array[index];

            if (number > maxNumber) {
                maxNumber = number;
                maxIndex = index;
            }
        }

        return new int[]{maxNumber, maxIndex};
    }
}

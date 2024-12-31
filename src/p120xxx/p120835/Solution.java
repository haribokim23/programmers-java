package p120xxx.p120835;

// 제목 : 진료순서 정하기

class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] orders = new int[length];

        for (int order = 1; order <= length; order++) {
            int maxNumber = 0;
            int maxIndex = 0;

            for (int index = 0; index < length; index++) {
                int number = emergency[index];

                if (number > maxNumber) {
                    maxNumber = number;
                    maxIndex = index;
                }
            }

            emergency[maxIndex] = 0;
            orders[maxIndex] = order;
        }

        return orders;
    }
}

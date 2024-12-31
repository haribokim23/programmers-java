package p120xxx.p120812;

// 제목 : 최빈값 구하기

class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];

        for (int number : array) {
            counts[number]++;
        }

        int maxCount = 0;
        int maxIndex = 0;
        boolean many = false;

        for (int index = 0; index < 1000; index++) {
            int count = counts[index];

            if (count > maxCount) {
                maxCount = count;
                maxIndex = index;
                many = false;
                continue;
            }

            if (count == maxCount) {
                many = true;
            }
        }

        return many ? -1 : maxIndex;
    }
}

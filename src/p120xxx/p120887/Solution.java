package p120xxx.p120887;

// 제목 : k의 개수

class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;

        while (i <= j) {
            int number = i++;

            while (number > 0) {
                if (number % 10 == k) {
                    count++;
                }

                number /= 10;
            }
        }

        return count;
    }
}

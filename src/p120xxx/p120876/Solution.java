package p120xxx.p120876;

// 제목 : 겹치는 선분의 길이

class Solution {
    public int solution(int[][] lines) {
        int length = 0;

        for (int x = -100, previous = 0, overlap; x <= 101; x++) {
            int current = 0;

            for (int index = 0; index < 3; index++) {
                int[] line = lines[index];

                if (line[0] <= x && line[1] >= x) {
                    current += index + 2;
                }
            }

            if (current >= 5) {
                if (current == previous || (previous >= 5 && current == 9) || previous == 9) {
                    overlap = 1;
                } else {
                    overlap = 0;
                }

                if (overlap == 1) {
                    length++;
                }
            }

            previous = current;
        }

        return length;
    }
}

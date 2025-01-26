package p148xxx.p148653;

// 제목 : 마법의 엘리베이터

class Solution {
    public int solution(int storey) {
        int count = 0;

        while (storey != 0) {
            int digit = storey % 10;
            int change = 5 - Math.abs(digit - 5);
            count += change;
            storey = (storey
                    + ((digit == 5 && (storey / 10 % 10) >= 5) || digit > 5 ? 1 : -1) * change)
                    / 10;
        }

        return count;
    }
}

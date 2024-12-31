package p120xxx.p120884;

// 제목 : 치킨 쿠폰

class Solution {
    public int solution(int chicken) {
        int count = 0;

        while (chicken >= 10) {
            count += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }

        return count;
    }
}

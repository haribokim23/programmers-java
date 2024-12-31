package p120xxx.p120837;

// 제목 : 개미 군단

class Solution {
    public int solution(int hp) {
        int count = hp / 5;
        hp %= 5;
        count += hp / 3;
        hp %= 3;
        return count + hp;
    }
}

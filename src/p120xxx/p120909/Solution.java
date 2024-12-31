package p120xxx.p120909;

// 제목 : 제곱수 판별하기

class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return n == sqrt * sqrt ? 1 : 2;
    }
}

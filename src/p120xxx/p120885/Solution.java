package p120xxx.p120885;

// 제목 : 이진수 더하기

class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }
}

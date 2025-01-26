package p120xxx.p120834;

// 제목 : 외계행성의 나이

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while (age > 0) {
            sb.insert(0, (char) (age % 10 + 'a'));
            age /= 10;
        }

        return sb.toString();
    }
}

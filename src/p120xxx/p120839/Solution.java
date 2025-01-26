package p120xxx.p120839;

// 제목 : 가위 바위 보

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < rsp.length(); index++) {
            int value = rsp.charAt(index) - '0';
            sb.append(value == 2 ? 0 : value == 0 ? 5 : 2);
        }

        return sb.toString();
    }
}

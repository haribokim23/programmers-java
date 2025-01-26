package p120xxx.p120892;

// 제목 : 암호 해독

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int index = code - 1; index < cipher.length(); index += code) {
            sb.append(cipher.charAt(index));
        }

        return sb.toString();
    }
}

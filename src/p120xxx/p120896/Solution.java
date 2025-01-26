package p120xxx.p120896;

// 제목 : 한 번만 등장한 문자

class Solution {
    public String solution(String s) {
        int[] count = new int[26];

        for (int index = 0; index < s.length(); index++) {
            count[s.charAt(index) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < 26; index++) {
            if (count[index] == 1) {
                sb.append((char) (index + 'a'));
            }
        }

        return sb.toString();
    }
}

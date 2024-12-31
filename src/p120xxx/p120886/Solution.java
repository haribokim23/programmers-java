package p120xxx.p120886;

// 제목 : A로 B 만들기

class Solution {
    public int solution(String before, String after) {
        int[] beforeCount = new int[26];
        int[] afterCount = new int[26];

        for (int index = 0; index < before.length(); index++) {
            beforeCount[before.charAt(index) - 'a']++;
            afterCount[after.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            if (beforeCount[index] != afterCount[index]) {
                return 0;
            }
        }

        return 1;
    }
}

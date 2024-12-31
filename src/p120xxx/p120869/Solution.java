package p120xxx.p120869;

// 제목 : 외계어 사전

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean used = true;
            for (String s : spell) {
                used &= word.contains(s);
            }

            if (used) {
                return 1;
            }
        }

        return 2;
    }
}

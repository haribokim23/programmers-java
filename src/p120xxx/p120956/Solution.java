package p120xxx.p120956;

// 제목 : 옹알이 (1)

class Solution {
    public int solution(String[] babbling) {
        int count = 0;

        for (String word : babbling) {
            boolean valid = false;

            while (!word.isEmpty()) {
                valid = false;

                for (String s : new String[]{"aya", "ye", "woo", "ma"}) {
                    if (word.startsWith(s)) {
                        valid = true;
                        word = word.substring(s.length());
                        break;
                    }
                }

                if (!valid) {
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}

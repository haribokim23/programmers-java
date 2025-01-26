package p120xxx.p120838;

// 제목 : 모스부호 (1)

import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String solution(String letter) {
        HashMap<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        StringTokenizer st = new StringTokenizer(letter);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            sb.append(morse.get(st.nextToken()));
        }

        return sb.toString();
    }
}

package p072xxx.p072410;

// 제목 : 신규 아이디 추천

import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int index = 0; index < new_id.length() && characters.size() < 15; index++) {
            char character = new_id.charAt(index);

            if (('0' <= character && character <= '9') || character == '-' || character == '_') {
                characters.add(character);
                continue;
            }

            if (character == '.') {
                if (characters.isEmpty() || characters.get(characters.size() - 1) == '.') {
                    continue;
                }

                characters.add(character);
                continue;
            }

            if ('A' <= character && character <= 'Z') {
                character = (char) ((int) character - 'A' + 'a');
            }

            if ('a' <= character && character <= 'z') {
                characters.add(character);
            }
        }

        if (!characters.isEmpty() && characters.get(characters.size() - 1) == '.') {
            characters.remove(characters.size() - 1);
        }

        if (characters.isEmpty()) {
            characters.add('a');
        }

        for (char character = characters.get(characters.size() - 1); characters.size() < 3; ) {
            characters.add(character);
        }

        StringBuilder sb = new StringBuilder();

        for (char character : characters) {
            sb.append(character);
        }

        return sb.toString();
    }
}

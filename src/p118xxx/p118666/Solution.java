package p118xxx.p118666;

// 제목 : 성격 유형 검사하기

class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] points = new int[26];

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];
            char[] types = survey[i].toCharArray();

            if (choice < 4) {
                points[types[0] - 'A'] += 4 - choice;
                continue;
            }

            if (choice == 4) {
                continue;
            }

            points[types[1] - 'A'] += choice - 4;
        }

        return (points['T' - 'A'] > points['R' - 'A'] ? "T" : "R") + (
                points['F' - 'A'] > points['C' - 'A'] ? "F" : "C") + (
                points['M' - 'A'] > points['J' - 'A'] ? "M" : "J") + (
                points['N' - 'A'] > points[0] ? "N" : "A");
    }
}

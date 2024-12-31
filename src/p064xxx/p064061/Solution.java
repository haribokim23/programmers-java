package p064xxx.p064061;

// 제목 : 크레인 인형뽑기 게임

class Solution {
    public int solution(int[][] board, int[] moves) {
        int[] basket = new int[moves.length];
        int index = 0, count = 0;

        for (int move : moves) {
            int column = move - 1;

            for (int j = 0; j < board[0].length; j++) {
                if (board[j][column] != 0) {
                    basket[index] = board[j][column];
                    board[j][column] = 0;

                    if (index > 0 && basket[index] == basket[index - 1]) {
                        count += 2;
                        index -= 1;
                    } else {
                        index++;
                    }

                    break;
                }
            }
        }

        return count;
    }
}

package p120xxx.p120866;

// 제목 : 안전지대

class Solution {
    public int solution(int[][] board) {
        int length = board.length;
        int count = 0;

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                boolean safe = true;

                for (int[] offset : new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0},
                        {-1, 1}, {0, 1}, {1, 1},}) {
                    int x = column + offset[0];
                    int y = row + offset[1];

                    if (x >= 0 && x < length && y >= 0 && y < length && board[y][x] == 1) {
                        safe = false;
                        break;
                    }
                }

                if (safe) {
                    count++;
                }
            }
        }

        return count;
    }
}

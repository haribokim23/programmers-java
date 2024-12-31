package p120xxx.p120861;

// 제목 : 캐릭터의 좌표

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        for (String move : keyinput) {
            int maxX = (board[0] - 1) / 2;
            int maxY = (board[1] - 1) / 2;

            switch (move) {
                case "up":
                    if (y < maxY) {
                        y++;
                    }

                    break;
                case "down":
                    if (y > -maxY) {
                        y--;
                    }

                    break;
                case "left":
                    if (x > -maxX) {
                        x--;
                    }

                    break;
                case "right":
                    if (x < maxX) {
                        x++;
                    }

                    break;
            }
        }

        return new int[]{x, y};
    }
}

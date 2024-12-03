import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                        {'.','.','.','.','5','.','.','1','.'},
                        {'.','4','.','3','.','.','.','.','.'},
                        {'.','.','.','.','.','3','.','.','1'},
                        {'8','.','.','.','.','.','.','2','.'},
                        {'.','.','2','.','7','.','.','.','.'},
                        {'.','1','5','.','.','.','.','.','.'},
                        {'.','.','.','.','.','2','.','.','.'},
                        {'.','2','.','9','.','.','.','.','.'},
                        {'.','.','4','.','.','.','.','.','.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < board.length; i++) {
            HashSet<Character> hashset = new HashSet<>();
            for(int j = 0; j < board[0].length; j++) {
                if(hashset.contains(board[i][j])) {
                    return false;
                }
                else {
                    if(board[i][j] != '.') {
                        hashset.add(board[i][j]);
                    }
                }
            }
        }
        for(int i = 0; i < board.length; i++) {
            HashSet<Character> hashset = new HashSet<>();
            for(int j = 0; j < board[0].length; j++) {
                if(hashset.contains(board[j][i])) {
                    return false;
                }
                else {
                    if(board[j][i] != '.') {
                        hashset.add(board[j][i]);
                    }
                }
            }
        }

//        int p = 0;
//        for(int i = 0; i < 9; i++) {
//            p = i % 3;
//            int q = p;
//            HashSet<Character> hashset = new HashSet<>();
//            if(i % 3 != 0) {
//                q = 0;
//            }
//            for(int j = 3 * q; j < (3 * q) + 3; j++) {
//                for(int k = 3 * p; k < (3 * p) + 3; k++) {
//                    if(hashset.contains(board[j][k])) {
//                        return false;
//                    }
//                    else {
//                        if(board[j][k] != '.') {
//                            hashset.add(board[j][k]);
//                        }
//                    }
//                }
//            }
//        }

        for (int block = 0; block < 9; block++) {
            int startRow = 3 * (block / 3);
            int startCol = 3 * (block % 3);
            HashSet<Character> hashset = new HashSet<>();
            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if (hashset.contains(board[i][j])) {
                        return false;
                    } else {
                        if (board[i][j] != '.') {
                            hashset.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}

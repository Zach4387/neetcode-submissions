class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i)){
                return false;
            }
            if(!isValidCol(board, i)){
                return false;
            }            
        }
        if(!isValidBox(board)){
                return false;
            }

        return true;

    }

    public boolean isValidRow(char[][] board, int r) {
        //board[row][col]
        HashSet<Character> entries = new HashSet<>();
        
        for(int i = 0; i < 9; i++){
            char c = board[r][i];
            if(c == '.') continue;
            else{
                if (entries.contains(c)) return false;
                else {
                    entries.add(c);
                }
            }   
        }
        return true;
    }

    public boolean isValidCol(char[][] board, int col) {
         HashSet<Character> entries = new HashSet<>();
        char c;
        for(int i = 0; i < 9; i++){
             c = board[i][col];
            if(c == '.') continue;
            else{
                if (entries.contains(c)) return false;
                else {
                    entries.add(c);
                }
            }   
        }
        return true;
    }

    public boolean isValidBox(char[][] board) {

        if(!isValidBox(board, 0,2, 0, 2)) return false;
        if(!isValidBox(board, 0,2, 3, 5)) return false;
        if(!isValidBox(board, 0,2, 6, 8)) return false;
        if(!isValidBox(board, 3,5, 0, 2)) return false;
        if(!isValidBox(board, 3,5, 3, 5)) return false;
        if(!isValidBox(board, 3,5, 6, 8)) return false;
        if(!isValidBox(board, 6,8, 0, 2)) return false;
        if(!isValidBox(board, 6,8, 3, 5)) return false;
        if(!isValidBox(board, 6,8, 6, 8)) return false;

        return true;
        
    }

    public boolean isValidBox(char[][] board, int rs, int re, int cs, int ce) {
        HashSet<Character> entries = new HashSet<>();    
       for (int r = rs; r <= re; r++) {
            for (int c = cs; c <= ce; c++) {
                char val = board[r][c];
                if (val == '.') continue;
                if (!entries.add(val)) return false; // .add() returns false if the item exists
            }
        }
        return true;
    }
}

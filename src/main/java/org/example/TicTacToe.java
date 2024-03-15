package org.example;

public class TicTacToe {
    private int[][] board = new int[3][3];

    // O - 1
    // X - 2
    // space - 0
    public void putO(int x, int y){
        board[x][y] = 1;
    }

    public void putX(int x, int y){
        board[x][y] = 2;
    }

    /**
     * Checks if someone won.
     * @return "O" - if circle wins and "X" if x wins. If nobody wins, returns null.
     */
    public String checkWin(){
        for(int y = 0; y < board.length;y++){
            int countX = 0;
            int countO = 0;
            for(int x = 0; x < board.length;x++){
                if(board[x][y] == 1){
                    countO++;
                } else if (board[x][y] == 2) {
                    countX++;
                }
            }

            if(countO >= 3){
                return "O";
            } else if(countX >= 3){
                return "X";
            }
        }

        for(int x = 0; x < board.length;x++){
            int countX = 0;
            int countO = 0;
            for(int y = 0; y < board.length;y++){
                if(board[x][y] == 1){
                    countO++;
                } else if (board[x][y] == 2) {
                    countX++;
                }
            }

            if(countO >= 3){
                return "O";
            } else if(countX >= 3){
                return "X";
            }
        }

        int countX = 0;
        int countO = 0;

        for(int i = 0; i < board.length;i++){
            if(board[i][i] == 1){
                countO++;
            } else if(board[i][i] == 2){
                countX++;
            }
        }

        if(countO >= 3){
            return "O";
        } else if(countX >= 3){
            return "X";
        }

        return null;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
}

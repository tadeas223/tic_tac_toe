package org.example;

public class DrawBoard {
    private final TicTacToe ticTacToe = new TicTacToe();

    public void printBoard() {
        System.out.println("  A B C");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(ticTacToe.getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }
}

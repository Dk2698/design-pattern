package com.kumar.problem.tictac;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Board gameBoard;
    Deque<Player> players;

    TicTacToeGame() {
        initalizeGame();
    }

    private void initalizeGame() {
        players = new LinkedList<>();
        PlayingPiece crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPiece noughtPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame() {

        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();

            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + playerTurn.getPlayerName() + " Enter row, column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);


            boolean pieceAddedSucessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());

            if (!pieceAddedSucessfully) {
                System.out.println("incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            //check winner
            boolean winner = checkWinner(inputRow, inputColumn, playerTurn.getPlayingPiece());

            if (winner) {
                return playerTurn.getPlayerName();
            }
        }

        return "tie";
    }

    private boolean checkWinner(int row, int column, PlayingPiece playingPiece) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // check row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i] != playingPiece) {
                rowMatch = false;
            }
        }

        // check column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column] != playingPiece) {
                columnMatch = false;
            }
        }
        // check anti diagonal
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != playingPiece) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != playingPiece) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}

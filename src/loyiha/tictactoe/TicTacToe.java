package loyiha.tictactoe;

import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyiha.tictactoe
 * Class Name -> TicTacToe
 * Copyright © : 8/29/2022
 */
public class TicTacToe {

        public static void main(String[] args) {
            startGame();
        }
        public static void startGame() {
            char[][] gameBoard = {
                    {'x', 'o', 'x'},
                    {'o', 'o', 'x'},
                    {'x', 'x', 'o'}
            };
            showBoard(gameBoard);

            // toki o'yin tugamagunga qadar davom etadi
            while (gameFinish(gameBoard)) {
                if (gameFinish(gameBoard)) { //
                    System.out.println("Player2 Yutdi");
                } else {
                    gameBoard = setX(gameBoard);
                    showBoard(gameBoard);
                }
                if (gameFinish(gameBoard)) {
                    System.out.println("Player 1 Yutdi");
                } else {
                    gameBoard = setO(gameBoard);
                    showBoard(gameBoard);
                }
            }
        }

        private static char[][] setO(char[][] board) {
            Scanner scanner = new Scanner(System.in);
            int x, y;
            do {
                System.out.println("o kordinatasini kiriting");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (board[x][y] != ' ');
            board[x][y] = 'o';
            return board;
        }

        public static char[][] setX(char[][] board) {
            Scanner scanner = new Scanner(System.in);
            int x, y;
            do {
                System.out.println("x kordinatasini kiriting");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (board[x][y] != ' ');
            board[x][y] = 'x';
            return board;
        }

        public static void showBoard(char[][] board) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print("|" + board[i][j]);
                }
                System.out.println("|");
            }
        }

        /**
         * x x x
         * o x o
         * o o x
         **/
        // end game holatini aniqlaymiz
        public static boolean gameFinish(char[][] matrix) {
            // x yutgan bo'lsa
            if (matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2])
                return true;
            if (matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2])
                return true;
            if (matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2])
                return true;

            // ustunlar bo'yicha
            if (matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0])
                return true;
            if (matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1])
                return true;
            if (matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2])
                return true;

            // asosiy diogonal bo'yicha
            if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2])
                return true;

            // yordamchi diogonal
            if (matrix[2][0] == matrix[1][1] && matrix[1][1] == matrix[0][2])
                return true;

            // birorta bo'sh joy qolmasa ham o'yin tugaydi
            return false;
        }

        // o'yin tugash holati
        // agar x yutgan bo'lsa, o'yin tugaydi
        // agar o yutgan bo'lsa, o'yin tugaydi
        // agar durang bo'lsa, o'yin tugaydi

        public static boolean xWIN(char[][] matrix) {

            return false;
        }

        public static boolean oWIN(char[][] board) {
            return false;
        }

        public static boolean isDraw(char[][] board) {
            return false;
        }

    }


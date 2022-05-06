import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;
    private String[][] map;
    private String[][] board;
    private int size;
    private int numberOfMine;
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.board = new String[row][col];
        this.size = row * col;
        this.numberOfMine = size / 4;
        for (int i = 0; i < row; i++)
            Arrays.fill(this.map[i], "0");
    }

    public void run() {
        prepareGame();
        print(map);
        System.out.println();
        game(map);
    }

    public void prepareGame() {
        int rowNum, colNum, tmp = numberOfMine;
        while (tmp != 0) {
            rowNum = rand.nextInt(row);
            colNum = rand.nextInt(col);
            if (map[rowNum][colNum] != "-1") {
                map[rowNum][colNum] = "-1";
                tmp--;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = "-";
            }
        }
    }

    public void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != "-1") {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void game(String arr[][]) {
        if (isWin(board) == true) {
            System.out.println("Win !");
            print(board);
        } else {
            print(board);
            int row, col;
            System.out.println("Please select a coordinate ! ");
            System.out.print("Row :");
            row = scanner.nextInt();
            System.out.print("Col :");
            col = scanner.nextInt();

            if (arr.length < row - 1 || arr[0].length < col - 1 || row - 1 < 0 || col - 1 < 0) {
                System.out.println("You've gone beyond the limits of the game. Please choose again!");
                game(map);
            } else if (arr[row - 1][col - 1] == "-1") {
                System.out.println("Game Over ! ");
                print(map);
            } else if (arr[row - 1][col - 1] == "0") {
                check(row - 1, col - 1);
                game(map);
            }
        }
    }

    public void check(int row, int col) {
        int count = 0;
        if (map[row][col] == "0") {
            if ((row + 1) < map.length && map[row + 1][col] == "-1") {
                count++;
            }
            if ((row - 1) > -1 && map[row - 1][col] == "-1") {
                count++;
            }
            if ((col - 1) > -1 && map[row][col - 1] == "-1") {
                count++;
            }
            if ((col + 1) < map[0].length && map[row][col + 1] == "-1") {
                count++;
            }
            board[row][col] = Integer.toString(count);

        }
    }

    public boolean isWin(String[][] arr) {
        int mineCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == "-") {
                    mineCount++;
                }
            }
        }
        if (mineCount != numberOfMine) {
            return false;
        }
        return true;
    }
}

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        computerMove('O');
        printBoard();
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == '-';
    }

    static void placeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
        }
    }

    static void computerMove(char symbol) {
        int row, col;

        do {
            int move = (int)(Math.random() * 9); 
            row = move / 3;
            col = move % 3;
        } while (!isValidMove(row, col));

        placeMove(row, col, symbol);
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

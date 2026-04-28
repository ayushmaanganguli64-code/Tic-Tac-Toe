
public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    
    public static void main(String[] args) {
        System.out.println("Is Draw: " + isDraw());
    }

   
    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {  
                    return false;
                }
            }
        }

        return true; 
    }
}

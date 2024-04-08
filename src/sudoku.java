import java.util.Scanner;

public class sudoku {

    private static boolean checkSudoku(int[][] solved, int[][] unsolved){
      return false;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();

        for(int t = 0;t<T;t++){
            int[][] solved = new int[9][9];
            int[][] unsolved = new int[9][9];

            for(int i =0; i<9;i++){
                for(int j = 0;j<9;j++){
                    solved[i][j] = scnr.nextInt();
                }
            }

            for(int i =0; i<9;i++){
                for(int j = 0;j<9;j++){
                    unsolved[i][j] = scnr.nextInt();
                }
            }
            System.out.println(checkSudoku(solved, unsolved)? "Yes" : "No");
        }
        scnr.close();
    }
}

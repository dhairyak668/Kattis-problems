package thisaintyourgrandpascheckerboard;
/**
 * @author Dhairya Kachalia
 * net id: dhairyk@iasate.edu
 * question: https://open.kattis.com/problems/thisaintyourgrandpascheckerboard
 */
import java.util.Scanner;
public class thisaintyourgrandpascheckerboard {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = Integer.valueOf(scnr.nextLine());
        boolean[][] grid = new boolean[n][n];
        for(int i =0;i<n;i++){
            String line = scnr.nextLine();
            for(int j=0;j<n;j++){
                if(line.charAt(j)=='W'){
                    grid[i][j]=true;
                }
                else if(line.charAt(j)=='B'){
                    grid[i][j]=false;
                }
            }
        }
        System.out.println(checkAll(grid,n) ? 1:0);
    }

    private static boolean checkrow(boolean[][] grid, int row,int n){
        int b =0;
        int w=0;
        int max = n/2;
        for(int i=0;i<n;i++){
            if(grid[row][i]){
                w++;
            }
            else{
                b++;
            }
            if(b>max || w >max){
                return false;
            }
        }
        return true;
    }

    private static boolean checkcol(boolean[][] grid, int col, int n){
        int b =0;
        int w =0;
        int max = n/2;
        for(int i=0;i<n;i++){
            if(grid[i][col]){
                w++;
            }
            else {
                b++;
            }
            if(b>max || w >max){
                return false;
            }
        }
        return true;
    }
    private static boolean checktriple(boolean[][] grid, int row,int col, int n){
        boolean val = grid[row][col];
        if(col<n-3){
            if(grid[row][col+1]==val &&grid[row][col+2]==val){
                return false;
            }
        }
        if(row<=n-3){
            if(grid[row+1][col]==val && grid[row+2][col]==val){
                return false;
            }
        }
        return true;
    }

    private static boolean checkAll(boolean[][] grid, int n){
        boolean checkedcol=false;
        for(int i=0;i<n;i++){
            if(!checkrow(grid,i,n)) return false;
            for(int j =0;j<n;j++){
                if(!checkedcol){
                    if(!checkcol(grid,j,n)) return false;
                }
                if(!checktriple(grid,i,j,n)) return false;
            }
        }
        return true;
    }
}

package Parking;

import java.util.Arrays;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] dimension = scnr.nextLine().split("");
        //get the dimentions of the grid from line 1
        int[][] grid = new int[Integer.parseInt(dimension[0])][Integer.parseInt(dimension[2])];
    }
}

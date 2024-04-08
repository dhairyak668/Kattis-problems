import java.util.Scanner;

/**
 * @author Dhairya Kachalia
 * net id: dhairyk@iasate.edu
 * question: https://open.kattis.com/problems/somesum
 */
public class somesum {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        if(n%2 ==0){
            if((n/2)%2 ==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Even");
            }
        }
        else{
            System.out.println("Either");

        }
    }
}

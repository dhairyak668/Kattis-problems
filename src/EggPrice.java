import java.util.Scanner;

public class EggPrice {

    static double totalPrice;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How Many Eggs? ");
        int totalEggs = scnr.nextInt();
        System.out.println("Do ou want Brown Eggs? ");
        boolean isBrown = scnr.next().toLowerCase().equals("yes");

        int flats = totalEggs/30;
        totalEggs %= 30;
        int dozens = totalEggs/12;
        totalEggs %=12;
        int halfDozens = totalEggs/6;
        totalEggs %=6;

        if(totalEggs >6 && totalEggs<12) dozens++;
        else if (totalEggs>0 && totalEggs < 6) {
            halfDozens++;
        }
        totalPrice = (flats * 6.5) + (dozens * 3) + (halfDozens * 2);
        if(isBrown) totalPrice *= 1.2;

        System.out.println(flats + " flats");
        System.out.println(dozens + " dozens");
        System.out.println(halfDozens + " half dozens");
        System.out.println("Price: " + totalPrice);


    }
}

package Parking;

import java.util.Arrays;
import java.util.Scanner;

public class Parking2 {
    private static int[] prices;
    private static int maxTime;
    private static int[][] vehicleTimes;
    private static int money;
    private static double time;

    public static void main(String[] args) {
        getPrices();
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.deepToString(vehicleTimes));
        System.out.println("Max Time: " + maxTime);
        calculateMoney(prices, vehicleTimes);
        System.out.println("moneyyyy: " + money);
    }

    private static void getPrices() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numVehicles = 3; // Number of vehicles is always 3 according to the problem statement
            prices = new int[numVehicles];
            for (int i = 0; i < numVehicles; i++) {
                prices[i] = scanner.nextInt();
            }
            vehicleTimes = new int[numVehicles][2];
            for (int i = 0; i < numVehicles; i++) {
                vehicleTimes[i][0] = scanner.nextInt();
                vehicleTimes[i][1] = scanner.nextInt();
                maxTime = Math.max(maxTime, vehicleTimes[i][1]);
            }
        }
    }

    private static void calculateMoney(int[] prices, int[][] vehicleTimes) {
        int numVehicles = prices.length;
        int numVehiclesParked = 0;
        time = 1.5;

        while (time <= maxTime) {
            int i = 0;
            while (i < numVehicles) {
                if (vehicleTimes[i][0] <= time && time <= vehicleTimes[i][1]) {
                    numVehiclesParked++;
                }
                i++;
            }
            money += (numVehiclesParked != 0) ? numVehiclesParked * prices[numVehiclesParked - 1] : 0;
            numVehiclesParked = 0;
            time++;
        }
    }
}

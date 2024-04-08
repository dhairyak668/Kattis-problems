import java.util.Scanner;

/**
 * @author 
 * net id: 
 * question: https://open.kattis.com/problems/parking
 */
public class parking {

    private static int[] prices = new int[3];
    private static int[][] vehicleTimes = new int[3][2];
    private static int minTime = 0;
    private static int maxTime = 0;
    private static int money = 0;
    private static double time;


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] line1 = scnr.nextLine().split(" ");
        prices[0] = Integer.parseInt(line1[0]);
        prices[1] = Integer.parseInt(line1[1]);
        prices[2] = Integer.parseInt(line1[2]);
        importTimes(scnr, vehicleTimes);
        calculateMoney(prices, vehicleTimes);
        System.out.println(money);


    }

    public static void importTimes(Scanner scnr, int[][] vehicleTimes) {
        int count = 0;
        while (count < 3) {
            String line = scnr.nextLine();
            Scanner intScanner = new Scanner(line);
            vehicleTimes[count][0] = intScanner.nextInt();
            vehicleTimes[count][1] = intScanner.nextInt();
            minTime = minTime == 0 ? vehicleTimes[count][0]
                    : Math.min(minTime, vehicleTimes[count][0]);
            maxTime = Math.max(maxTime, vehicleTimes[count][1]);
            count++;
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



public class ParkingMeter {
    final int MAXTIME;
    final int MPQ;
    double money;
    int time;
    public ParkingMeter(int minutesPerQuarter, int maximumTime) {
        MAXTIME = maximumTime;
        MPQ = minutesPerQuarter;
    }
    public void insertCoin(int howMany){
        money += howMany*0.25;
        time = Math.min(MPQ * howMany, MAXTIME);
    }

    public int getTimeRemaining(){
        return time;
    }
    public void passTime(int minutes){
        time = Math.max(time-minutes,0);
    }
    public double getTotal(){
        return money;
    }

    public static void main(String[] args) {
        ParkingMeter p = new ParkingMeter(15,60);
        p.insertCoin(3);
        p.passTime(20);
        System.out.println("Time Remaining: "+p.getTimeRemaining() + " expected : 25");
        System.out.println("total money "+p.getTotal() + " expected: 0.75");
        p.insertCoin(4);
        p.passTime(90);
        System.out.println("Time Remaining: "+p.getTimeRemaining() + " expected : 0");
        System.out.println("total money "+p.getTotal() + " expected: 1.75");
    }

}

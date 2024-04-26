import java.util.Arrays;
import java.util.Scanner;

public class diehard {
    static int count =0;
    static int count0 =0;
    static int count1 =0;
    static int count2 =0;
    static int equals0 =0;
    static int equals1 =0;
    static int equals2 = 0;
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[][] nums = new int[3][6];
//
        for(int i =0; i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(scnr.hasNextInt()){
                    nums[i][j] = scnr.nextInt();
                }
            }
        }
        int index =0;
        int equals = 0;
        for(index =0;index< nums[0].length;index++){
            for(int i =0;i<nums[0].length;i++){
                if(nums[0][index]>nums[1][i]){
                    count++;
                }
                else if(nums[0][index]==nums[1][i]){
                    equals++;
                }
            }
            for(int i =0;i<nums[0].length;i++){
                if(nums[0][index]>nums[2][i]){
                    count++;
                }
                else if(nums[0][index]==nums[2][i]){
                    equals++;
                }
            }
        }
        count0 = count;
        equals0 =equals;

        index =0;
        count = 0;
        equals = 0;
        for(index =0;index< nums[0].length;index++){
            for(int i =0;i<nums[0].length;i++){
                if(nums[1][index]>nums[0][i]){
                    count++;
                }
                else if(nums[1][index]==nums[0][i]){
                    equals++;
                }
            }
            for(int i =0;i<nums[0].length;i++){
                if(nums[1][index]>nums[2][i]){
                    count++;
                }
                else if(nums[1][index]==nums[2][i]){
                    equals++;
                }
            }
        }
        count1 = count;
        equals1 =equals;
        count = 0;
        equals = 0;
        for(index =0;index< nums[0].length;index++){
            for(int i =0;i<nums[0].length;i++){
                if(nums[2][index]>nums[0][i]){
                    count++;
                }
                else if(nums[2][index]==nums[0][i]){
                    equals++;
                }
            }
            for(int i =0;i<nums[0].length;i++){
                if(nums[2][index]>nums[1][i]){
                    count++;
                }
                else if(nums[2][index]==nums[1][i]){
                    equals++;
                }
            }
        }
        count2 = count;
        equals2 =equals;

        //if all 3 same array
        if(Arrays.equals(nums[1],nums[2]) && Arrays.equals(nums[1],nums[0])){
            System.out.println(passCheck(0) ? 1 : "No dice");
            return;
            }

        //if 2 same
        if(Arrays.equals(nums[1],nums[0])){
            System.out.println(passCheck(2) && count2 > count1 ? 3 : "No dice");
            return;
        }
        else if(Arrays.equals(nums[0],nums[2])){
            System.out.println(passCheck(1) && count1 > count0 ? 2 : "No dice");
            return;
        }
        else if(Arrays.equals(nums[1],nums[2])){
            System.out.println(passCheck(0) && count0 > count1 ? 1 : "No dice");
            return;
        }

        //if all three counts are same
        if(count1 == count2 && count1 == count0){
            System.out.println("No dice");
            return;
        }

        //if 2 counts are same
        if(count0 == count1){
            System.out.println(passCheck(2) && count2 > count1 ? 3 : passCheck(0) ? 1 :"No dice");
            return;
        }
        else if(count0 == count2){
            System.out.println(passCheck(1) && count1 > count0 ? 2 : passCheck(0) ? 1 :"No dice");
            return;
        }
        else if(count2 == count1){
            System.out.println(passCheck(0) && count0 > count1 ? 1 : passCheck(1) ? 2 :"No dice");
            return;
        }
        if(count0 != count1 && count0 != count2 && count2 != count1) {
            count = Math.max(count0, count1);
            count = Math.max(count, count2);

            if (count == count0 && count >= (72 - equals0) / 2) System.out.println(1);
            else if (count == count1 && count >= (72 - equals1) / 2) System.out.println(2);
            else if (count == count2 && count >= (72 - equals2) / 2) System.out.println(3);
            else System.out.println("No dice");
        }
        }

    static boolean passCheck(int n){
        if(n==0) return count0 >=(72- equals0)/2;
        else if (n==1) return count1 >=(72- equals1)/2;
        else return count2 >=(72- equals2)/2;
    }

}
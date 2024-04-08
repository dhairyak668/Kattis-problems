package diehard;

import java.util.Arrays;
import java.util.Scanner;

public class diehard {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int count =0;
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int equals1 =0;
        int equals2 =0;
        int equals3 = 0;
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
        count1 = count;
        equals1=equals;

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
        count2 = count;
        equals2=equals;
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
        count3 = count;
        equals3 =equals;
        if((count1 == count2 || count1 == count3 || count2==count3)
                &&
                !(Arrays.equals(nums[0],nums[1])
                &&Arrays.equals(nums[0],nums[2])
                &&Arrays.equals(nums[2],nums[1]))){
                System.out.println("No dice");
        }
        else{
            if(count1 == count2 && count1>=(72-equals1)/2)System.out.println(1);
            else if (count1 == count3 && count1>=(72-equals1)/2) System.out.println(1);
            else if (count2==count3 && count2 >=(72-equals2)/2) System.out.println(2);
            else{
            count = Math.max(count1,count2);
            count = Math.max(count,count3);

            if(count == count1 && count>=(72-equals1)/2) System.out.println(1);
            else if (count == count2 && count >=(72-equals2)/2) System.out.println(2);
            else if (count == count3 && count >=(72-equals3)/2) System.out.println(3);
            else System.out.println("No dice");
            }
        }
    }

}
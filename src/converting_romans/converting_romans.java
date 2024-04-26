package converting_romans;

import java.util.Scanner;

public class converting_romans {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = Integer.valueOf(scnr.nextLine());
        int concurring_sum = 0;
        int sum =0;
        for(int i =0;i<n;i++){
            String line = scnr.nextLine();
            int preVal = 0;
            for(int j = 0; j<line.length();j++){
                switch (line.charAt(j)){
                    case 'I':
                        preVal = 1;
                        concurring_sum++;
                        break;
                    case 'V':
                        if(preVal< 5){
                            sum += 5-concurring_sum;
                            concurring_sum = 5 - concurring_sum;
                        } else if (preVal ==5) {
                            concurring_sum +=5;
                        } else {
                            concurring_sum =0;
                        }
                        preVal = 5;
                        break;
                    case 'X':
                        if(preVal<10){
                            sum += 10 - concurring_sum;
                            concurring_sum = 10 - concurring_sum;
                        }
                        else if (preVal ==10) {
                            sum +=10;
                            concurring_sum +=10;
                        }
                        else {
                            sum +=10;
                            concurring_sum +=10;
                        }
                        preVal = 10;
                        break;
                    case 'L':
                        if(preVal<50){
                            sum += 50 - concurring_sum;
                            concurring_sum = 50 - concurring_sum;
                        }
                        else if (preVal ==50) {
                            concurring_sum +=50;
                        }
                        else {
                            concurring_sum +=50;
                        }
                        preVal = 50;
                        break;
                    case 'C':
                        if(preVal<100){
                            sum += 100 - concurring_sum;
                            concurring_sum = 100 - concurring_sum;
                        }
                        else if (preVal ==100) {
                            concurring_sum +=100;
                        }
                        else {
                            concurring_sum +=100;
                        }
                        preVal = 100;
                        break;
                    case 'D':
                        if(preVal<500){
                            sum += 500 - concurring_sum;
                            concurring_sum = 500 - concurring_sum;
                        }else if (preVal ==500) {
                            concurring_sum +=500;
                        }
                        else {
                            concurring_sum +=500;
                        }
                        preVal = 500;
                        break;
                    case 'M':
                        if(preVal<1000){
                            sum += 1000 - concurring_sum;
                            concurring_sum = 1000 - concurring_sum;
                        }else if (preVal ==1000) {
                            concurring_sum +=1000;
                        }
                        else {
                            concurring_sum +=1000;
                        }
                        preVal = 1000;
                        break;
                }
            }

        }
    }
}

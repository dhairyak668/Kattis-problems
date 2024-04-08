package _10kindsOfPeople;

public class patterns{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j =0;j<i+1;j++){
                int x= 0;
                for(int k =0; k<j;k++){
                    x=x+n-k;
                }
                if(j%2==0){
                    System.out.print(x+i-j+1+" ");
                }
                else System.out.print(x+n-i+" ");
            }
            System.out.println();
        }
    }
}
package Pepcoding;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        for (int i=1;i<=t;i++){
            int n=sc.nextInt();
            int c=0;

            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }


        }


    }

}

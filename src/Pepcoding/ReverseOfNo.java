package Pepcoding;

import java.util.Scanner;

public class ReverseOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
    }
}

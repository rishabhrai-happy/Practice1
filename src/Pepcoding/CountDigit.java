package Pepcoding;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while (n>0){
            int ld=n%10;
            n=n/10;
            c++;
        }
        System.out.println(c);
    }
}

package ROOM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter ac :");
        String acCondition = scanner.nextLine();
        System.out.println("enter home th: ");
        String htCondition = scanner.nextLine();
        System.out.println("enter fan :");
        String fCondition = scanner.nextLine();
        System.out.println("enter light: ");
        String lCondition = scanner.nextLine();
        int sum = 0;
        Room room = new Room(acCondition,htCondition,fCondition,lCondition);
        if(room.AC_ON()){
            sum+=1200;
        }
        if(room.HOME_THEATRE_ON()){
            sum+=600;
        }
        if(room.FAN_ON()){
            sum+=400;
        }
        if(room.LIGHT_ON()){
            sum+=100;
        }
        if (sum > 2000){
            System.out.println("Overload");
        } else {
            System.out.println("the power consumption is :" + sum);
        }
    }
}

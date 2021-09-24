package Random;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class RandomInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            Random obj = new Random();
            int l = s.nextInt();
            Integer a[] = new Integer[l];
            TreeSet<Integer> ab = new TreeSet<>();
            int range = (10 * 1) - 1;
            for (int i = 0; i < l; i++) {
                int a1 = obj.nextInt(range);
                System.out.println(a1);
                if (a1 >= 0 && a1 <= (10 * 1) - 1) {
                    ab.add(a1);
                }
            }
            System.out.println(ab);
            a = ab.toArray(a);
            System.out.println("Hello world");
            for (int i : a) System.out.println(i);
    }
}

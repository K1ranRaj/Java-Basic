//In this challenge, you must read an integer, a double, and a String from stdin, then print the values.

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

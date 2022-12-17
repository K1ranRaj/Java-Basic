// Java's System.out.printf function can be used to print formatted output. Every line of input will contain a String followed by an integer.
// Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
      
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                if(x<100){
                    System.out.printf("%-15s%03d\n",s1,x);
                }
                else{
                    System.out.printf("%-15s%3d\n",s1,x);
                }
            }
            System.out.println("================================");
    }
}

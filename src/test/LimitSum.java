package test;

import java.util.Scanner;

public class LimitSum {
    public static void main(String[] args){
        // give 2 numbers & get the sum of all numbers within that numbers
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter to numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int sum=0;
        for(int i=Math.min(num1, num2);i<=Math.max(num1,num2);i++){
            sum=sum+i;
        }
        System.out.println("The Sum is: "+sum);
    }
}

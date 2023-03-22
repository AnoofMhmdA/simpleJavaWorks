package test;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class StarPattern {
    public static void main(String[] args){
        // simple star pyramid pattern
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row=scanner.nextInt();
        for (int i=0;i<row;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

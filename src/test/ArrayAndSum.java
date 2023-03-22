package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndSum {
    // create an array of integers & perform its sum.
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit=scanner.nextInt();
        int[] arr=new int[limit];
        for (int i=0;i<limit;i++){
            System.out.println("Enter Numbers:");
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("The Sum is: "+Arrays.stream(arr).sum());
    }
}

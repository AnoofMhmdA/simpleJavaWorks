package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// create an array & sort it in ascending & descending order

public class ArrayAndSort {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit=scanner.nextInt();
        String[] arr=new String[limit];
        for (int i=0;i<limit;i++){
            System.out.println("Enter Words: ");
            arr[i]=scanner.next();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        //sort in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        //sort in descending order
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

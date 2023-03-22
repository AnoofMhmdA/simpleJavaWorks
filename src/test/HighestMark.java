package test;

import java.util.Scanner;

public class HighestMark {
    //create an array of student name & marks & find the highest marks.
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit=scanner.nextInt();
        StudentDetails[] arr=new StudentDetails[limit];
        for (int i=0;i<limit;i++){
            System.out.println("Enter name: ");
            String name=scanner.next();
            scanner.nextLine();
            System.out.println("Enter marks: ");
            int mark=scanner.nextInt();
            arr[i]=new StudentDetails(name,mark);
        }
        StudentDetails highest=arr[0];
        for (int i=1;i<limit;i++){
            if(arr[i].getMark()> highest.getMark()){
                highest=arr[i];
            }
        }
        System.out.println(highest.getName()+" has the highest marks & the mark is: "+highest.getMark());
    }
}

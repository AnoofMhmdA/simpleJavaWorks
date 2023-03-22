package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByMarks {
    public static void main(String[] args){
        //create an arrayList of student name & marks, find the highest marks, sort the list according to the ascending order of marks.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit=scanner.nextInt();
        ArrayList<StudentDetails> studentDetailsArrayList=new ArrayList<>();
        for (int i=0; i<limit; i++){
            System.out.println("Enter Name: ");
            String name=scanner.next();
            scanner.nextLine();
            System.out.println("Enter Marks: ");
            int mark=scanner.nextInt();
            StudentDetails studentDetails=new StudentDetails(name,mark);
            studentDetailsArrayList.add(studentDetails);
        }
        studentDetailsArrayList.forEach(studentDetails ->
                System.out.println(studentDetails.getName()+" "+studentDetails.getMark()));
        System.out.println(" ");
        Collections.sort(studentDetailsArrayList, StudentDetails.comparator);
        System.out.println(Collections.max(studentDetailsArrayList, StudentDetails.comparator).getName()+
                Collections.max(studentDetailsArrayList, StudentDetails.comparator).getMark());
        System.out.println(" ");
        studentDetailsArrayList.forEach(studentDetails ->
                System.out.println(studentDetails.getName()+" "+studentDetails.getMark()));
    }
}

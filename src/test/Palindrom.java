package test;

import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        //to check whether a word is palindrome or not..
        boolean status=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String word=scanner.next().toLowerCase(Locale.ROOT);
        int length=word.length();
        for (int i=0;i<length/2;i++){
            if (word.charAt(i)!=word.charAt(length-i-1)){
                status=false;
            }
        }
        System.out.println("Is Palindrome: "+status);
    }
}

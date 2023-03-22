package test;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args){
        //string reversal
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scanner.next();
        String newWord=" ";
        char ch;
        int length=word.length();
        for(int i=0; i<length; i++){
            ch=word.charAt(i);
            newWord=ch+newWord;
        }
        System.out.println("The Reverse word is: "+newWord);
    }
}

package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        char word = s.next().charAt(0);
        // write your code here
        int count = 0;
        char[] senArr = new char[sentence.length()];
        for(int i=0 ; i<sentence.length(); i++){
            senArr[i] = sentence.charAt(i);
        }
        for (char item:senArr){
            if (item==word){
                count++;
            }
        }
        System.out.println(count);
    }
        // TODO: Display number of times the character appears.
}
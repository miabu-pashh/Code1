package Day6;


import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution6{

    public static int part2(String line){
        String result = "";
          int j=0;
            for (int i = 0; i < line.length() - 13; i++) {
                char[] chars = line.substring(i, i + 14).toCharArray();
                Set<Character> uniqueChars = new HashSet<Character>();

                for (char c : chars) {
                    uniqueChars.add(c);
                }

                if (uniqueChars.size() == 14) {

                    result = line.substring(i, i + 14);
                    j=i+14;
                    break;
                }
            }

        return j;
    }

    public static int part1(String line){
        char[] s=line.toCharArray();
            
            String result = "";
          int j=0;
            for (int i = 0; i < line.length() - 3; i++) {
                char[] chars = line.substring(i, i + 4).toCharArray();
                Set<Character> uniqueChars = new HashSet<Character>();

                for (char c : chars) {
                    uniqueChars.add(c);
                }

                if (uniqueChars.size() == 4) {

                    result = line.substring(i, i + 4);
                    j=i+4;
                    break;
                }
            }
            System.out.println(result);


        return j;

    }


    public static void main(String []args) {

        try{
        Scanner sc=new Scanner(new File("Day6/input6.txt"));

        while(sc.hasNextLine()){

            String line=sc.nextLine();
            int j=part1(line);
            int n=part2(line);
            // System.out.println(line);
            
            System.out.println("part 1 answer is : "+j);
            System.out.println("patrt 2 answer is : "+n);

        }


        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        
    }
}
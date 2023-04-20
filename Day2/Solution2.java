import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Solution2{
    public static int win = 6;
        public static int tie = 3;
        public static int lose = 0;
    
        public static int rock = 1;
        public static int paper = 2;
        public static int scissors = 3;
    public static int method1(String val){
        // HashMap<String, Integer> hs=new HashMap<String,Integer>();
        //A->ROCK
        //B->PAPER
        //C->SCICCOR
        //X->ROCK
        //Y->PAPER
        //Z->SCISSOR

        HashMap<String, Integer> results = new HashMap<String, Integer>();
        results.put("A Y", win + paper);  // A - rock, Y - paper
        results.put("A X", tie + rock);  //           X - Rock
        results.put("A Z", lose + scissors); //          Z - scissors
        results.put("B Y", tie + paper);  // B - paper
        results.put("B X", lose + rock);
        results.put("B Z", win + scissors);
        results.put("C Y", lose + paper); // C - scissors
        results.put("C X", win + rock);
        results.put("C Z", tie + scissors);
        return results.get(val);
        }
        public static int method2(String value){
            HashMap<String, Integer> results = new HashMap<String, Integer>();
            results.put("A Y", tie + rock);  // A - rock
            results.put("A X", lose + scissors);  //           X - Rock
            results.put("A Z", win + paper); //          Z - scissors
            results.put("B Y", tie + paper);  // B - paper
            results.put("B X", lose + rock);
            results.put("B Z", win + scissors);
            results.put("C Y", tie + scissors); // C - scissors
            results.put("C X", lose + paper);
            results.put("C Z", win + rock);      
            return results.get(value);  
        }
    public static void main(String []args){
        int part1=0;
        int part2=0;
        try{
            Scanner sc=new Scanner(new File("Day2/input2.txt"));
            
            while(sc.hasNext()){
                String line=sc.nextLine();
                int p=method1(line);
                int q=method2(line);
                part1+=p;
                part2+=q;
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(part1);
        System.out.println(part2);


    }

}
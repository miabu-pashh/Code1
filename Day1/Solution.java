import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution{
    public static void main(String []args){
        ArrayList<Integer> calories=new ArrayList<Integer>();
        int maxSum=0;
        try{
            Scanner sc=new Scanner(new File("Day1/input.txt"));
            while(sc.hasNext()){
                String line=sc.nextLine();
                if(line.equals("")){
                    int total=0;
                    for (Integer i: calories){
                        total+=i;
                    }
                    if(total>maxSum){
                        maxSum=total;
                    }
                    calories.clear();

                }
                else{
                    calories.add(Integer.parseInt(line));
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(maxSum);

    }

}
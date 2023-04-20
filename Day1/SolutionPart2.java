
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.*;  

public class SolutionPart2 {
    public static void main(String []args){
        ArrayList<Integer> calories=new ArrayList<Integer>();
        ArrayList<Integer> sol=new ArrayList<Integer>();

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
                    System.out.println("adding total to sol , the total is : "+total);
                    sol.add(total);
                    calories.clear();

                }
                else{
                    calories.add(Integer.parseInt(line));
                }
            }
            // System.out.println("before sorting");
            // for(int i:sol){
            //     System.out.print(i+" ");
            // }
            Collections.sort(sol);
            for(int i=sol.size()-1;i>=sol.size()-3;i--){
                maxSum+=sol.get(i);
            }
            // System.out.println("after sorting");

            // for(int i:sol){
            //     System.out.print(i+" ");
            // }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(maxSum);

    }
    
}

package Day7;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Solution7 {
    public static void main(String []args){
        // Read the current crate configuration
        try{
            Scanner scanner = new Scanner(new File("Day7/input7.txt"));
            ArrayList<Integer> arr=new ArrayList<Integer>();

            // process the crate configuration first
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
                char[] chars = line.toCharArray();
                StringBuilder sb = new StringBuilder();
                for(char c : chars){
                   if(Character.isDigit(c)){
                      sb.append(c);
                   }
                }
                if(line.contains("cd")){
                    ArrayList<Integer> arr1=new ArrayList<Integer>();

                }
                break;

            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    
}

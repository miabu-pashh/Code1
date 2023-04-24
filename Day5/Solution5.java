package Day5;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Solution5 {
    public static void main(String []args){
        // Read the current crate configuration
        ArrayList<ArrayList<Character>> crates = new ArrayList<ArrayList<Character>>();
        try{
            Scanner scanner = new Scanner(new File("Day5/input5.txt"));

            // process the crate configuration first
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println("debugging the first line: wioth length as : "+line.length());
                System.out.println(line); //debug

                // if we find a blank line, we are done with the crates
                if (line.equals("")){
                    break;
                }
                int nextCrate = 0;
                for (int i = 0; i < line.length(); i+=4)
                {
                    if (crates.size() < nextCrate+1){
                        System.out.println("the next crate is : "+nextCrate+1);
                        System.out.println("the crate size is : "+crates.size()+" and the nextCrates size is : "+nextCrate);
                        crates.add(new ArrayList<Character>());
                        System.out.println("crate added");

                    }
                    
                    
                    System.out.println("the i value is : "+i);
                    if(line.charAt(i+1) != ' '){
                        System.out.println("int the second is loop"+line.charAt(i+1));

                        crates.get(nextCrate).add(line.charAt(i+1));
                    }
                    nextCrate++;
                }
                break;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        // print the crate info for debugging
        // the crate number gets placed on top of each array, we can remove it
        for (ArrayList<Character> crate: crates){
            for (Character item: crate){
                System.out.print(item);
            }
            System.out.println("");
        }
    }
    
}

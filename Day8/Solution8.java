package Day8;

import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Solution8 {
    
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        try{
            Scanner scanner=new Scanner(new File("Day8/input8.txt"));

            Integer row=99;
            Integer col=99;
            String s ="";
            


            // while (scanner.hasNext()){
                int k=0;
                // for (Integer i = 0; i < row; i++) {
                //     k++;
                    while(scanner.hasNext()){
                        String line = scanner.nextLine();
                    ArrayList<Integer> co = new ArrayList<>();

                        for (Integer j = 0; j < col; j++) {

                            // co.add(1);
                            co.add(Integer.parseInt(String.valueOf(line.charAt(j))));
                        }
                        arr.add(co);
                        // break;

                    }
                // }
               
                System.out.println(arr.get(12).get(0));

                System.out.println("the valuye of k is : "+k);
                
            // }

        

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
            
    }  
}

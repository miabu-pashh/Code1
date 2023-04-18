import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public Class Solution2{
    public static void main(String []args){
        HashMap<String, Integer> part1 = new HashMap<String, Integer>();
        HashMap<String, Integer> part2 = new HashMap<String, Integer>();
        
        String A="rock";
        String B="paper";
        String C="Sciccors";
        String X="loose";  //"rock"; //1
        String Y="tie";    //"paper"; //2
        String Z="win";    //"sciccors"; //3
        //win=6
        //tie=3
        //lose=0

        part2.put("A Y",4);
        part2.put("A X",3);
        part2.put("A Z",8);

        part2.put("B Y",5);
        part2.put("B X",);
        part2.put("B Z",8);

        part2.put("B Y",4);
        part2.put("B X",3);
        part2.put("B Z",8);

        String A,B,C,X,Y,Z;

        try{
            Scanner sc=new Scanner(new File("Day2/input2.txt"));
            while(sc.hasNext()){
                String line=sc.next();
            }
        }

    }

}
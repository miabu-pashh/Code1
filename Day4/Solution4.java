package Day4;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution4 {
    static int r=0;
    static int k=0;
    public static void part1(String s1,String s2)
    {
        String[] arrOfStr1 = s1.split("-", 2);
        int n1=Integer.parseInt(arrOfStr1[0]);
        int n2=Integer.parseInt(arrOfStr1[1]);
        String[] arrOfStr2 = s2.split("-", 2);
        int n3=Integer.parseInt(arrOfStr2[0]);
        int n4=Integer.parseInt(arrOfStr2[1]);
        Integer[] arr1=new Integer[n2-n1+1];
        Integer[] arr2=new Integer[n4-n3+1];
        int j=0;
        for(int i=n1;i<=n2;i++){
            arr1[j]=i;
            j++;
        }
        Set<Integer> set1 = new HashSet<Integer>();
        Collections.addAll(set1, arr1);
        j=0;
        for(int i=n3;i<=n4;i++){
            arr2[j]=i;
            j++;
         }
         j=0;
         
        Set<Integer> set2 = new HashSet<Integer>();
        Collections.addAll(set2, arr2);
        if(set1.stream().anyMatch(set2::contains)){
            k++;
        }


        if(set1.containsAll(set2)){
            r++;
        }else if(set2.containsAll(set1))
        {
            r++;
        }
}


    public static void main(String []args){

        try{
            Scanner sc=new Scanner(new File("Day4/input4.txt"));
            int l=1;
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                // String[] arrOfStr1 = line.split("[-,]");
                // for(String s:arrOfStr1){
                //     System.out.println(s+" ");
                // }
                String[] arrOfStr = line.split(",", 2);
                part1(arrOfStr[0], arrOfStr[1]);
                arrOfStr=null;
                // break;
            }

            System.out.println("printing r: "+r);
            System.out.println("printing k: "+k);



        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    
}

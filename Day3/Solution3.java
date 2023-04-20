package Day3;
import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution3 {


    public static int method2(char value){
        Map<Character, Integer> map = new HashMap<Character, Integer>(); 
        // Map<Character, Integer> lower = new HashMap<Character, Integer>();
    
    for (int i = 1; i <=26; i++)
    {
        char upp = (char) ('A' + i);
        map.put(upp,i+27);
        char low= (char) ('a' + i);
        map.put(low,i);
    }
    return map.get(value);
    }
    
    public static char commonChars(String str1,String str2)
    {
        // Convert the strings into sets of characters
        Set<Character> set1 = new HashSet<>();
        char k=' ';
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        } // Find the intersection of the sets
        for (char c : set1) {
            if (set2.contains(c)) {
                k=c;
            }
        }
        return k;
    }
    public static void main(String []args){
        try{
            Scanner sc=new Scanner(new File("Day3/input3.txt"));
        ArrayList<Integer> arr=new ArrayList<Integer>();

            while(sc.hasNext()){
                String line=sc.nextLine();
                int n=line.length();
                // String s="";
                System.out.println(line+" "+n);
                String one=line.substring(0, n/2);
                String two=line.substring(n/2, n);
                char s=commonChars(one, two);
                System.out.println(one);
                System.out.println(two);
                // for(int i=0;i<one.length();i++){
                //     for(int j=0;j<one.length();j++){
                //         if(one.charAt(i)==two.charAt(j)){
                //             s+=one.charAt(i);
                //             System.out.println(i);
                //         }
                //     }
                // }
                // System.out.println(s);
                int m=method2(s);
                arr.add(m);
                // System.out.println(m);
                // String arr[]=new String[n];
                // break;
            }
            int maxSum=0;
            for(int i:arr){
                maxSum+=i;
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println(maxSum);
            
        }catch(IOException e){
            System.out.println(e.getMessage());

        }

    }
    
}

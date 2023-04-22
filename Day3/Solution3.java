package Day3;
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

public class Solution3 {

    public static int method3(char value){
  
        Map<Character, Integer> map1 = new HashMap<Character, Integer>(); 
        if(map1.containsKey(value)){
            map1.put(value,map1.get(value)+1);
        }else{
            map1.put(value, 1);
        }
    System.out.println(Arrays.asList(map1));

        return map1.get(value);

    }

    


    public static int method2(char value){
        Map<Character, Integer> map = new HashMap<Character, Integer>(); 
        // Map<Character, Integer> lower = new HashMap<Character, Integer>();

        
        for (int i = 0; i <26; i++)
        {
            char upp = (char) ('A' + i);
            map.put(upp,i+27);
            char low= (char) ('a' + i);
            map.put(low,i+1);
        }
    // System.out.println(Arrays.asList(map));
    return map.get(value);
    }
    public static char commonChar(String str1,String str2,String str3){
        Set<Character> set1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        Set<Character> set3 = new HashSet<>();
        for (char c : str3.toCharArray()) {
            set3.add(c);
        }
        set1.retainAll(set2);

        set3.retainAll(set1);
        int n=set3.size();
        List<Character> aList = new ArrayList<Character>(n);
        for(Character c:set3){
            aList.add(c);
        }
        return aList.get(0);


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
            int g=0;
            Scanner sc=new Scanner(new File("Day3/input3.txt"));
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        
        
        while(sc.hasNextLine()){
            String[] string = new String [3];
            for (int i = 0; i <3; i++)   
                {  
                string[i] = sc.nextLine();  
                // System.out.println(string[i]);
                }
                char a=commonChar(string[0],string[1],string[2]);
                int n=method2(a);
                arr1.add(n);

                string=null;
                // System.out.println(a);
                // break;
        }
        int sum=0;
        for(int i:arr1){
            sum+=i;
        }
        System.out.println(sum+" the answer for part two");


            while(sc.hasNext()){
                String line=sc.nextLine();
                int n=line.length();
                String one=line.substring(0, n/2);
                String two=line.substring(n/2, n);
                char s=commonChars(one, two);
                int m=method2(s);
                arr.add(m);
                
            }
           
            int maxSum=0;
            for(int i:arr){
                maxSum+=i;
            }
    //         System.out.println();
    //         System.out.println(maxSum);
    // System.out.println(Arrays.asList(map1));
            
        }catch(IOException e){
            System.out.println(e.getMessage());

        }

    }
    
}

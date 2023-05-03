package EXAM1;

public class SolutionExam1 {

    public static void main(String []args){
        String test="Ajaya Reddy, Sardarni Katta, Vishal Mehta, Uma Arya";
        String[] arr=test.split("\\s*(=>|,|\\s)\\s*");;
        for(String s:arr){
            System.out.println(s);
        }
        // String[] arr1=new String[arr.length];
        for(int i=1;i<arr.length;i++){
            if(i%2!=0){
                String dup="";
                dup=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=dup;
                i=i+2;
            } 
            
        }
        String s="";
        // for(String s:arr){
        //     result+=s+" ";
        // }
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=" "+arr[i];
            }
            else if(i%2!=0){
                s=s+" "+ arr[i]+", ";
            }else{
                s+=arr[i];
            }
        }
        System.out.println(s);

    }

    
}

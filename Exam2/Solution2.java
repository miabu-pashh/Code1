package Exam2;

public class Solution2 {



    public static void answer2(){
        int[] arr={5,9,5,3,7,2,4,1};
        int target=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int k=arr[i]-arr[j];
                if(k<target && k>0){
                    target=k;
                }
            }

        }
        System.out.println("the second answer is : "+target);


    }
    public static void answer3(){
        int[][] integer2DArray ={{1,2,3,4},
            {9,1,2,1},
            {3,0,1,2}};
            int col=integer2DArray[0].length;
            int row=integer2DArray.length;
            for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    
                    int k=integer2DArray[i][j];

                }
            }





    }
    public static void main(String []args){
        int[] arr={4, 3, 8, 9};
        int odd=0;int even=0;
        int j=0;
        for(int i:arr){
            if(j%2!=0){
                odd+=i;
                j++;
            }else{
                even+=i;
                j++;
            }

        }
        
        if(even>odd || even==odd){
            System.out.println(even);
        }else{
            System.out.println(odd);
        }

        answer2();
        answer3();

    }

    
}

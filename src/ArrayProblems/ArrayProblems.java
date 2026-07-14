package ArrayProblems;

import java.util.ArrayList;

public class ArrayProblems {
    public static double avgArrElement(int nums[]){
        double sum=0;
        for(int i=0;i<nums.length;i++) {
            sum=sum+nums[i];
        }
        return sum/nums.length;
    }

    public static int[] mulArr(int nums[]){

        for(int i=0;i<nums.length;i++ ){
            int temp=nums[i]*10;
            nums[i]=temp;
        }

        return nums;
    }

    public static boolean searchArrElement(int nums[],int target){

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }

        return false;
}


public static int maxElement(int nums[]){
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            a=Math.max(a,nums[i]);
        }
        return a;
}

static void sumOfNum(int nums[]){
        int pSum=0;
        int nSum=0;

        for(Integer i:nums){
            if(i>0){
                pSum+=i;
            }else{
                nSum+=i;
            }

        }
    System.out.println("Positive Sum: "+pSum);
    System.out.println("Negative Sum: "+nSum);


}

static void countZeroAndOnes(int nums[]){
        int oneCount=0;
        int zeroCount=0;
        for(Integer i:nums){
            if(i==1)
                oneCount++;
            else
                zeroCount++;

        }

    System.out.println("One Count: "+oneCount);
    System.out.println("Zero Count: "+zeroCount);

    }


    static int findFirstUnsortedEle(int nums[]){
        int a=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[a]){
                    a++;
                }
            }

        System.out.println("Unsorted Element %d and its index %d".formatted(nums[a],a+1));
            return nums[a];

    }

    static int[] swapAlternateEle(int nums[]){
        int a=1;
        for(int i=0;i<nums.length-1;i+=2){

                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;

            a+=2;

        }
        return nums;
    }

    static void intersectionEle(int num1[],int num2[]){
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    System.out.println("Intersection Element: "+num1[i]);
                }
            }
        }
    }

    static ArrayList<Integer> alternateExtremeEle(int nums[]){
       int start=0;
       int end=nums.length-1;
        ArrayList<Integer>res4=new ArrayList<>();
       while(start<=end){
           res4.add(nums[start]);

           if(start!=end){
               res4.add(nums[end]);
           }
           start++;
           end--;

       }
        return res4;
    }

    static void main() {

        // avg array element
        System.out.println(avgArrElement(new int[]{12,10,13,14,20}));

    //     multiply by 10 array element
       int[] res=mulArr(new int[]{2,3,4,5});
       for(Integer i:res){
           System.out.println(i);

       //     search array element(linear search)
           System.out.println(searchArrElement(new int[]{2,24,3,5,4,76},5));

       //     max element of array
           System.out.println(maxElement(new int[]{1,2,5,34,2,1,3,21,22,1}));

       //     sum of +ve and -ve numbers
           sumOfNum(new int[]{2,-3,-1,4,6,-9});

           //     count of 1's and 0's
           countZeroAndOnes(new int[]{0,1,1,0,1,1,1});

           // find first unsorted element in array
           System.out.println(findFirstUnsortedEle(new int[]{2,3,9,5,13}));

       //     swap alternate elements in array
           int res1[]=swapAlternateEle(new int[]{10,20,30,40,50,60,70,80,90,100});

           for(Integer j:res1){
               System.out.println(j);
           }

           //     print array intersection elements
           int[] num1={1,2,3,4,5};
           int[] num2={3,4,5,6,7};
          intersectionEle(num1,num2);

       //    print alternate extreme elements of an array
            ArrayList<Integer> res4=new ArrayList<>();
                   res4=alternateExtremeEle(new int[]{10,20,30,40,50,60,70,80,90,100});
           System.out.println(res4);

       }
    }
}

package ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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

    static void reverseArr(int nums[]){
        int resultArray[]=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        // 1st method
        // for(int i=nums.length-1;i>=0;i--){
        //     resultArray[start]=nums[i];
        //     start++;
        // }

        // 2nd method (2 pointer)
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }

        for(Integer i:nums){
            System.out.println("Reverse: "+i);
        }

    }


    static void shiftArrByOne(int arr[]){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){

            if(i<1){
                System.out.println("hi");
                arr[0]=temp;
            }
            else{

                arr[i]=arr[i-1];

            }
        }

        for(Integer i:arr){
            System.out.println("Shift: "+i);
        }
    }

    static void shiftArrByK(int arr[],int k){
        int l[]=new int[k];

        int dec=arr.length-1;
        for(int i=0;i<k;i++){
            l[i]=arr[dec];
            dec--;
        }


        for(int i=arr.length-1;i>=0;i--){
            if(i<k){
                System.out.println(i);
                arr[i]=l[(k-1)-i];
            }else{
                arr[i]=arr[i-k];
            }
        }

        for(Integer i:arr){
            System.out.print(i);
        }
    }

    static void modeOfArr(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> hmp=new HashMap<>();

        for(int a:arr){
            hmp.put(a,hmp.getOrDefault(a,0)+1);
        }


       int maxFreq=0;
        int maxFreqNum=0;

        for(Integer i:hmp.keySet()){
            if(maxFreq<hmp.get(i)){
                maxFreq=hmp.get(i);
                maxFreqNum=i;
            }
        }

        System.out.println("Max frequency no: %d and its frequency: %d".formatted(maxFreqNum,maxFreq));

    }



    static void leastMostElement(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> hmp=new HashMap<>();

        for(int a:arr){
            hmp.put(a,hmp.getOrDefault(a,0)+1);
        }
        System.out.println(hmp);

        int maxFreq=0;
        int maxFreqNum=0;
        int minFreq=Integer.MAX_VALUE;
        int minFreqNum=0;

        for(Integer i:hmp.keySet()){
            if(maxFreq<hmp.get(i)){
                maxFreq=hmp.get(i);
                maxFreqNum=i;
                System.out.println(i);
                System.out.println(maxFreq);

            }


        }

        for(Integer i:hmp.keySet()){
            System.out.println("jai");
            if(minFreq>hmp.get(i)){
                System.out.println("hi");
                minFreq=hmp.get(i);
                minFreqNum=i;
            }


        }


        System.out.println("Max frequency no: %d and its frequency: %d, Min frequency no: %d and its freq: %d".formatted(maxFreqNum,maxFreq,minFreqNum,minFreq));


    }


    static ArrayList<Integer> unionOfArr(int[]arr1, int[]arr2){
        ArrayList<Integer> newArr=new ArrayList<>();


        for(int j=0;j<arr1.length;j++){
            newArr.add(arr1[j]);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println("i: "+i);
            if(arr2[i]!=newArr.get(i)&&!newArr.contains(arr2[i])){
                newArr.add(arr2[i]);
            }else if(arr2[i]==newArr.get(i)&&!newArr.contains(arr2[i])){
                newArr.add(arr2[i]);
            }
        }
        return newArr;
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
                   res4=alternateExtremeEle(new int[]{10,20,30,40,50,60,70,80,90});
           System.out.println(res4);

       //     reverse an array
       //     int res5[]=reverseArr(new int[]{2,4,6,8,9});
       //     for(Integer l:res5){
       //         System.out.println(l);
       //     }

           reverseArr(new int[]{2,4,6,8,9});


           //     right shift an array by 1 position
           shiftArrByOne(new int[]{1,25,33,44,2,12});

       //     right shift an array by k pos.
shiftArrByK(new int[]{1,2,3,4,5,6,7,8},3);


       // find mode of an array
           modeOfArr(new int[]{1,2,2,3,3,4,2,2,2,1});

           // find least and most frequency element of an array
           leastMostElement(new int[]{1,2,2,3,3,4,2,2,2,1});

       //     union of 2 array
           ArrayList<Integer>res6=unionOfArr(new int[]{1,2,3,4,5},new int[]{2,5,6,11,22,1,6,21,21});
           System.out.println(res6);
       }
    }
}

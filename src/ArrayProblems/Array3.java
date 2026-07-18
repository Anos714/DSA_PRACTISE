package ArrayProblems;

public class Array3 {

    static int[] sortZeroOneArr(int[] arr){
        int start=0;
        int end=1;

for(int i=0;i<arr.length;i++) {

    while (end<arr.length) {
        if(arr[start]==1&&arr[end]==0) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
            start++;
            end++;
    }
    start=0;
    end=1;
}
        return arr;
    }


    // optimized way of doing sort zero one
    static int[] sort01(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==1&& arr[end]==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

            }
            if(arr[start]==0){
                start++;
            }
            if(arr[end]==1){
                end--;
            }


        }

        return arr;
    }

    static int missingNum(int[] arr){
        int k=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=arr[j]){
                   k =i;
                   break;
                }
            }
        }
        System.out.println("hello"+k);
        return k;
    }

    static void main() {
    // sort 0 1 array
        int[] res=sort01(new int[]{1,1,0,0,1});
        for(Integer i:res){
            System.out.print(i);
        }

        // missing no
        int k=missingNum(new int[]{1,2,3,4,5,6,7,8,9});

        System.out.println("hiiii"+k);
    }
}

package BitwiseOperator;

/*
types:-

Bitwise AND -> &
Bitwise OR -> |
Bitwise XOR -> ^
Bitwise NOT -> ~
Bitwise Left Shift -> << (in other words it multiple by 2)
Bitwise Right Shift -> >> (in other words it divide by 2)
Bitwise Unsigned Right Shift -> >>>

 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BitwsieOp {
    static void main() {
        int a=5;
        int b=6;

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        System.out.println(a<<b);
        System.out.println(100>>1);

        System.out.println(100>>>1);

    //     diff. btw right shift(>>) and unsigned right shift(>>>)

        System.out.println(-20>>2);//-5
        System.out.println(-20>>>2);//1073741819


    //     check no is even or odd
        int n=11;
        if((n&1)==0)
            System.out.println("even");
        else
            System.out.println("odd");

        //     multiple by 2
        System.out.println(n<<1);

    //     divide by 2
        System.out.println(n>>1);
        boolean h=false;
        int x=64;
        for(int i=0;i<=x/2;i++){


            if((2<<i)==x){
               h=true;
                break;
            }
        }
        if(h)
            System.out.println("ha");
        else
            System.out.println("na");

    //     check power of 2 best method
        int y=32;
        if((y & (y-1))==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    //     swap two number using xor
        int num1=12;
        int num2=13;
        num1=num1^num2;
       num2=num1^num2;
       num1=num1^num2;

        System.out.println(num1+""+num2);


    //     find the unique element
        int []arr={10,24,17,24,10,13,17};

        int sum=arr[0];
        for(int i=0;i<arr.length-1;i++){
             sum=sum^arr[i+1];

        }
        System.out.println(sum);


    //     questions
    //     1 count number of set bits
        int num=16;
        int count=0;
        while(num!=0){
           num=num&(num-1);
            count++;
        }
        System.out.println("Count:"+count);







    }
}

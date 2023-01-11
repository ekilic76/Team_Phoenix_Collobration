package weekly_tasks;

import java.util.Arrays;

public class ConvertNegativeNumberTijana {
    /*

3. Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int
     */


    public static int absolute(int num){

        if(num<0){
            return num * (-1);
        }

        return num;
    }


    //convert numbers in array to positive
    // how to make a return array ?
    public static void absoluteArray (int[]num){


        for(int i =0; i<num.length; i++){
            if(num[i]<0){
                num[i]*=-1;
            }

        }


        System.out.println(Arrays.toString(num));

    }


    public static void main(String[] args) {


        //int
        System.out.println(absolute(-25));
        System.out.println(absolute(2));

        int[]num = {-24,1,2,-4,15};

        //array
       // absoluteArray(num);

     //   System.out.println(absoluteArray(num));


        // using math abs
        int n = -20;

        int pos = Math.abs(n);

        System.out.println(pos);




      /* int[]num = {-24,1,2,-4,15};

        for(int i =0; i<num.length; i++){
            if(num[i]<0){
                num[i]*=-1;
            }
        }


        System.out.println(Arrays.toString(num));

       */


    }
}

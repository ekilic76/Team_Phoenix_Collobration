package weekly_tasks;

import java.util.Scanner;

public class ArmstrongTijana {

     /*
    2. Numbers -- Armstrong numbers
Write a method that can check if a number is Armstrong number
 is armstrong - if the sum of its own digits raised to the power number of digits gives the number itself.

(407) three digits num —> (4 4 4) + (0 0 0) + (7 7 7)
       64 + 0 + 343
           => 407

     */

    public static void main(String[] args) {




            Scanner in = new Scanner(System.in);
            armstrongNumber( in.nextInt());

        }
        public static void armstrongNumber( int number) {
            int digits = 0;

            int temp = number;  // 153

            int temp1 = number;  //153

            int total = 0;

            while (number > 0) {  // finding how many digits
                number = number / 10; //
                digits++; //  3
            }
            // 153/10= 15  digit=1,             1 , 125, 27   == 153
            // 15/10=1 digit=2
            // 1/10 = 0 digit= 3

            /* at this point we cannot use original number again,
            bcz after this loop orignal number will be zero that's why we assign number to 2 different variable
             temp and temp1 to use next 2 action.

             */



            while (temp > 0) {

                int result = (int) Math.pow(temp % 10, digits); // finding number is power of digits

                // 1  -  result =  153%3 = 3 .... 3^3=27

                // result =5^3=125
                // result =1^3 = 3
                temp = temp / 10;
                //1    -    153/10= 15

                // 15/10=1
                // 1/10 = 0
                total += result; // to find out total number of result
                // total = 27+125+3=155;
            }




            if (temp1 == total) { // Checking Armstrong or not
                // 153>155 => false => not armstrong number
                System.out.println("Armstrong Number: " + temp1);
            } else {
                System.err.println("Not Armstrong Number: " + temp1);
            }


        }


        }
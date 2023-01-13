package utils;

public class Prime {
    public static void main(String arg[]){
      /*  System.out.println("Enter a number ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

       */

        primeCalculation(4);
    }
    static void primeCalculation(int num) {

        if (num <=0){
            throw new RuntimeException("prime number has to be greater than 1");
        }

        int count=0;

        for(int i=1; i<= num; i++){ //i is number by itself



            if(num%i==0) { //first condition that num is divided by itself without reminder

                count++;
            }
        }

        if(count==2)//number is divisible by itself and with 1, two conditions
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");
    }
}

//write a method that can check if number is Prime or not

//prime number is only dicisible with 1 and itself, greater than 1


package weekly_tasks;

public class ArmstrongToStringTijana {


    public static boolean armstrong(int n) { //  4794

        if (n > 0) {

            int sum = 0;  // for comparing results

            String ar = String.valueOf(n);  // from primitive to String

            for (int i = 0; i < ar.length(); i++) { // 4

                int size = ar.length();  // 4

                sum += Math.pow(Integer.parseInt(ar.substring(i, i + 1)), size);  // (4,4)
                //         1st substring -   4 , 3  = 64
                //          2nd substring -  0 , 3 = 0
                //         3rd substring -   7,  3 =  343
                //                               +   407

            }


            if (sum == n) {

                return true;
            }

        }

        return false;
    }



    public static void main(String[] args) {


        System.out.println(armstrong(407));





    }


}

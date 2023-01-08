package utils;

public class Tijana {




    public static void main(String[] args) {

        // swap chars


        // swap strings var

        String c = "tijana" ; // same length
        String d = "wooden" ;

        int cl = c.length(); // 5

        System.out.println(c + " " + d);

        c = c + d; // tijanawooden
        d = c.substring(0,cl); // tijana
        c = c.substring(cl); // wooden
        // 012345

        System.out.println(c + " " + d);



    }




}

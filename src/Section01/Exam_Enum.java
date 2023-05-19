package Section01;

import java.util.Arrays;

enum Man{
    jerry,
    billy,
    kelly,
    wally
}

public class Exam_Enum {
    public static void main(String[] args) {
        Man mans = Man.billy;
        System.out.println(mans.name());
        System.out.println(mans.ordinal());
        System.out.println(mans.compareTo(Man.jerry));
        System.out.println(Man.valueOf("billy"));

        Man[] manss = Man.values();

        System.out.println(Arrays.toString(manss));



    }
}


package DailyCoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//정수를 요소로 갖는 배열을입력받아
// 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해야 합니다.
public class Exam_21 {
    //입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.
    //배열의 요소는 음수와 0을 포함하는 정수입니다.
    //배열의 길이는 3 이상입니다.
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)

    }

    public static int largestProductOfThree(int[] arr) {
        // TODO:
        //        7 2 -1 -5; > 2 -1 -5;
//        4 3 2 -1 > 4 3 2 > 음수 1개;
//        4 3 -2 -1; > 3 -2 -1; > 음수 2개;
//        -1 -2 3 4 > -1 -2 4
//        7 -1 -2 -5; > 7 -2 -5 > 음수 3개;
//        -4 -3 -2 1; > -3 -2 1;
//        -4 -3 -2 3; > -4 -3 3;
//        -1 -2 -3 -4; > -1 -2 -3 음수 4개;
//        10 -1 -2 -3; > 10 -2 -3 > 음수 4개;

        //1. 배열을 큰수부터 정렬한뒤,
        //음수가 0개, 1개
        //arr[0,1,2]
        //음수가 2개
        //arr[1,2,3]
        //음수가 3개
        //arr[0,2,3]
        //arr[
        //음수가 4개
        //arr[0,1,2]

        int[] arrSort = arr;
        int count = 0;
        Arrays.sort(arrSort);
        int leng = arrSort.length;
        int result = 0;


        for(int i : arrSort){
            if(i < 0) count++;
        }

        if(count == 0 | count == 1 | count == leng){
            result = arrSort[leng-1] * arrSort[leng-2] * arrSort[leng-3];
        } else {
            result = arrSort[0] * arrSort[1] * arrSort[leng-1];
        }

        return result;
    }
}

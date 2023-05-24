package DailyCoding;
//removeExtremes
//문제
//문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해야 합니다.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exam_11 {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(output); // --> ["a"", "b"]


        for(String e : output){
            System.out.print(e + ",");
        }
    }

    public static String[] removeExtremes(String[] arr) {
        // TODO:
        //가장긴 문자열, 가장짧은 문자열 찾기
        //길이는 전부 다름
        //가장짧은 문자열, 가장 긴 문자열이 다수일 경우 나중에 위치한 문자열을 제거
        //공백을 입력받을시 null반환

        if(arr.length == 0) return null;

        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));

        int minIdx = 0 , maxIdx = 0;
        
        int max = 1;

        for(int i=0; i<arr.length; i++){ //순서대로 순회하며

            if(arr[i].length() >= max){ //max값을 찾는다.
                max = arr[i].length();
                maxIdx = i;
            }
        }

        result.remove(maxIdx);

        String[] arrr = result.toArray(new String[0]);

        int min = max;
        
        for(int i=0; i<arrr.length; i++) { //순서대로 순회하며

            if (arrr[i].length() <= min) { //min값을 찾는다.
                min = arrr[i].length();
                minIdx = i;
            }
        }

        result.remove(minIdx);

        return result.toArray(new String[0]);
    }
}

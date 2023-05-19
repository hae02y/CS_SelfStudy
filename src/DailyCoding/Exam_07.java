package DailyCoding;

import java.util.HashMap;

public class Exam_07 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
        };

        HashMap<String, String> output = convertListToObject(arr);

        System.out.println(output);
    }

    private static HashMap<String, String> convertListToObject(String[][] arr) {

        //arr을 받아서 arr[i][0] 이 hashmap의 키로, arr[i][1]이 hashmap의 값으로 들어가면된다.
        HashMap<String,String> hashMap = new HashMap<>();

        if(arr.length <= 0) return hashMap;
        if(arr[0].length == 0) return hashMap;

        for(int i=0; i<arr.length;i++){

            if(hashMap.containsKey(arr[i][0])) continue;

            hashMap.put(arr[i][0],arr[i][1]);
        }
        return hashMap;
    }
}

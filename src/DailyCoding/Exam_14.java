package DailyCoding;

public class Exam_14 {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
        System.out.println(output); // --> true

    }

    public static boolean superIncreasing(int[] arr) {
        // TODO:

        //arr의 0 ~ i-1까지 의 합과 i의 값을 비교한다.

        //마지막값을 last로 선언
        int last = arr[arr.length-1];
        int what = 0;

        for(int i=0; i<arr.length-1; i++){
            what += arr[i];
        }

        if(last > what) return true;
        else return false;
    }
}

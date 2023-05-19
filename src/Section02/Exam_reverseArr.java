package Section02;

import java.util.Arrays;

public class Exam_reverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr) {
        // TODO:
        if (arr.length == 0) return arr;

        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);

        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] dest = new int[head.length + tail.length];

        //System.arraycopy메서드를 사용하여, head, tail 두 배열의 요소를 모두 dest 배열에 복사합니다.
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);

        return dest;
    }
}
package Section01;

public class Exam_Arr {
    public static void main(String[] args) {
        String output = createPhoneNumber(new int[]{0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(output); // --> '(010)1234-5678'
    }

    public static String createPhoneNumber(int[] arr) {
        // TODO:
        //배열의 길이가 8인경우, 11인경우를 나눠서
        //8개일 경우
        String result ="";
        //11개일경우

        if(arr.length == 8){
            result = "(010)";

            for(int i=0;i<arr.length;i++){
                if(i == 4) result += "-" + arr[i];
                else  result += arr[i];
            }
        }

        if(arr.length == 11){
            result = "(" + arr[0] + arr[1] + arr[2] + ")";
            for(int i=3;i<arr.length;i++){
                if(i == 7) result += "-" + arr[i];
                else  result += arr[i];
            }
        }

        return result;
    }
}

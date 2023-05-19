package DailyCoding;

//문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴해야 합니다.


public class Exam_08 {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }

    public static String convertDoubleSpaceToSingle(String str) {
        // TODO:
        //만약 공백을 제거 한뒤에도 공백이 있으면 그자리

        //방법1. 문자열에 공백1개있으면 다음공백을 확인해서 공백부분을 빼고 넣어준다.
        String result = "";

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == ' '){
                if(str.charAt(i+1) == ' '){
                    continue;
                }
            }
            result += str.charAt(i);
        }

        return result;


        //방법2. replaceAll 사용
//      String result = str.replaceAll("  ", " ");
//        return result;


    }
}

package DailyCoding;

public class Exam_05 {
    //문자열을 입력받아 순서가 뒤집힌 문자열을 리턴
    public static void main(String[] args) {
        String output = firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc"
    }
    public static String firstReverse(String str) {
        // TODO:
        String newStr = "";

        for(int i=str.length()-1 ; i>=0 ; i--){
            newStr += str.charAt(i);
        }
        return newStr;
    }

//    StringBuilder st = new StringBuilder(str);
//    String result = st.reverse().toString();
//
//    return result;
//StringBuilder로 구현

}

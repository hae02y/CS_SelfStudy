package DailyCoding;

public class Exam_10 {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

    //문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴해야 합니다.
    //0은 짝수로 간주합니다.
    public static String insertDash(String str) {
        // TODO:
        //str을 돌면서 홀수가 나온뒤 홀수가 다시 나오면 -앞에 -를 추가
        String result = "";

        if(str.length() == 0) return null;

        for(int i=0; i<str.length(); i++){

            result += str.charAt(i);

            if(str.length() > i+1){
                int element = str.charAt(i)-48;
                int elementNext = str.charAt(i+1) - 48;

                if(element%2==1 && elementNext%2==1){
                    result += "-";
                }
            }
        }

        return result;
    }
}

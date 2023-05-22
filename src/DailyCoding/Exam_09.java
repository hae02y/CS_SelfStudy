package DailyCoding;

public class Exam_09 {
    public static void main(String[] args) {
        boolean output = ABCheck("HK9J6YjrAcMbq8qKrbS3EaPRT");
        System.out.println(output); // --> true
    }

    public static boolean ABCheck(String str) {
        // TODO:
        //문자열을 입력받아 문자열 내에 아래 중 하나가 존재하는지 여부를 리턴해야 합니다.
        //'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
        //'b'로 시작해서 'a'로 끝나는 길이 5의 문자열

        //charAt을 돌면서 a나 b를 만나면 4칸을 더 세서 b나 a를 만나면 true 아니면 false
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.length() - 4 >= i + 4) {

                if (str.charAt(i) == 'a') {
                    if (str.charAt(i + 4) == 'b') {
                        return true;
                    }
                } else if (str.charAt(i) == 'b') {
                    if (str.charAt(i + 4) == 'a') {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
package DailyCoding;

//문자열을 입력받아 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을
// (숫자와 공백을 제외한 나머지) 문자열의 길이로 나눈 값을 정수로 반올림하여
// 리턴해야 합니다.

public class Exam_18 {


    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

//빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
//숫자(digit)는 연속해서 등장하지 않습니다.
    public static int numberSearch(String str) {
        // TODO:
        //문자열을 받아서 하나씩 분리해서 isdigit인지 판별~?
        //true인 값들만 가져다가 계산을 하면될것같다.

        int answer = 0;
        StringBuilder str2 = new StringBuilder();

        if(str.length() == 0) return 0;

        for(int i=0; i<str.length(); i++){
            char index = str.charAt(i);

            if(Character.isDigit(index)) {
                answer += index - 48;
            } else if (index == ' ') {
            } else {str2.append(index);}
        }

        double result = (double) answer/ str2.length();

        return (int) Math.round(result);
    }

}


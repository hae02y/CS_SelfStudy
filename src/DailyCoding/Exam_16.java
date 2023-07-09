package DailyCoding;

//아이소그램인지 판단하여 true / false 리턴

public class Exam_16 {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false

        output = isIsogram("");
        System.out.println(output); // false
    }

    public static boolean isIsogram(String str){
        //빈문자열을 받은경우 true를 리턴
        //대소문자는 구별하지 않는다.

//        for문을 돌면서 비교를 수행한다.;
//
//        0번 인덱스 부터 시작해서 하나씩 증가하면서;
//        비교를 수행하고 같은값이 있으면 종료하면서 false 리턴;
//        없으면계속 돌아감;
//        근데 그전에 소문자로 모두변경.

        String solution = str.toLowerCase();

        //빈문자열 받은경우..!
        if(solution.length() == 0) return true;

        //정상적인문자열 받은경우.
        for(int i=0; i<solution.length()-1;i++){
            for(int j=i+1;j<solution.length();j++){
                if(solution.charAt(i) == solution.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

}

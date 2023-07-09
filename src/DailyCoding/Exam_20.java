package DailyCoding;

//문자열을 입력받아 연속되는 문자가 있을 경우,
// 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴해야 합니다.
public class Exam_20 {

    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggopppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }

//빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
//3개 이상 연속되는 문자만 압축합니다.
    public static String compressString(String str) {
        // TODO:
        //str을 받아서 같은것이 3개 반복되면 nM 형식으로 변경하여 result에 저장
        //빈문자열시 빈문자열 리턴
//        String result = "";
//
//        for(int i=0; i<str.length(); i++){
//
//            //for문을 돌면서 charAt(i)를 잡아서 개수를 센다.
//            int counter = 0;
//            char index = str.charAt(i);
//
//            for(int j=i; j<str.length(); j++){
//
//                if(str.charAt(j) == index){
//                    counter++;
//                } else break;
//
//            }
//            //3개 이상일 때 전부다 센다...?
//
//            if(counter>=3){
//                result += String.valueOf(counter)+str.charAt(i);
//            }else {
//                result += str.charAt(i);
//            }
//        }
//
//
//
//        return result;

        if(str.length() == 0) return "";

        char before = str.charAt(0);
        int count = 1;
        String result = "";
        str = str + ' ';
        for(int i=1; i<str.length(); i++){

            //before가 str.index(i)랑 같은지 확인하고 같으면 카운트 증가
            //다르면 저장하고, before 재세팅 해서 다시 for문 돌림.
            if(before == str.charAt(i)){
                count++;
            }else {
                if(count >= 3){
                    result = result + count + before;
                }else {
                    for(int j=0; j<count;j++){
                        result = result + before;
                    }
                }
                count = 0;
                before = str.charAt(i);
            }
        }
        return result;
    }
}

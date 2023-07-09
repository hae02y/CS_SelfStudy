package DailyCoding;


//문자열을 요소로 갖는 배열을 입력받아 문자열을 세로로 읽었을 때의 문자열을 리턴해야 합니다.
public class Exam_13 {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolr",
                "kk"
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

    }

    public static String readVertically(String[] arr) {
        // TODO:

        //solution
        //1. 세로로 읽는다.
        //2. 배열을 선언해서 세로로 읽은값을 넣어준다.
        //3. 배열을 합친다.


        int max = 0;

        //arr의 요소중 가장 긴값을 찾는다.
        for(String element : arr){
            if(element.length() > max){
                max = element.length();
            }
        }

        String[] resultTemp = new String[max];

        //for문을 돌면서 resultTemp에 값을 넣어준다.
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            for(int j=0; j<str.length();j++){
                //resultTemp[j]가 비어있으면 resultTemp[j] = 1번째 요소의 값
                if(resultTemp[j] == null){
                    resultTemp[j] = Character.toString(str.charAt(j));
                }else {
                    resultTemp[j] += str.charAt(j);
                }
            }
        }

        String result = "";

        for(String e : resultTemp){
            result += e;
        }

        return result;
    }
}

package DailyCoding;


//암호화된 문자열과 암호화 키를 입력받아 복호화된 문자열을 리턴해야 합니다.
//카이사르 암호(Caesar cipher)는 평문(plaintext)을 암호키 secret개만큼
// (오른쪽으로) 평행이동시켜 암호화 합니다. 복호화는 암호화된 문자열을 원래의
// 평문으로 복원하는 것을 말합니다.
public class Exam_19 {

    public static void main(String[] args) {
        String output = decryptCaesarCipher("nzop delepd dfaazced jzf", 11);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // --> world
    }

    //빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
    //공백은 그대로 두어야 합니다.
    //입력된 문자열은 모두 소문자만 입력됩니다.
    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        //string의 한글자씩 접근해서, char로 변경.
        //char로 변경한뒤에 secret만큼 이동한다.
        //만약 아스키코드에서 char + secret했을때 넘어가는부분은 다시 앞으로 돌려준다.

        StringBuilder resultStr = new StringBuilder();
        int newSecret = secret%26;


        if(str.length() == 0) return "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                resultStr.append(ch);
                continue;
            }

            if(ch - newSecret < 97){
                ch = (char) (123 + (str.charAt(i) - 97));
                resultStr.append ((char) (ch - newSecret));
            }else resultStr.append ((char) (ch - newSecret));

        }
        return String.valueOf(resultStr);
    }

}

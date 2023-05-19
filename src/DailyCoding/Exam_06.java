package DailyCoding;


public class Exam_06 {
    public static void main(String[] args) {
        String output1 = letterCapitalize("    ");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }

    public static String letterCapitalize(String str) {
        // TODO:
        //공백으로 구분.
        //split 사용
        //split 이후에 charAt(0)을 대문자로
        String result = "";
        if(str.length() == 0) return "";
        String[] strArray = str.split(" ");
        for(String element : strArray){
            if(element.isEmpty()) {
                result += " ";
            }else{
                char[] ch = element.toCharArray();
                ch[0] = Character.toUpperCase(ch[0]);
                element = String.valueOf(ch);
                result += element +" ";
            }
        }
        if(result.isEmpty()) return "";

        result = result.substring(0,result.length());

        return result;
    }
}

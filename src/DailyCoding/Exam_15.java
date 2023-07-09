package DailyCoding;

//두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴해야 합니다.
//나눗셈(/), 나머지(%) 연산자 사용은 금지됩니다.
//0은 어떤 수로 나누어도 나머지가 0입니다.
//어떤 수도 0으로 나눌 수 없습니다. 이 경우 null를 리턴해야 합니다.
//주석에서 사용하는(/)도 나눗셈으로 간주하기 때문에, 주석을 모두 지워야 합니다.

public class Exam_15 {
    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1
    }

    public static Integer modulo(int num1, int num2) {
        // TODO:
        //빼기를 계속 해주면 된다.

        //num1 - num2 를 반복해서 나온 result가 result < num2 일때까지;

        int calculate = num1;

        if(num2 == 0) return null;
        if(num1 == 0) return 0;

        while (true){
            //만약 num1 - num2 를 한값을 저장해놓고. 그값이 num2보다 큰지 작은지 판별한다.
            calculate = calculate-num2;

            if(calculate == num2) return 0;
            if(calculate < num2) return calculate;
        }

    }
}


//🎈Solution

//public class Solution {
//    public Integer modulo(int num1, int num2) {
//        if(num2 == 0) {
//            return null;
//        }
//
//        while (num1 >= num2) {
//            num1 = num1 - num2;
//        }
//
//        return num1;
//    }
//}

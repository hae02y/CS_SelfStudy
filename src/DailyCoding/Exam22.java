package DailyCoding;
//정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.
//버블 정렬(bubble sort)은 여러 정렬 알고리즘(삽입 정렬, 퀵 정렬, 병합 정렬, 기수 정렬 등) 중 가장 기본적인 알고리즘입니다.
//
//버블 정렬 알고리즘은 아래와 같습니다.
//
//첫 번째 요소가 두 번째 요소보다 크면, 두 요소의 위치를 바꿉니다. (swap)
//두 번째 요소와 세 번째 요소보다 크면, 두 요소의 위치를 바꿉니다. (swap)
//1, 2를 마지막까지 반복합니다. (마지막에서 두 번째 요소와 마지막 요소를 비교)
//1~3의 과정을 한 번 거치게 되면, 가장 큰 요소가 배열의 마지막으로 밀려납니다.
//1~3의 과정을 첫 요소부터 다시 반복합니다.
//5를 통해 두 번째로 큰 요소가 배열의 마지막 바로 두 번째로 밀려납니다.
//1~3의 과정을 총 n번(배열의 크기) 반복합니다.
//이 모습이 마치 '거품이 밀려 올라가는 것과 같은 모습'과 같아서 bubble sort라고 부릅니다.

import java.util.Arrays;

public class Exam22 {

    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{10,8,3,1,2,4,7,9,6,5});
        Arrays.stream(output).forEach(System.out::println);
    }


    public static int[] bubbleSort(int[] arr) {
        // TODO:
        int swap = 0;
        int countSwap = 0;
        int index = 0;
        int last = arr.length-1;

        for(int i=0; i<arr.length-1; i++){

            for(int j=0; j<last; j++){
                if(arr[j] > arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    swap = 0;
                    countSwap++;
                }
            }
            last--;
            if(countSwap == 0){
                break;
            }
        }
        return arr;
    }
}

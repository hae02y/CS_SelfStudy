package Section02;

import java.util.LinkedList;
import java.util.Queue;

public class Exam_BoxWrap {
    public static void main(String[] args) {
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        int output = paveBox(boxes);
        System.out.println(output); // 3
    }

    public static int paveBox(Integer[] boxes) {
        // TODO:
        Queue<Integer> queue = new LinkedList<>();

        for(int element : boxes){
            queue.add(element);
        }

        int first = queue.poll();  //첫번째를 first변수에 poll
        int result = 1;
        int count = 1;

        while(!queue.isEmpty()){


        }



        return 0;
    }
}


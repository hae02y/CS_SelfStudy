package Section02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exam_GreedyBox {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3
    }

    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        //이사짐의 무게는 다다름. 박스는 작아서 한번에 최대 2개까지 짐을 넣을수있고, 무게 제한이있다.
        //박스를 최대한 적게사용해서 옮김
        //짐의 무게[] : stuff    , 무게제한 : limit
        //박스 개수의 최소값을 return
        Queue<Integer> box = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = IntStream.of(stuff).boxed().collect(Collectors.toList());
        //어짜피 다 옮겨야하고, 다옮겼을때의 최소 박스개수이니까 1번째부터 큐에 넣는다.
        //그리고 그다음값부터 들어갈수있는 값이 있는지 확인하고 없으면 큐삭제 삭제되면 count + 1
        //그리고 다음값부터 다시 반복한다. => 재귀도 될수있을걱같은데 일단 그냥 풀어보자
        int count = 0;
        int maxIdx = 0;

        //1번째 박스를 q에 넣는다.
        box.add(stuff[0]);
        list1.remove(0);

        //0번을 제외한 박스안의 것들을 확인한다. stuff[0] + x <= limit
        for(int i = 1; i<stuff.length; i++){
            int add = stuff[0] + stuff[i];
            if(add <= limit) list.add(limit - add);
        }

        if(list.isEmpty()){ //list가 비었으면 box를 옮기고, count ++ 한다.
            box.clear();
            count ++;
        }else {

            //list가 있으면 값을 비교해서 가장 작은값에 해당하는 인덱스를 찾는다. 그리고 그인덱스가 함께 빠질 값이다.
            for (int i = 0; i <= list.size(); i++) {
                if (list.get(i) == list.stream().mapToInt(x -> x).max().getAsInt()) { //list[i] 가 list중 가장작은값과 같다면
                    maxIdx = i;
                }
            }
            box.add(stuff[maxIdx]);
            list1.remove(maxIdx);

            if (box.size() == 2) {
                box.clear();
                count++;
            }
        }
        return count + movingStuff(list.stream().mapToInt(Integer::intValue).toArray(),limit);
    }
}

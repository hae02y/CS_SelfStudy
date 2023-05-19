package Section02;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam_Graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(Arrays.asList(2,null)));
        graph.add(new ArrayList<>(Arrays.asList(0,2,null)));
        graph.add(new ArrayList<>(Arrays.asList(0,null)));

        graph.get(0);
        graph.get(1);
        graph.get(2);
    }
}

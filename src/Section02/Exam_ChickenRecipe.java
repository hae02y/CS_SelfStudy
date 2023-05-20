package Section02;
import java.net.InterfaceAddress;
import java.util.*;

public class Exam_ChickenRecipe {
    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111, 10000}, 2);
        System.out.println(output1);
/*
  [
    [1, 10], [1, 1100], [1, 1111],
    [10, 1], [10, 1100], [10, 1111],
    [1100, 1], [1100, 10], [1100, 1111],
    [1111, 1], [1111, 10], [1111, 1100]
  ];
*/

        //순열문제. stuffArr.length P choiceNum;
    }


    //0이 3개이상이면 상한 재료이므로 제외한다.
    //순서에 따라서 달라진다.
    //일단 상한 재료를 제외해보자..!
    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:
        // stuffArr에서 0이 3개 이하인 것만 찾아서 담아줄 리스트 생성.
        ArrayList<String> matchedStuff = new ArrayList<>();

        for(int e : stuffArr){ //stuffArr의 요소를 돌면서 0이 3개 이하인것을 찾아서
            int count =0;
            String match = Integer.toString(e);

            for(int i=0;i<match.length();i++){
                if(match.charAt(i) == '0'){
                    count++;
                }
            }
            if(count < 3){
                matchedStuff.add(String.valueOf(e)); //matchedStuff에 넣어준다.
            }
        }

        Collections.sort(matchedStuff); //matchedstuff를 정렬한다.

        permutation(matchedStuff, choiceNum);

        return new ArrayList<Integer[]>();
    }

    public static void permutation(ArrayList<String> matchedStuff, int choiceNum){  //permutation을 선언
        //matchedStuff.length개중에 choicenum개를 뽑는거
        //base case:
        if(choiceNum == 0){

            return;
        }


        for(int i=0; i<matchedStuff.size(); i++){



            permutation(matchedStuff,choiceNum-1);
        }


    }

}

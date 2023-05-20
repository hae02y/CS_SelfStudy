package Section02;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam_RockPaperScissors {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(2);

        System.out.println(output);
        /*
    [
      ["rock", "rock", "rock", "rock", "rock"],
      ["rock", "rock", , "rock", "rock", "paper"],
      ["rock", "rock", , "rock", "rock", "scissors"],
      ["rock", "rock", "rock", "paper", "rock"],
      ["rock", "rock", "rock", "paper", "paper"],
      ["rock", "rock", "rock", "paper", "scissors"],
      ["rock", "rock", "rock", "scissors", "rock"],
      // ...etc ...
    ]
  */
    }

    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        //결과를 담을 ArrayList 선언
        ArrayList<String[]> outcomes = new ArrayList<>();

        permutation(rounds, new String[]{}, outcomes);

        return outcomes;
    }

    public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar ,ArrayList<String[]> outcomes){

        if(roundsToGo == 0){
            outcomes.add(playedSoFar);
            return outcomes;
        }


        String[] rps = new String[]{"rock", "paper", "scissors"};

        for(int i=0; i<rps.length; i++){

            String currentPlay = rps[i];

            //permutation에서 하나 뺀숫자와 playsoFar에 currentplay를 추가하여 재귀를 수행
            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length+1);
            concatArray[concatArray.length-1] = currentPlay;

            outcomes = permutation(roundsToGo -1, concatArray, outcomes);
        }

        return outcomes;
    }

}

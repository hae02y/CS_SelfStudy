package Section01;

public class Exam_TryCatch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6};

        try {
            System.out.println(array[3]);

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("범위를 벗어났어.");
            System.out.println(arrayIndexOutOfBoundsException.toString());
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
            arrayIndexOutOfBoundsException.printStackTrace();
        }finally {
            System.out.println("끝");
        }
    }
}

package Section01;

import java.io.FileOutputStream;

public class Exam_FileInputStreamExample {
    public static void main(String[] args) {

            try {
                FileOutputStream fileOutput = new FileOutputStream("codestates.txt");
                String word = "길덕근입니다.";
                byte b[] = word.getBytes();
                fileOutput.write(b);
                fileOutput.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}


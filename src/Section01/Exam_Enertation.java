package Section01;

public class Exam_Enertation implements ExampleInrerface {
    @Override
    public void example() {

    }


    public static void main(String[] args) {
        OldClass oldclas = new OldClass();
        System.out.println(oldclas.getOldField());

    }
}

interface ExampleInrerface{
    void example();
}

class OldClass{
    @Deprecated
    private int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
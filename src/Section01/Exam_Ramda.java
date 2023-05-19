package Section01;

public class Exam_Ramda {

    public static void main(String[] args) {
        MyFun myFun = new MyFun() {
            @Override
            public void delta(int a, int b) {
                System.out.println(a+b);
            }
        };
//        Section1.MyFun myFun = () -> System.out.println("accept호출");
//        myFun.accept();
//
//        String[] arr = new String[]{"정해영", "박혁거세"};
//
//        Stream<String> stream = Arrays.stream(arr);
//
//        stream.forEach(System.out::println);

//        IntStream ints = new Random().ints().limit(5);
//        ints.forEach(System.out::println);

//        IntStream intStream = IntStream.range(1,10);
//        intStream.forEach(System.out::println);
    }
}


interface MyFun{
    void delta(int a, int b);
}

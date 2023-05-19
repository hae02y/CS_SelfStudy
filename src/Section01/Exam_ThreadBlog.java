package Section01;

public class Exam_ThreadBlog {
        public static void main(String[] args) {

            Thread thread = new Thread(new Runnable() {
                public void run() {
                    System.out.println("thread control");
                    System.out.println(Thread.currentThread().getName());  //스레드 인스턴스의 주소얻기

                }
            });

            thread.start();
            System.out.println(Thread.currentThread().getName());


            System.out.println("thread.getName() = " + thread.getName()); //스레드의 이름 얻기
            thread.setName("changed_name_thread"); //스레드 이름 설정
            System.out.println("thread4.getName() = " + thread.getName());
        }
}

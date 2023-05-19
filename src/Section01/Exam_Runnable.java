package Section01;

public class Exam_Runnable {

    public static void main(String[] args) {


        Runnable task1 = new ThreadTask1();

        Thread thread1 = new Thread(task1);

        Thread thread = new Thread(new ThreadTask1());

        ThreadTask2 thread2 = new ThreadTask2();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread3.start();

        System.out.println(thread3.getName());
        thread3.setName("three");
        System.out.println(thread3.getName());
        System.out.println(Thread.currentThread().getName());


        thread1.start();
        System.out.println(Thread.currentThread().getName());

        thread.start();
        System.out.println(Thread.currentThread().getName());

        thread2.start();
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            System.out.print("#");
        }
        System.out.println(Thread.currentThread().getName());

    }
}

class ThreadTask2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            System.out.print("@");
        }
    }
}

class ThreadTask1 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            System.out.print("*");
        }
    }
}

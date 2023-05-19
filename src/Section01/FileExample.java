package Section01;

public class FileExample {
    public static void main(String[] args) {
    Exaple ex = (a,b) -> a+b;
    System.out.println(ex.sum(10,20));
    Pp pp = (a) -> a+3;
    pp.ab(2);
        }
}



interface Exaple{
    int sum(int a, int b);
}



interface Pp{
    int ab(int a);
}
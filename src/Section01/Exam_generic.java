package Section01;

public class Exam_generic {
    public static void main(String[] args) {
//        Section1.Ge<Boolean> generic = new Section1.Ge<>(true);
//        System.out.println(generic.getItem());
//        Integer num1 = new Integer(20);
//        Integer num3 = new Integer(20);
//        System.out.println(num1);
//        int num2 = 20;
        Ge<Flower> remener = new Ge<>();
        remener.setItem(new Rose());
        remener.setItem(new Flower());
    }
}

class Ge<T>{
    private T item;

    public Ge() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Flower{}
class Rose extends Flower{}
class Rosepasta{};

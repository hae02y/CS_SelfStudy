package Section01;

import java.util.Iterator;
import java.util.TreeSet;

public class Exam_List {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//
//        list.add("hi");
//        list.add("bye");
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            String str = iterator.next();
//        }
//
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.size());
//-------------------------------------------------------------------------
//        HashSet<String > languages = new HashSet<String>();
//
//        // HashSet에 객체 추가
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("Javascript");
//        languages.add("C++");
//        languages.add("Kotlin");
//        languages.add("Ruby");
//        languages.add("Java"); // 중복
//
//        // 반복자 생성하여 it에 할당
//        Iterator it = languages.iterator();
//
//        // 반복자를 통해 HashSet을 순회하며 각 요소들을 출력
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        TreeSet<String> worker = new TreeSet<>();

        worker.add("hi");
        worker.add("ad");
        worker.add("bad");
        worker.add("tyle");
        worker.add("hi");
        worker.add("cyworkld");

        System.out.println(worker);
        System.out.println(worker.first());
        System.out.println(worker.last());
        System.out.println(worker.higher("hi"));
        System.out.println(worker.subSet("bad","hi"));

        Iterator it =  worker.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

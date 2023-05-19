package Section01;

import java.util.function.BiFunction;
import java.util.function.Function;

 class ConstructorRef {
    public static void main(String[] args) throws Exception {
        Function<String, Member> function1 = a -> new Member(a);
        Member member1 = function1.apply("kimcoding");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("kimcoding", "김코딩");
    }
}

class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("Section1.Member() 실행");
    }

    public Member(String id) {
        System.out.println("Section1.Member(String id) 실행");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("Section1.Member(String name, String id) 실행");
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); //return 값이 있다. String 은 불변객체이기 때문에 아무일도 일어나지 않는다.
        //concat() 메서드는 내부에서 새로운 String 객체를 만들어서 반환하는 것이다.
        //-> 불변과 기존 객체의 값을 유지한다
        System.out.println("str1 = " + str1); //str1 = hello
        System.out.println("str2 = " + str2); //str2 = hello java
    }
}

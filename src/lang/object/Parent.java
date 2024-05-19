package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
public class Parent { //extends Object 가 생략된거와 같다.

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

/**
 * 클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속 받는다.
 *
 * 쉽게 말하면 자바가 extends Object 코드를 넣어준다.
 * 따라서 extends Object 는 생략하는 것을 권장
 */

package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}

/**
 * 자바에서 Object 클래스가 최상위 부모 클래스인 이유
 *
 * 공통 기능 제공
 *      객체의 정보를 제공하고, 이객체가 다른 객체와 같은지 비교하고,
 *      객체가 어떤 클래스로 만들어졌는지 확인하는 기능은 모든 객체에게 필요한 기본 기능
 *      toString(), equals(), getClass()
 * 다형성의 기본 구현
 *      Object 는 모든 객체를 다 담을 수 있다. 타입이 다른 객체들을 어딘가에
 *      보관해야 한다면 Object에 보관하면 된다.
 */

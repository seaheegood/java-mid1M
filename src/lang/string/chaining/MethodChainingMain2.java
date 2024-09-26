package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        /**
         * add() 메서드는 자신의 참조값(this)를 반환한다.
         * 이 반환값을 adder1, 2, 3에 보관했다.
         * 따라서 adder, adder1, adder2, adder3 는 모두 같은 참조값을 사용한다.
         * 왜냐하면 add() 메서드가 자기 자신(this)의 참조값을 반환했기 때문이다.
         */
        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
    }
}

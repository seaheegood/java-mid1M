package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        /**
         * 메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반환된 참조값을 사용해서
         * 메서드 호출을 계속 이어갈 수 있다.
         * 마치 메서드가 체인으로 연결된 것 처럼 보인다.
         * 그래서 메서드 체이닝이라고 한다.
         *
         * 메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어준다.
         */
        System.out.println("result = " + result);
    }
}

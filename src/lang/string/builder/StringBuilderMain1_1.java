package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
    /**
     * StringBuilder 객체를 생성한다
     * append() 메서드 -> 여러 문자열을 추가
     * insert() 메서드 -> 특정 위치에 문자열 삽입
     * delete() 메서드 -> 특정 범위의 문자열을 삭제
     * reverse() 메서드 -> 문자열을 뒤집 (불변 아니라서 그냥 사용하면 바로 적용)
     * toString 메서드를 통해서 StringBuilder 의 결과를 기반으로 String을 생성해서 반환
     */

    /**
     * 가변(Mutable) vs 불변(Immutable)
     * String 은 불변하다. 즉, 한번 생성되면 그 내용을 변경할 수 없다.
     * 문자열에 변화를 주려고 할 때마다 새로운 String 객체가 생성되고, 기존 객체는 버려진다.
     * 이 과정에서 메모리와 처리 시간을 더 많이 소모한다.
     *
     * 반면에 StringBuilder 는 가변적이다. 하나의 StringBuilder 객체 안에서 문자열을 추가, 삭제, 수정할 수 있고,
     * 이 때마다 새로운 객체를 생성하지 않는다.
     * 이로 인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다. 단 사이드 이팩트에 주의해야한다.
     *
     * StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가 문자열이 변경이 끝나면 안전한(불면) String 으로 반환하는것이 좋다.
     */
}

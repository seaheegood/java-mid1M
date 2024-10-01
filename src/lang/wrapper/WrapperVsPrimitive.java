package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // Primitive long
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive = sumPrimitive + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum primitive : " + sumPrimitive);
        System.out.println("Primitive long total time: " + (endTime - startTime) + "ms");

        // Wrapper Class Long
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum Wrapper : " + sumPrimitive);
        System.out.println("Wrapper Class long total time: " + (endTime - startTime) + "ms");

        /**
         * 기본형은 메모리에서 그 크기만큼의 공간만을 차지,
         * 래퍼 클래스는 당연하게도 객체이기 때문에 내부에 필드로 가지고 있는 값 뿐만 아니라
         * 메타 데이터들도 포함하고 있기 때문에
         *
         * 기본형 연산이 월등히 빠름
         */
    }
}

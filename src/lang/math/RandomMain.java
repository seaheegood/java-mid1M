package lang.math;

import java.util.Random;

public class RandomMain {
    // new Random() 생성자를 비워두면 내부에서 여러가지 복잡한 알고리즘을 썪어서 씨드값을 생성 -> 반복실행해도 계속 랜덤한 결과 나옴
    // new Random(int seed) 생성자에 씨드값을 직접 넣어주면 계속해서 같은 결과가 나옴

    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(1); // seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();//0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);//0 ~ 9까지 출력
        System.out.println("0 ~ 9 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;//1 ~ 10까지 출력
        System.out.println("1 ~ 10 : " + randomRange2);
    }
}

package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 참조 값이 다르기에 false
        System.out.println("equality = " + (user1.equals(user2))); // false / why?
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
        //equals() 함수의 내부는 위오 같다. 기본 equals 함수는 == 연산자를 사용하기에 결과적으로 위의 == 연산자 사용과 결과 같다.
        //동등성을 비교하기 위해선 equals 함수를 overriding 해서 사용해야 한다.

    }
}

package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*
    //Object 의 equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //UserV2 의 동등성은 id로 비교한다.
        //equals() 는 Object 타입을 매개변수로 사용한다. -> 객체의 특정 값을 사용하려면 다운캐스팅 해야한다.
        return id.equals(user.id); //현재 인스턴스(this)에 있는 id 문자열과 비교 대상으로 넘어온 객체의 id 문자열을 비교
        //String 이라서 equals() 사용해야함
    }
*/

    //Generator 로 정확한 equals 구현

    /**
     * equals() 메서드를 구현할 때 지켜야하는 규칙
     * 반사성
     * 대칭성
     * 추이성
     * 일관성
     * null 에 대한 비교
     *
     * 그냥 IDE 로 사용하면 됨.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}

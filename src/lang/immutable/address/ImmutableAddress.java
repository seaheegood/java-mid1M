package lang.immutable.address;

public class ImmutableAddress {

    //객체 안의 상태가 바뀌지 않는다면 -> 불변객체다.
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public void setValue(String value) { // value 필드를 final 로 지정했기에 setter 사용 불가능
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
